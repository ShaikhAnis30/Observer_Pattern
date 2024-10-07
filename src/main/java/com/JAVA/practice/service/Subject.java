package com.JAVA.practice.service;

public interface Subject {

  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObserver();

}
