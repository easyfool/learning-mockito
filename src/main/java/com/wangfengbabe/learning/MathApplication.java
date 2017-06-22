package com.wangfengbabe.learning;

/**
 * Created by wangfeng on 21/05/2017.
 */
public class MathApplication {

  private CalculatorService calculatorService;

  public CalculatorService getCalculatorService() {
    return calculatorService;
  }

  public void setCalculatorService(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;
  }

  public double add(double input1, double input2) {
    return calculatorService.add(input1, input2);
  }

  public double substract(double input1, double input2) {
    return calculatorService.substract(input1, input2);
  }

  public double multiply(double input1, double input2) {
    return calculatorService.multiply(input1, input2);
  }

  public double divide(double input1, double input2) {
    return calculatorService.divide(input1, input2);
  }
}
