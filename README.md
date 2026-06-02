# 💱 Currency Converter  (Java Project)

A simple **Currency Converter System** built using Java that simulates currency exchange operations such as converting between different currencies with validation and error handling.
The project demonstrates core **Object-Oriented Programming (OOP)** principles 

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

```
src/
│
├── ConversionStrategy.java
├── CurrencyConverter.java
├── StandardConversionStrategy.java
├── Main.java
```

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone <repo-link>
```

2. Open the project in **IntelliJ IDEA** or any Java IDE.

3. Run `Main.java`.

---

🖥️ Program Flow Example
📌 Menu System
<img width="771" height="324" alt="Screenshot 2026-06-03 011427" src="https://github.com/user-attachments/assets/68f43f2c-01a3-4229-92f1-99e6ba53699b" />

📌 Successful Conversion
<img width="571" height="280" alt="Screenshot 2026-06-03 011438" src="https://github.com/user-attachments/assets/6a0fe200-b5e7-4590-8543-54a6c6fdf96b" />

<img width="705" height="270" alt="Screenshot 2026-06-03 011447" src="https://github.com/user-attachments/assets/ac56d1ae-42a1-4735-9cec-5eb869d17547" />

📌 Unsupported Currency Error
<img width="623" height="282" alt="Screenshot 2026-06-03 011455" src="https://github.com/user-attachments/assets/564eabda-b814-4860-a981-60a3a02d7a85" />

📌 Negative Amount Handling
<img width="662" height="278" alt="Screenshot 2026-06-03 011502" src="https://github.com/user-attachments/assets/542e2c29-946a-4e45-aa48-d38d298765db" />
