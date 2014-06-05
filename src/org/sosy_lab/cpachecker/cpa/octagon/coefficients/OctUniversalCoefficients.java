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
package org.sosy_lab.cpachecker.cpa.octagon.coefficients;

import org.sosy_lab.cpachecker.cpa.octagon.OctState;
import org.sosy_lab.cpachecker.cpa.octagon.values.OctInterval;
import org.sosy_lab.cpachecker.cpa.octagon.values.OctNumericValue;
import org.sosy_lab.cpachecker.util.octagon.NumArray;
import org.sosy_lab.cpachecker.util.octagon.OctagonManager;

@SuppressWarnings("rawtypes")
public final class OctUniversalCoefficients extends AOctCoefficients {

  public static final OctUniversalCoefficients INSTANCE = new OctUniversalCoefficients();

  private OctUniversalCoefficients() {
    super(0, null);
  }

  @Override
  public OctUniversalCoefficients expandToSize(int pSize, OctState oct) {
    return this;
  }

  @Override
  public int getVariableIndex() {
    throw new UnsupportedOperationException("Do only call this method on coefficients with exactly one value");
  }

  @Override
  public OctUniversalCoefficients add(IOctCoefficients pOther) {
    return INSTANCE;
  }

  @Override
  public OctUniversalCoefficients sub(IOctCoefficients pOther) {
    return INSTANCE;
  }

  @Override
  public IOctCoefficients mul(OctNumericValue pFactor) {
    return INSTANCE;
  }

  @Override
  public IOctCoefficients mul(OctInterval interval) {
    return INSTANCE;
  }

  @Override
  protected IOctCoefficients mulInner(IOctCoefficients pOct) {
    return INSTANCE;
  }

  @Override
  protected IOctCoefficients divInner(IOctCoefficients pOct) {
    return INSTANCE;
  }

  @Override
  public IOctCoefficients div(OctNumericValue pDivisor) {
    return INSTANCE;
  }

  @Override
  public IOctCoefficients div(OctInterval interval) {
    return INSTANCE;
  }

  @Override
  public NumArray getNumArray(OctagonManager manager) {
    return null;
  }

  @Override
  public boolean hasOnlyConstantValue() {
    return false;
  }

  @Override
  public boolean hasOnlyOneValue() {
    return false;
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof OctUniversalCoefficients;
  }

}