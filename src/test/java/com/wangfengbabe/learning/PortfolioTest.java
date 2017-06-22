package com.wangfengbabe.learning;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by wangfeng on 21/05/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class PortfolioTest {

  @InjectMocks
  private Portfolio portfolio;
  @Mock
  private StockService stockService;

  @Test
  public void testMarketValue() {
    Stock googleStock = new Stock("1", "Google", 10);
    Stock microsoftStock = new Stock("2", "Microsoft", 100);
    List<Stock> stocks = Arrays.asList(googleStock, microsoftStock);
    when(stockService.getPrice(googleStock)).thenReturn(50.00);
    when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);
    portfolio.setStocks(stocks);
    double marketValue = portfolio.getMarketValue();
    assertThat(marketValue, equalTo(100500.00));

  }


}