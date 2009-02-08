/*
 *  CPAchecker is a tool for configurable software verification.
 *  This file is part of CPAchecker. 
 *
 *  Copyright (C) 2007-2008  Dirk Beyer and Erkan Keremoglu.
 *  All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 *  CPAchecker web page:
 *    http://www.cs.sfu.ca/~dbeyer/CPAchecker/
 */
package cpa.defuse;

import java.util.List;

import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression;
import org.eclipse.cdt.core.dom.ast.IASTDeclarator;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTInitializer;
import org.eclipse.cdt.core.dom.ast.IASTUnaryExpression;

import cfa.objectmodel.CFAEdge;
import cfa.objectmodel.c.AssumeEdge;
import cfa.objectmodel.c.DeclarationEdge;
import cfa.objectmodel.c.MultiDeclarationEdge;
import cfa.objectmodel.c.MultiStatementEdge;
import cfa.objectmodel.c.StatementEdge;

import exceptions.CPATransferException;
import cpa.common.interfaces.AbstractElement;
import cpa.common.interfaces.AbstractElementWithLocation;
import cpa.common.interfaces.Precision;
import cpa.common.interfaces.TransferRelation;
import exceptions.CPAException;

public class DefUseTransferRelation implements TransferRelation
{
  private void handleExpression (DefUseElement defUseElement, IASTExpression expression, CFAEdge cfaEdge)
  {
    if (expression instanceof IASTBinaryExpression)
    {
      IASTBinaryExpression binaryExpression = (IASTBinaryExpression) expression;

      switch (binaryExpression.getOperator ())
      {
      case IASTBinaryExpression.op_assign:
      case IASTBinaryExpression.op_binaryAndAssign:
      case IASTBinaryExpression.op_binaryOrAssign:
      case IASTBinaryExpression.op_binaryXorAssign:
      case IASTBinaryExpression.op_divideAssign:
      case IASTBinaryExpression.op_minusAssign:
      case IASTBinaryExpression.op_moduloAssign:
      case IASTBinaryExpression.op_multiplyAssign:
      case IASTBinaryExpression.op_plusAssign:
      case IASTBinaryExpression.op_shiftLeftAssign:
      case IASTBinaryExpression.op_shiftRightAssign:
      {
        String lParam = binaryExpression.getOperand1 ().getRawSignature ();
        // String lParam2 = binaryExpression.getOperand2 ().getRawSignature ();

        DefUseDefinition definition = new DefUseDefinition (lParam, cfaEdge);
        defUseElement.update (definition);
      }
      }
    }
    else if (expression instanceof IASTUnaryExpression)
    {
      IASTUnaryExpression unaryExpression = (IASTUnaryExpression) expression;
      int operator = unaryExpression.getOperator ();
      if (operator == IASTUnaryExpression.op_postFixDecr || operator == IASTUnaryExpression.op_postFixIncr
          || operator == IASTUnaryExpression.op_prefixDecr || operator == IASTUnaryExpression.op_prefixIncr)
      {
        String lParam = unaryExpression.getOperand ().getRawSignature ();

        DefUseDefinition definition = new DefUseDefinition (lParam, cfaEdge);
        defUseElement.update (definition);
      }
    }
  }

  private void handleDeclaration (DefUseElement defUseElement, IASTDeclarator [] declarators, CFAEdge cfaEdge)
  {
    for (IASTDeclarator declarator : declarators)
    {
      IASTInitializer initializer = declarator.getInitializer ();
      if (initializer != null)
      {
        String varName = declarator.getName ().getRawSignature ();
        DefUseDefinition definition = new DefUseDefinition (varName, cfaEdge);

        defUseElement.update (definition);
      }
    }
  }

  public AbstractElement getAbstractSuccessor (AbstractElement element, CFAEdge cfaEdge, Precision prec) throws CPATransferException
  {
    DefUseElement defUseElement = (DefUseElement) element;

    switch (cfaEdge.getEdgeType ())
    {
    case StatementEdge:
    {
      defUseElement = defUseElement.clone ();

      StatementEdge statementEdge = (StatementEdge) cfaEdge;
      IASTExpression expression = statementEdge.getExpression ();
      //System.out.println("Statement Edge = " + expression.getRawSignature());
      handleExpression (defUseElement, expression, cfaEdge);
      break;
    }
    case MultiStatementEdge:
    {
      defUseElement = defUseElement.clone ();
      MultiStatementEdge multiStatementEdge = (MultiStatementEdge) cfaEdge;

      for (IASTExpression expression : multiStatementEdge.getExpressions ())
        handleExpression (defUseElement, expression, cfaEdge);

      break;
    }
    case DeclarationEdge:
    {
      defUseElement = defUseElement.clone ();

      DeclarationEdge declarationEdge = (DeclarationEdge) cfaEdge;
      IASTDeclarator [] declarators = declarationEdge.getDeclarators ();
      // System.out.println("Decleration Edge = " + declarationEdge.getRawStatement());
      handleDeclaration (defUseElement, declarators, cfaEdge);
      break;
    }

    case AssumeEdge:
    {
      AssumeEdge assumeEdge = (AssumeEdge) cfaEdge;
      System.out.println("Assume Edge = " + assumeEdge.getRawStatement());
      break;
    }

    case MultiDeclarationEdge:
    {
      defUseElement = defUseElement.clone ();
      MultiDeclarationEdge multiDeclarationEdge = (MultiDeclarationEdge) cfaEdge;

      for (IASTDeclarator [] declarators : multiDeclarationEdge.getDeclarators ())
        handleDeclaration (defUseElement, declarators, cfaEdge);

      break;
    }
    }

    return defUseElement;
  }

  public List<AbstractElementWithLocation> getAllAbstractSuccessors (AbstractElementWithLocation element, Precision prec) throws CPAException, CPATransferException
  {
    throw new CPAException ("Cannot get all abstract successors from non-location domain");
  }
}
