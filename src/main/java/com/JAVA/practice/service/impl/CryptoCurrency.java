package com.JAVA.practice.service.impl;

import com.JAVA.practice.service.Observer;
import com.JAVA.practice.service.Subject;
import java.util.ArrayList;
import java.util.List;

public class CryptoCurrency implements Subject {
  private List<Observer> observers;
  private float price;

  public CryptoCurrency() {
    this.observers = new ArrayList<>();
  }


  public void setPrice(float price) {
    this.price = price;
    notifyObserver();
  }

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObserver() {
    for (Observer observer : observers) {
      observer.priceUpdate(price);
    }
  }
}
