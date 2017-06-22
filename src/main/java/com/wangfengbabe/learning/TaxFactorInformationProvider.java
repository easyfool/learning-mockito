package com.wangfengbabe.learning;

/**
 * Created by wangfeng on 20/05/2017.
 */
public class TaxFactorInformationProvider {

  private TaxService taxService;

  public TaxFactorInformationProvider(TaxService taxService) {
    this.taxService = taxService;
  }

  public String formatIrsAddress(Person person) {
    String irsAddress = person.getInternalRevenueServiceAddress(person.getCountryName());
    return "IRS:[" + irsAddress + "]";
  }
}
