package com.JAVA.practice;

import com.JAVA.practice.service.impl.Binance;
import com.JAVA.practice.service.impl.CryptoCurrency;
import com.JAVA.practice.service.impl.GateIO;
import com.JAVA.practice.service.impl.MEXC;

public class Main {

  public static void main(String[] args) {
    Binance binance = new Binance();
    MEXC mexc = new MEXC();

    CryptoCurrency cryptoCurrency = new CryptoCurrency();

    cryptoCurrency.addObserver(binance);
    cryptoCurrency.addObserver(mexc);

    cryptoCurrency.setPrice(20.45f);

    GateIO gateIO = new GateIO();
    cryptoCurrency.addObserver(gateIO);


    cryptoCurrency.setPrice(44.17f);

    cryptoCurrency.removeObserver(mexc);

    cryptoCurrency.setPrice(36.771f);
  }
}