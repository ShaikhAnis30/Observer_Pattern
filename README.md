# Observer_Pattern

Observer Pattern in Java
This project demonstrates the implementation of the Observer Pattern in Java using a cryptocurrency
price update scenario. The Observer Pattern allows objects (Observers) to subscribe to events from
another object (Subject) and get notified when changes occur.

Overview
Subject (CryptoCurrency): The subject maintains a list of observers and notifies them when a
cryptocurrency price changes.
Observers (Binance, GateIO, MEXC): The observers receive updates about the price changes and respond
accordingly.

Classes
Observer Interface: Defines the priceUpdate() method for receiving updates.
Subject Interface: Defines methods to add, remove, and notify observers.
CryptoCurrency: The concrete subject that manages observers and notifies them of price changes.
Binance, GateIO, MEXC: Concrete observer classes that implement the Observer interface.

How It Works
Observers (e.g., Binance, MEXC) are added to the subject (CryptoCurrency).
When the price changes, the subject calls notifyObserver() to update all registered observers.
Observers receive the price update through their priceUpdate() method and act upon it.

Example Usage
In the Main class:
We create instances of Binance, MEXC, and GateIO observers.
They are added to the CryptoCurrency subject to receive price updates.
We demonstrate adding/removing observers and notifying them with updated cryptocurrency prices.