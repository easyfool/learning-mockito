package com.wangfengbabe.learning;

/**
 * Created by wangfeng on 20/05/2017.
 */
public class TaxFactorCalculator {


  private Calculator calculator;

  public TaxFactorCalculator(Calculator calculator) {
    this.calculator = calculator;
  }

  public TaxFactorCalculator() {
  }

  public double calculateSum(double taxFactorOne, double taxFactorTwo) {

    return calculator.add(taxFactorOne, taxFactorTwo);

  }

}
