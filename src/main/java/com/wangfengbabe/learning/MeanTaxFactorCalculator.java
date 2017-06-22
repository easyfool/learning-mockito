package com.wangfengbabe.learning;

/**
 * Created by wangfeng on 20/05/2017.
 */
public class MeanTaxFactorCalculator {

  private final TaxService taxService;

  public MeanTaxFactorCalculator(TaxService taxService) {
    this.taxService = taxService;
  }

  public double calculateMeanTaxFactorFor(Person person) {
    double currentTaxFactor = taxService.getCurrentTaxFactorFor(person);
    double anotherTaxFactor = taxService.getCurrentTaxFactorFor(person);
    return (currentTaxFactor + anotherTaxFactor) / 2;

  }

}
