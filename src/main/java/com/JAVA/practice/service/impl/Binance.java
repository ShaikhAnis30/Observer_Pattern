package com.JAVA.practice.service.impl;

import com.JAVA.practice.service.Observer;
import lombok.Data;

@Data
public class Binance implements Observer {

  public final String name = "Binance";
  @Override
  public void priceUpdate(float price) {
    System.out.println("hey " + name + " price of cryptocurrency is updated to : " + price);
  }
}
