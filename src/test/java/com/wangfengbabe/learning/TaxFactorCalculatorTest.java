package com.wangfengbabe.learning;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by wangfeng on 20/05/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class TaxFactorCalculatorTest {

  @Mock
  private Calculator calculator;
  @InjectMocks
  private TaxFactorCalculator taxFactorCalculator;

  @Test
  public void testCalculateSumShouldReturnSumOfFactors() throws Exception {
    double factor1 = 1;
    double factor2 = 2;
    when(calculator.add(1, 2)).thenReturn(3.0);
    assertThat(taxFactorCalculator.calculateSum(factor1, factor2), equalTo(3.0));
  }

}