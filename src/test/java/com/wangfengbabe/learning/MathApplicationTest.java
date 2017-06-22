package com.wangfengbabe.learning;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by wangfeng on 21/05/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Mock
  private CalculatorService calculatorService;
  @InjectMocks
  private MathApplication mathApplication;

  @Test
  public void testAdd() {
    when(calculatorService.add(10.0, 20.0)).thenReturn(30.0);
    assertThat(mathApplication.add(10.0, 20.0), equalTo(30.0));
    verify(calculatorService).add(10.0, 20.0);
    //verify(calculatorService).add(20.0, 10.0);
  }

  @Test
  public void testSubstract() {
    when(calculatorService.substract(30.0, 20.0)).thenReturn(10.0);
    assertThat(mathApplication.substract(30.0, 20.0), equalTo(10.0));
  }

  @Test
  public void testMultiply() {
    when(calculatorService.add(10.0, 20.0)).thenReturn(200.0);
    assertThat(mathApplication.add(10.0, 20.0), equalTo(200.0));
  }

  @Test
  public void testDivide() {
    when(calculatorService.divide(20.0, 5.0)).thenReturn(4.0);
    assertThat(mathApplication.divide(20.0, 5.0), equalTo(4.0));
  }

  @Test
  public void testThrowException() {
    doThrow(new RuntimeException("Add operation not implemented")).when(calculatorService).add(10.0, 20.0);
    expectedException.expect(RuntimeException.class);
    expectedException.expectMessage("Add operation not implemented");
    mathApplication.add(10.0, 20.0);
  }

}