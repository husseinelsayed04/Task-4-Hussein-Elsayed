<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ATM System Project</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f5f6fa;
            margin: 0;
            padding: 30px;
            color: #222;
        }

        .container {
            max-width: 1000px;
            margin: auto;
            background: white;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }

        h1, h2, h3 {
            color: #2c3e50;
        }

        ul {
            line-height: 1.8;
        }

        pre {
            background: #f1f1f1;
            padding: 15px;
            border-radius: 8px;
            overflow-x: auto;
        }

        img {
            width: 80%;
            border-radius: 10px;
            margin: 10px 0;
            box-shadow: 0 0 10px rgba(0,0,0,0.2);
        }

        .center {
            text-align: center;
        }

        .section {
            margin-bottom: 30px;
        }

        .box {
            padding: 15px;
            border-left: 5px solid #3498db;
            background: #f8f9fa;
            margin-bottom: 15px;
        }
    </style>
</head>

<body>

<div class="container">

    <h1>🏧 ATM System - Java OOP Project</h1>

    <p>
        A simple <b>ATM System</b> built using Java that simulates basic banking operations such as depositing money,
        withdrawing money, and checking account balance. The project demonstrates core Object-Oriented Programming (OOP) principles.
    </p>

    <div class="section">
        <h2>🚀 Features</h2>
        <ul>
            <li>Deposit money into account</li>
            <li>Withdraw money with validation</li>
            <li>Check current balance</li>
            <li>Handle invalid inputs</li>
            <li>Prevent overdraft (Insufficient balance check)</li>
            <li>Menu-driven console interface</li>
        </ul>
    </div>

    <div class="section">
        <h2>🧠 OOP Concepts Used</h2>

        <div class="box">Encapsulation → balance is private inside BankAccount</div>
        <div class="box">Abstraction → Using Account and ATMService interfaces</div>
        <div class="box">Polymorphism → Using interface references instead of concrete classes</div>
        <div class="box">Dependency Injection → Passing objects through constructors</div>
        <div class="box">Loose Coupling → ATM depends on interfaces not implementations</div>
    </div>

    <div class="section">
        <h2>🏗️ Project Structure</h2>
        <pre>
src/
│
├── Account.java
├── BankAccount.java
├── ATMService.java
├── ATMServiceImpl.java
├── ATM.java
└── Main.java
        </pre>
    </div>

    <div class="section">
        <h2>▶️ How to Run</h2>
        <ol>
            <li>Clone the repository: <pre>git clone &lt;repo-link&gt;</pre></li>
            <li>Open in IntelliJ IDEA or any Java IDE</li>
            <li>Run <b>Main.java</b></li>
        </ol>
    </div>

    <div class="section">
        <h2>🖥️ Program Flow Example</h2>

        <h3>📌 Check Balance</h3>
        <div class="center">
            <img src="https://github.com/user-attachments/assets/680281ad-42fb-4eff-bf08-8f4339f1991c">
        </div>

        <h3>📌 Deposit Money</h3>
        <div class="center">
            <img src="https://github.com/user-attachments/assets/0b8db777-084d-406b-96c8-b7285c1b10f7">
        </div>

        <h3>📌 Withdraw Money</h3>
        <div class="center">
            <img src="https://github.com/user-attachments/assets/1c310c33-3993-4dec-8432-667fb03f5a61">
        </div>

        <h3>📌 Insufficient Balance Handling</h3>
        <div class="center">
            <img src="https://github.com/user-attachments/assets/b8981e52-1576-4e38-a533-99f5e0a00fe3">
        </div>
    </div>

    <div class="section">
        <h2>📌 Example Output</h2>
        <pre>
===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit

Enter choice: 3
Current Balance: 1000.0

Enter choice: 1
Enter amount: 4000
Deposit successful.

Enter choice: 3
Current Balance: 5000.0

Enter choice: 2
Enter amount: 5000
Withdrawal successful.

Enter choice: 3
Current Balance: 0.0

Enter choice: 2
Enter amount: 1000
Insufficient balance!
        </pre>
    </div>

    <div class="section">
        <h2>⭐ Future Improvements</h2>
        <ul>
            <li>Add multiple accounts</li>
            <li>Add login system (PIN)</li>
            <li>Save data to file or database</li>
            <li>GUI version (JavaFX / Swing)</li>
        </ul>
    </div>

</div>

</body>
</html>
