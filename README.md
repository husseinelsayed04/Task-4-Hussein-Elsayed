<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Currency Converter Project</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            background-color: #f7f7f7;
            color: #222;
        }

        h1, h2 {
            color: #2c3e50;
        }

        .container {
            background: white;
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
        }

        .section {
            margin-bottom: 30px;
        }

        ul {
            line-height: 1.8;
        }

        img {
            width: 80%;
            border-radius: 10px;
            margin: 10px 0;
            box-shadow: 0px 0px 8px rgba(0,0,0,0.2);
        }

        .center {
            text-align: center;
        }
    </style>

</head>

<body>

<div class="container">

    <h1>💱 Currency Converter (Java Project)</h1>

    <p>
        A simple Currency Converter System built using Java that simulates currency exchange operations
        with validation and error handling. The project demonstrates core Object-Oriented Programming (OOP)
        principles and Strategy Design Pattern.
    </p>

    <div class="section">
        <h2>🚀 Features</h2>
        <ul>
            <li>Convert between supported currencies</li>
            <li>Interactive menu-driven system</li>
            <li>Input validation (negative values, invalid currencies)</li>
            <li>Handle unsupported currency pairs</li>
            <li>Continuous loop until exit</li>
            <li>Case-insensitive input support</li>
        </ul>
    </div>

    <div class="section">
        <h2>🧠 OOP Concepts Used</h2>
        <ul>
            <li>Encapsulation → CurrencyConverter hides rate logic internally</li>
            <li>Abstraction → ConversionStrategy interface</li>
            <li>Polymorphism → Multiple conversion strategies possible</li>
            <li>Dependency Injection → Strategy injected into converter</li>
            <li>Loose Coupling → Depends on interface not implementation</li>
        </ul>
    </div>

    <div class="section">
        <h2>🏗️ Project Structure</h2>
        <pre>
src/
├── ConversionStrategy.java
├── CurrencyConverter.java
├── StandardConversionStrategy.java
├── Main.java
        </pre>
    </div>

    <div class="section">
        <h2>🖥️ Program Screenshots</h2>

        <h3>📌 Menu System</h3>
        <div class="center">
            <img src="https://github.com/user-attachments/assets/68f43f2c-01a3-4229-92f1-99e6ba53699b">
        </div>

        <h3>📌 Successful Conversion</h3>
        <div class="center">
            <img src="https://github.com/user-attachments/assets/6a0fe200-b5e7-4590-8543-54a6c6fdf96b">
            <img src="https://github.com/user-attachments/assets/ac56d1ae-42a1-4735-9cec-5eb869d17547">
        </div>

        <h3>📌 Unsupported Currency Error</h3>
        <div class="center">
            <img src="https://github.com/user-attachments/assets/564eabda-b814-4860-a981-60a3a02d7a85">
        </div>

        <h3>📌 Negative Amount Handling</h3>
        <div class="center">
            <img src="https://github.com/user-attachments/assets/542e2c29-946a-4e45-aa48-d38d298765db">
        </div>
    </div>

    <div class="section">
        <h2>👨‍💻 Developer</h2>
        <p><b>Hussein Elsayed</b><br>Java Developer Intern</p>
    </div>

</div>

</body>
</html>
