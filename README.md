<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Currency Converter Project</title>
</head>

<body>

<h1>💱 Currency Converter - Java Project</h1>

<p>
A simple <b>Currency Converter System</b> built using Java that simulates currency exchange operations such as converting between different currencies with validation and error handling.
The project demonstrates core <b>Object-Oriented Programming (OOP)</b> principles and <b>Strategy Design Pattern</b>.
</p>

---

<h2>🚀 Features</h2>

<ul>
    <li>Convert between supported currencies</li>
    <li>Interactive menu-driven console system</li>
    <li>Input validation (negative values, invalid currencies)</li>
    <li>Handle unsupported currency pairs</li>
    <li>Continuous loop until exit</li>
    <li>Case-insensitive input support</li>
    <li>Strategy Pattern for flexible conversion logic</li>
</ul>

---

<h2>🧠 OOP Concepts Used</h2>

<ul>
    <li><b>Encapsulation</b> → CurrencyConverter hides rate logic internally</li>
    <li><b>Abstraction</b> → Using ConversionStrategy interface</li>
    <li><b>Polymorphism</b> → Different strategies can be used for conversion</li>
    <li><b>Dependency Injection</b> → Strategy injected into CurrencyConverter</li>
    <li><b>Loose Coupling</b> → Converter depends on interface not implementation</li>
</ul>

---

<h2>🏗️ Project Structure</h2>

<pre>
src/
│
├── Main.java
├── CurrencyConverter.java
├── ConversionStrategy.java
├── StandardConversionStrategy.java
</pre>

---

<h2>▶️ How to Run</h2>

<ol>
    <li>Clone the repository: git clone &lt;repo-link&gt;</li>
    <li>Open the project in IntelliJ IDEA or any Java IDE</li>
    <li>Run Main.java</li>
</ol>

---

<h2>🖥️ Program Flow Example</h2>

<h3>📌 Menu System</h3>
<img src="https://github.com/user-attachments/assets/68f43f2c-01a3-4229-92f1-99e6ba53699b">

<h3>📌 Successful Conversion</h3>
<img src="https://github.com/user-attachments/assets/6a0fe200-b5e7-4590-8543-54a6c6fdf96b">

<img src="https://github.com/user-attachments/assets/ac56d1ae-42a1-4735-9cec-5eb869d17547">

<h3>📌 Unsupported Currency Error</h3>
<img src="https://github.com/user-attachments/assets/564eabda-b814-4860-a981-60a3a02d7a85">

<h3>📌 Negative Amount Handling</h3>
<img src="https://github.com/user-attachments/assets/542e2c29-946a-4e45-aa48-d38d298765db">

---

<h2>📌 Example Output</h2>

<pre>
=== Currency Converter ===
1. Convert Currency
2. Show Supported Rates
3. Exit

Choose option: 1
From Currency: USD
To Currency: EGP
Amount: 100

100.00 USD = 5000.00 EGP

---

Choose option: 2

Supported currencies:
USD ↔ EGP
EUR ↔ EGP
EGP ↔ USD
EGP ↔ EUR

---

Choose option: 1
From Currency: JPY
To Currency: EGP
Amount: 100

Error: Currency conversion not supported

---

Choose option: 1
From Currency: EGP
To Currency: USD
Amount: -1000

Error: Amount must be positive
</pre>

---

<h2>⭐ Future Improvements</h2>

<ul>
    <li>Add more currencies dynamically</li>
    <li>Fetch live exchange rates from API</li>
    <li>Add transaction history</li>
    <li>Save conversions to file/database</li>
    <li>GUI version (JavaFX / Swing)</li>
</ul>

</body>
</html>
