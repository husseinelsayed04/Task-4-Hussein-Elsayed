<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Currency Converter Project</title>
</head>
<body>

<h1>💱 Currency Converter (Java Project)</h1>

<p>
A simple Currency Converter System built using Java that simulates currency exchange operations such as converting between different currencies with validation and error handling.
The project demonstrates core Object-Oriented Programming (OOP) principles.
</p>

<h2>🚀 Features</h2>
<ul>
    <li>Convert between supported currencies</li>
    <li>Interactive menu-driven console system</li>
    <li>Input validation (negative values, invalid currencies)</li>
    <li>Handle unsupported currency pairs</li>
    <li>Continuous loop until exit</li>
    <li>Case-insensitive input support</li>
</ul>

<h2>🧠 OOP Concepts Used</h2>
<ul>
    <li>Encapsulation → CurrencyConverter hides rate logic internally</li>
    <li>Abstraction → Using ConversionStrategy interface</li>
    <li>Polymorphism → Different strategies can be used for conversion</li>
    <li>Dependency Injection → Strategy injected into CurrencyConverter</li>
    <li>Loose Coupling → Converter depends on interface not implementation</li>
</ul>

<h2>🏗️ Project Structure</h2>
<pre>
src/
├── ConversionStrategy.java
├── CurrencyConverter.java
├── StandardConversionStrategy.java
├── Main.java
</pre>

<h2>▶️ How to Run</h2>
<p>
Clone the repository, open it in IntelliJ IDEA or any Java IDE, then run <b>Main.java</b>.
</p>

<h2>🖥️ Program Flow Example</h2>
<p>
Menu System, Successful Conversion, Unsupported Currency Error, and Negative Amount Handling are demonstrated using attached screenshots in the repository.
</p>

<h2>👨‍💻 Developer</h2>
<p>
Hussein Elsayed <br>
Java Developer Intern
</p>

</body>
</html>
