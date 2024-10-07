package com.JAVA.practice.service.impl;

import com.JAVA.practice.service.Observer;
import lombok.Data;

@Data
public class MEXC implements Observer {

  public final String name = "MEXC";
  @Override
  public void priceUpdate(float price) {
    System.out.println("hey " + name + " price of cryptocurrency is updated to : " + price);
  }
}
