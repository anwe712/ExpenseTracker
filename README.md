# 💸 Expense Tracker (Java + SQLite)

A simple command-line based Expense Tracker built in Java using SQLite. This project allows users to register/login, add expenses, set monthly budgets, and view a spending summary — all managed via a local database.

---

## 🧰 Features

- 👤 User Authentication (Signup/Login)
- 💵 Add and categorize daily expenses
- 📊 View all saved expenses
- 🎯 Set and monitor a monthly budget
- 🧾 Generate a spending summary
- 🗃️ Local SQLite database (no external server needed)

---

## 🛠 Tech Stack

| Layer      | Technology               |
| ---------- | ------------------------ |
| Language   | Java                     |
| Database   | SQLite                   |
| IDE        | VS Code                  |
| Build Tool | (Optional) javac/jar CLI |
| JDBC       | SQLite JDBC Driver       |

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/yourusername/ExpenseTracker.git
cd ExpenseTracker
2. Compile the code
bash
Copy
Edit
javac -cp ".:sqlite-jdbc-<version>.jar" src/*.java
3. Run the app
bash
Copy
Edit
java -cp ".:sqlite-jdbc-<version>.jar:src" Main
📦 You can also build a .jar using:

bash
Copy
Edit
jar cfe ExpenseTracker.jar Main -C src .
java -cp "ExpenseTracker.jar:sqlite-jdbc-<version>.jar" Main
🖼 Screenshots

Main Menu - Terminal Interface


Monthly Summary Display

📁 Project Structure
css
Copy
Edit
ExpenseTracker/
├── src/
│   ├── Main.java
│   ├── DBConnector.java
│   ├── ExpenseManager.java
│   ├── User.java
├── expense_tracker.db
├── sqlite-jdbc-<version>.jar
└── README.md
📌 To-Do (Future Enhancements)
✅ CLI functionality (Completed)

⬜ JavaFX GUI frontend

⬜ REST API with Spring Boot

⬜ React-based web frontend

⬜ Hosting on Netlify + Render

🧑‍💻 Author
Your Name
GitHub • LinkedIn

📜 License
MIT License — Free to use, modify, and share.

yaml
Copy
Edit
```
