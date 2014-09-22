/*
 *  CPAchecker is a tool for configurable software verification.
 *  This file is part of CPAchecker.
 *
 *  Copyright (C) 2007-2014  Dirk Beyer
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
 *    http://cpachecker.sosy-lab.org
 */
package org.sosy_lab.cpachecker.util.predicates.princess;

import org.sosy_lab.cpachecker.core.counterexample.Model.TermType;
import org.sosy_lab.cpachecker.util.predicates.interfaces.basicimpl.AbstractFormulaCreator;

import ap.parser.IExpression;

class PrincessFormulaCreator extends AbstractFormulaCreator<IExpression, TermType, PrincessEnvironment> {

  PrincessFormulaCreator(
          PrincessEnvironment pEnv,
          TermType pBoolType,
          TermType pIntegerType) {
    super(pEnv, pBoolType, pIntegerType, null);
  }

  @Override
  public IExpression makeVariable(TermType type, String varName) {
    return getEnv().makeVariable(type, varName);
  }

  @Override
  public TermType getRealType() {
    throw new UnsupportedOperationException("Rational theory is not supported by Princess");
  }

  @Override
  public TermType getBittype(int pBitwidth) {
    throw new UnsupportedOperationException("Bitvector theory is not supported by Princess");
  }
}