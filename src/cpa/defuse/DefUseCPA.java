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

import java.util.ArrayList;
import java.util.List;

import cfa.objectmodel.CFAFunctionDefinitionNode;
import cfa.objectmodel.c.FunctionDefinitionNode;

import cpa.common.interfaces.AbstractDomain;
import cpa.common.interfaces.AbstractElement;
import cpa.common.interfaces.ConfigurableProgramAnalysis;
import cpa.common.interfaces.MergeOperator;
import cpa.common.interfaces.Precision;
import cpa.common.interfaces.PrecisionAdjustment;
import cpa.common.interfaces.StopOperator;
import cpa.common.interfaces.TransferRelation;
import cpa.defuse.DefUseDefinition;
import cpa.defuse.DefUseDomain;
import cpa.defuse.DefUseElement;
import cpa.defuse.DefUseMergeJoin;
import cpa.defuse.DefUseMergeSep;
import cpa.defuse.DefUseStopJoin;
import cpa.defuse.DefUseStopSep;
import cpa.defuse.DefUseTransferRelation;
import exceptions.CPAException;

public class DefUseCPA implements ConfigurableProgramAnalysis{

  private AbstractDomain abstractDomain;
  private TransferRelation transferRelation;
  private MergeOperator mergeOperator;
  private StopOperator stopOperator;
  private PrecisionAdjustment precisionAdjustment;


  public DefUseCPA (String mergeType, String stopType) throws CPAException{
    DefUseDomain defUseDomain = new DefUseDomain ();
    this.abstractDomain = defUseDomain;

    this.transferRelation = new DefUseTransferRelation ();

    this.mergeOperator = null;
    if(mergeType.equals("sep")){
      this.mergeOperator = new DefUseMergeSep ();
    } else if(mergeType.equals("join")){
      this.mergeOperator = new DefUseMergeJoin ();
    }

    this.stopOperator = null;
    if(stopType.equals("sep")){
      this.stopOperator = new DefUseStopSep (defUseDomain);
    } else if(stopType.equals("join")){
      this.stopOperator = new DefUseStopJoin ();
    }

    this.precisionAdjustment = new DefUsePrecisionAdjustment ();
  }

  public AbstractDomain getAbstractDomain ()
  {
    return abstractDomain;
  }

  public TransferRelation getTransferRelation ()
  {
    return transferRelation;
  }

  public MergeOperator getMergeOperator ()
  {
    return mergeOperator;
  }

  public StopOperator getStopOperator ()
  {
    return stopOperator;
  }

  public PrecisionAdjustment getPrecisionAdjustment() {
    return precisionAdjustment;
  }


  public AbstractElement getInitialElement (CFAFunctionDefinitionNode node)
  {
    List<DefUseDefinition> defUseDefinitions = null;
    if (node instanceof FunctionDefinitionNode)
    {
      List<String> parameterNames = ((FunctionDefinitionNode)node).getFunctionParameterNames ();
      defUseDefinitions = new ArrayList<DefUseDefinition> ();

      for (String parameterName : parameterNames)
      {
        DefUseDefinition newDef = new DefUseDefinition (parameterName, null);
        defUseDefinitions.add (newDef);
      }
    }

    return new DefUseElement (defUseDefinitions);
  }

  public Precision getInitialPrecision(CFAFunctionDefinitionNode pNode) {
    return new DefUsePrecision();
  }
}
