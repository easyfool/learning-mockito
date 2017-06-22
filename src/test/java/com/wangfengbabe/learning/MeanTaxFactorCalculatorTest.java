package com.wangfengbabe.learning;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
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
public class MeanTaxFactorCalculatorTest {

  static final double TAX_FACTOR = 10;
  @Mock
  TaxService taxService;
  @InjectMocks
  MeanTaxFactorCalculator meanTaxFactorCalculator;


  @Test
  public void calculateMeanTaxFactorFor() throws Exception {
    when(taxService.getCurrentTaxFactorFor(any(Person.class))).thenReturn(TAX_FACTOR);
    assertThat(meanTaxFactorCalculator.calculateMeanTaxFactorFor(new Person()), equalTo(TAX_FACTOR));
  }

}