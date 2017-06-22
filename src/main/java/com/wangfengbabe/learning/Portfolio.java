package com.wangfengbabe.learning;

import java.util.List;

/**
 * Created by wangfeng on 21/05/2017.
 */
public class Portfolio {

  private StockService stockService;
  private List<Stock> stocks;

  public StockService getStockService() {
    return stockService;
  }

  public void setStockService(StockService stockService) {
    this.stockService = stockService;
  }

  public List<Stock> getStocks() {
    return stocks;
  }

  public void setStocks(List<Stock> stocks) {
    this.stocks = stocks;
  }

  public double getMarketValue() {
    double marketValue = 0.0;
    for (Stock stock : stocks) {
      marketValue += stockService.getPrice(stock) * stock.getQuantity();
    }
    return marketValue;
  }


  public Portfolio() {
  }
}
