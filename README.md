# 💱 Currency Converter  (Java Project)

A simple **Currency Converter System** built using Java that simulates currency exchange operations such as converting between different currencies with validation and error handling.
The project demonstrates core **Object-Oriented Programming (OOP)** principles and the **Strategy Design Pattern**.

---

## 🚀 Features

* 💱 Convert between supported currencies
* 📋 Interactive menu-driven console system
* ⚠️ Input validation (negative values, invalid currencies)
* ❌ Handle unsupported currency pairs
* 🔁 Continuous loop until exit
* 🔤 Case-insensitive input support

---

## 🧠 OOP Concepts Used

This project demonstrates:

* **Encapsulation** → CurrencyConverter hides rate logic internally
* **Abstraction** → Using `ConversionStrategy` interface
* **Polymorphism** → Different strategies can be used for conversion
* **Dependency Injection** → Strategy injected into CurrencyConverter
* **Loose Coupling** → Converter depends on interface not implementation

---

## 🏗️ Project Structure
src/
│
├── Main.java
├── CurrencyConverter.java
├── ConversionStrategy.java
├── StandardConversionStrategy.java

