<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ATM System Project</title>
</head>

<body>

<h1>🏧 ATM System - Java OOP Project</h1>

<p>
A simple <b>ATM System</b> built using Java that simulates basic banking operations such as depositing money, withdrawing money, and checking account balance.
The project demonstrates core <b>Object-Oriented Programming (OOP)</b> principles.
</p>

---

<h2>🚀 Features</h2>

<ul>
    <li>Deposit money into account</li>
    <li>Withdraw money with validation</li>
    <li>Check current balance</li>
    <li>Handle invalid inputs</li>
    <li>Prevent overdraft (Insufficient balance check)</li>
    <li>Menu-driven console interface</li>
</ul>

---

<h2>🧠 OOP Concepts Used</h2>

<ul>
    <li><b>Encapsulation</b> → balance is private inside BankAccount</li>
    <li><b>Abstraction</b> → Using Account and ATMService interfaces</li>
    <li><b>Polymorphism</b> → Using interface references instead of concrete classes</li>
    <li><b>Dependency Injection</b> → Passing objects through constructors</li>
    <li><b>Loose Coupling</b> → ATM depends on interfaces not implementations</li>
</ul>

---

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

---

<h2>▶️ How to Run</h2>

<ol>
    <li>Clone the repository: git clone &lt;repo-link&gt;</li>
    <li>Open the project in IntelliJ IDEA or any Java IDE</li>
    <li>Run Main.java</li>
</ol>

---

<h2>🖥️ Program Flow Example</h2>

<h3>📌 Check Balance</h3>
<img src="https://github.com/user-attachments/assets/680281ad-42fb-4eff-bf08-8f4339f1991c">

<h3>📌 Deposit Money</h3>
<img src="https://github.com/user-attachments/assets/0b8db777-084d-406b-96c8-b7285c1b10f7">

<h3>📌 Withdraw Money</h3>
<img src="https://github.com/user-attachments/assets/1c310c33-3993-4dec-8432-667fb03f5a61">

<h3>📌 Insufficient Balance Handling</h3>
<img src="https://github.com/user-attachments/assets/b8981e52-1576-4e38-a533-99f5e0a00fe3">

---

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

---

<h2>⭐ Future Improvements</h2>

<ul>
    <li>Add multiple accounts</li>
    <li>Add login system (PIN)</li>
    <li>Save data to file or database</li>
    <li>GUI version (JavaFX / Swing)</li>
</ul>

</body>
</html>
