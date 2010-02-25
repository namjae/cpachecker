package cpa.art;

import cpa.common.interfaces.AbstractElement;
import cpa.common.interfaces.ConfigurableProgramAnalysis;
import cpa.common.interfaces.MergeOperator;
import cpa.common.interfaces.Precision;
import exceptions.CPAException;

public class ARTMergeJoin implements MergeOperator {

  private ConfigurableProgramAnalysis wrappedCpa;

  public ARTMergeJoin(ConfigurableProgramAnalysis pWrappedCPA) {
    wrappedCpa = pWrappedCPA;
  }

  @Override
  public AbstractElement merge(AbstractElement pElement1,
      AbstractElement pElement2, Precision pPrecision) throws CPAException {
    
    ARTElement artElement1 = (ARTElement)pElement1;
    ARTElement artElement2 = (ARTElement)pElement2;

    // covered elements are not in the reached set
    assert !artElement1.isCovered();
    assert !artElement2.isCovered();
    
    MergeOperator mergeOperator = wrappedCpa.getMergeOperator();
    AbstractElement wrappedElement1 = artElement1.getAbstractElementOnArtNode();
    AbstractElement wrappedElement2 = artElement2.getAbstractElementOnArtNode();
    AbstractElement retElement = mergeOperator.merge(wrappedElement1, wrappedElement2, pPrecision);
    if(retElement.equals(wrappedElement2)){
      return pElement2;
    }

    ARTElement mergedElement = new ARTElement(retElement, null);

    // now replace artElement2 by mergedElement in ART
    
    for (ARTElement parentOfElement1 : artElement1.getParents()) {
      mergedElement.addParent(parentOfElement1);
    }
  
    for (ARTElement parentOfElement2 : artElement2.getParents()) {
      mergedElement.addParent(parentOfElement2);
    }
    
    // artElement1 is the current successor, it does not have any children yet
    assert artElement1.getChildren().isEmpty();
    
    for (ARTElement childOfElement2 : artElement2.getChildren()) {
      childOfElement2.addParent(mergedElement);
    }
  
    // artElement1 will only be removed from ART if stop(e1, reached) returns true
    artElement2.removeFromART();

    artElement1.setMergedWith(mergedElement);
    return mergedElement;
  }
}
