# PalindromeCheckerApp

> A console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

---

## 📋 Project Overview

| Field | Details |
|---|---|
| **Application Name** | PalindromeCheckerApp |
| **Version** | 1.0 |
| **Language** | Java |
| **Type** | Console-Based Application |
| **Current Use Case** | UC1 – Application Entry & Welcome Message |

---

## 🎯 Objective

The objective of the **PalindromeCheckerApp** is to design and implement a console-based Java application that:

- Validates whether a given string is a palindrome under different conditions.
- Strengthens core programming fundamentals.
- Demonstrates key data structure concepts in Java.

---

## 📁 Project Structure

```
PalindromeCheckerApp/
│
├── UseCase1PalindromeCheckerApp.java   # UC1 - Entry point & Welcome Message
└── README.md                           # Project documentation
```

---

## 🚀 Use Cases

### UC1: Application Entry & Welcome Message

**Goal:** Display a welcome message and app details at startup.

**Actor:** User

**Flow:**
1. Program starts.
2. JVM invokes the `main()` method.
3. Application name is displayed.
4. Application version is displayed.
5. Program continues to the next use case or exits.

---

## 🧠 Key Concepts Used in UC1

| Concept | Description |
|---|---|
| **Class** | Acts as a container for the Palindrome Checker application logic. |
| **Main Method** | Entry point of the Java application: `public static void main(String[] args)` |
| **Static Keyword** | Allows the JVM to invoke `main()` without creating an object instance. |
| **Console Output** | `System.out.println()` is used to display messages on the console. |
| **Application Flow Control** | Defines the startup behavior before palindrome processing begins. |

---

## 🛠️ How to Compile and Run

### Prerequisites

- Java Development Kit (JDK) installed
- Terminal / Command Prompt

### Step 1: Compile

```bash
javac UseCase1PalindromeCheckerApp.java
```

### Step 2: Run

```bash
java UseCase1PalindromeCheckerApp
```

### Expected Output

```
=========================================
   Welcome to PalindromeCheckerApp
   Version: 1.0
=========================================
```

---

## 📌 Notes

- Ensure you are in the correct directory containing the `.java` file before compiling.
- Each use case will be implemented as a separate class file for modularity and clarity.
- Future use cases will extend the application to handle actual palindrome validation with various conditions.

---

## 📚 Future Use Cases (Planned)

- **UC2:** Accept user input string
- **UC3:** Check for simple palindrome (case-sensitive)
- **UC4:** Check for palindrome ignoring case
- **UC5:** Check for palindrome ignoring spaces and special characters
- **UC6:** Display results and exit

---

## 👨‍💻 Author
Muskan