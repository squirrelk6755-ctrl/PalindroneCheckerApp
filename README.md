# PalindromeCheckerApp

> A console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

---

## 📋 Project Overview

| Field | Details |
|---|---|
| **Application Name** | PalindromeCheckerApp |
| **Version** | 6.0 |
| **Language** | Java |
| **Type** | Console-Based Application |
| **Current Use Case** | UC6 – Queue + Stack Based Palindrome Check |

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
├── UseCase2PalindromeCheckerApp.java   # UC2 - Hardcoded Palindrome Check
├── UseCase3PalindromeCheckerApp.java   # UC3 - Palindrome Check Using String Reverse
├── UseCase4PalindromeCheckerApp.java   # UC4 - Character Array Based Palindrome Check
├── UseCase5PalindromeCheckerApp.java   # UC5 - Stack Based Palindrome Checker
├── UseCase6PalindromeCheckerApp.java   # UC6 - Queue + Stack Based Palindrome Check
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

### UC2: Print a Hardcoded Palindrome Result

**Goal:** Display whether a hardcoded string is a palindrome.

**Actor:** User

**Flow:**
1. Program starts.
2. A hardcoded string is declared as a `String` literal.
3. The string is reversed using `StringBuilder.reverse()` and compared against the original.
4. Result is printed to the console.
5. Program exits.

---

### UC3: Palindrome Check Using String Reverse

**Goal:** Check whether a string is a palindrome by reversing it using a `for` loop.

**Actor:** User

**Flow:**
1. A hardcoded string is declared.
2. A `for` loop iterates in reverse order, building the reversed string character by character using String concatenation (`+`).
3. The original and reversed strings are compared using `equals()`.
4. Result is printed to the console.
5. Program exits.

---

### UC4: Character Array Based Palindrome Check

**Goal:** Convert string to character array and validate palindrome using the two-pointer technique.

**Actor:** User

**Flow:**
1. A hardcoded string is converted to a `char[]` using `toCharArray()`.
2. Two pointers — `start` (index 0) and `end` (last index) — are initialized.
3. Characters at `start` and `end` are compared; pointers move inward each iteration.
4. If any mismatch is found, the string is NOT a palindrome.
5. Result is displayed and the program exits.

---

### UC5: Stack Based Palindrome Checker

**Goal:** Use a Stack data structure to reverse characters and validate palindrome.

**Actor:** User

**Flow:**
1. A hardcoded string is declared and initialized.
2. A `Stack<Character>` is created.
3. Each character of the string is **pushed** onto the stack using `toCharArray()`.
4. The stack is **popped** character by character and compared with the original string (left to right).
5. Because of LIFO, popped characters appear in reverse — enabling palindrome validation.
6. Result is displayed and the program exits.

---

### UC6: Queue + Stack Based Palindrome Check

**Goal:** Demonstrate FIFO vs LIFO using Queue and Stack for palindrome validation.

**Actor:** User

**Flow:**
1. A hardcoded string is declared and initialized.
2. A `Queue<Character>` (LinkedList) and a `Stack<Character>` are created.
3. Each character is simultaneously **enqueued** (into Queue) and **pushed** (onto Stack).
4. Characters are **dequeued** (FIFO — original order) and **popped** (LIFO — reverse order) and compared pair by pair.
5. For a palindrome, both orderings produce identical character sequences.
6. Result is displayed and the program exits.

---

## 🧠 Key Concepts

| Concept | UC | Description |
|---|---|---|
| **Class** | UC1–UC6 | Acts as a container for the Palindrome Checker application logic. |
| **Main Method** | UC1–UC6 | Entry point of the Java application: `public static void main(String[] args)` |
| **Static Keyword** | UC1–UC6 | Allows the JVM to invoke `main()` without creating an object instance. |
| **Console Output** | UC1–UC6 | `System.out.println()` displays messages on the console. |
| **Application Flow Control** | UC1 | Defines startup behavior before palindrome processing begins. |
| **String** | UC2–UC6 | Built-in Java class used to store and manipulate textual data. |
| **String Literal** | UC2–UC6 | Text in double quotes (`"madam"`), stored in the String constant pool. |
| **Conditional Statement (if-else)** | UC2–UC6 | Evaluates whether the given string satisfies the palindrome condition. |
| **StringBuilder.reverse()** | UC2 | Reverses the character sequence of the string for comparison. |
| **Loop (for / while loop)** | UC3–UC6 | Iterates through characters for reversal or push/pop/enqueue/dequeue operations. |
| **String Immutability** | UC3 | String objects are immutable; every `+` creates a new String object in memory. |
| **String Concatenation (+)** | UC3 | Builds reversed string character by character (highlights performance drawback). |
| **equals() Method** | UC3 | Compares content of two String objects, not memory references. |
| **Character Array (char[])** | UC4 & UC5 | Primitive array storing individual characters for index-based access. |
| **Array Indexing** | UC4 | Accessing elements using index positions starting from 0. |
| **Two-Pointer Technique** | UC4 | One pointer from the start, one from the end — reduces unnecessary comparisons. |
| **Time Complexity Awareness** | UC4 | O(n/2) comparisons → effectively O(n); no extra object created → O(1) space. |
| **Stack (LIFO)** | UC5 & UC6 | Linear data structure — Last In First Out. `push()` inserts, `pop()` removes from top. |
| **Push Operation** | UC5 & UC6 | Inserts characters onto the top of the stack. |
| **Pop Operation** | UC5 & UC6 | Removes and returns characters from the top in reverse order. |
| **Reversal Logic** | UC5 & UC6 | Stack naturally reverses element order, ideal for palindrome validation. |
| **Auto-boxing** | UC5 & UC6 | Automatic conversion of primitive `char` → `Character` when using generic collections. |
| **Queue (FIFO)** | UC6 | Linear data structure — First In First Out. `offer()` enqueues, `poll()` dequeues from front. |
| **Enqueue & Dequeue** | UC6 | `offer()` inserts at rear of queue; `poll()` removes from front (original order preserved). |
| **Stack vs Queue** | UC6 | LIFO (Stack) gives reverse order; FIFO (Queue) gives original order — symmetric comparison. |
| **LinkedList** | UC6 | Concrete implementation of the `Queue` interface used to support FIFO operations. |
| **Logical Comparison** | UC6 | Matching `poll()` (Queue) output with `pop()` (Stack) output to validate palindrome. |

**Data Structures used:**
- `String` → UC2 & UC3
- `char[]` → UC4 & UC5
- `Stack<Character>` → UC5 & UC6
- `Queue<Character>` (LinkedList) → UC6

---

## 🛠️ How to Compile and Run

### Prerequisites

- Java Development Kit (JDK) installed
- Terminal / Command Prompt

---

### UC1

```bash
javac UseCase1PalindromeCheckerApp.java
java UseCase1PalindromeCheckerApp
```

**Expected Output:**
```
=========================================
      PalindromeCheckerApp  v1.0
      UC1: Application Entry
=========================================
Welcome to PalindromeCheckerApp!
Version: 1.0
=========================================
```

---

### UC2

```bash
javac UseCase2PalindromeCheckerApp.java
java UseCase2PalindromeCheckerApp
```

**Expected Output:**
```
=========================================
      PalindromeCheckerApp  v1.0
      UC2: Hardcoded Palindrome Check
=========================================

Checking : "madam"
Reversed : "madam"
-----------------------------------------
Result   : "madam" IS a Palindrome
=========================================
Program exiting... Goodbye!
=========================================
```

---

### UC3

```bash
javac UseCase3PalindromeCheckerApp.java
java UseCase3PalindromeCheckerApp
```

**Expected Output:**
```
=========================================
      PalindromeCheckerApp  v1.0
      UC3: Palindrome Check via Reverse
=========================================

Original String : "madam"
Reversed String : "madam"
-----------------------------------------
Result          : "madam" IS a Palindrome

Original String : "hello"
Reversed String : "olleh"
-----------------------------------------
Result          : "hello" is NOT a Palindrome
=========================================
Program exiting... Goodbye!
=========================================
```

---

### UC4

```bash
javac UseCase4PalindromeCheckerApp.java
java UseCase4PalindromeCheckerApp
```

**Expected Output:**
```
=========================================
      PalindromeCheckerApp  v4.0
  UC4: Character Array Based Validation
=========================================

Checking word   : "madam"
char[] contents : [ 'm' 'a' 'd' 'a' 'm' ]
-----------------------------------------
Two-Pointer Comparison:
  chars[0] = 'm'  <-->  chars[4] = 'm'
  chars[1] = 'a'  <-->  chars[3] = 'a'
-----------------------------------------
Result          : "madam" IS a Palindrome
=========================================
Program exiting... Goodbye!
=========================================
```

---

### UC5

```bash
javac UseCase5PalindromeCheckerApp.java
java UseCase5PalindromeCheckerApp
```

**Expected Output:**
```
=========================================
      PalindromeCheckerApp  v5.0
    UC5: Stack Based Palindrome Checker
=========================================

Input String    : "noon"

--- Pushing characters into Stack ---
  Pushed : 'n'  →  Stack: [n]
  Pushed : 'o'  →  Stack: [n, o]
  Pushed : 'o'  →  Stack: [n, o, o]
  Pushed : 'n'  →  Stack: [n, o, o, n]

--- Popping and Comparing characters ---
  Original[0] = 'n'  |  Popped = 'n'  →  Match
  Original[1] = 'o'  |  Popped = 'o'  →  Match
  Original[2] = 'o'  |  Popped = 'o'  →  Match
  Original[3] = 'n'  |  Popped = 'n'  →  Match
-----------------------------------------
Result          : "noon" IS a Palindrome
=========================================
Program exiting... Goodbye!
=========================================
```

---

### UC6

```bash
javac UseCase6PalindromeCheckerApp.java
java UseCase6PalindromeCheckerApp
```

**Expected Output:**
```
=========================================
      PalindromeCheckerApp  v6.0
  UC6: Queue + Stack Fairness Check
=========================================

Input String     : "civic"
=========================================

--- Enqueuing & Pushing Characters ---
  Enqueued & Pushed : 'c'
  Enqueued & Pushed : 'i'
  Enqueued & Pushed : 'v'
  Enqueued & Pushed : 'i'
  Enqueued & Pushed : 'c'

  Queue (FIFO) : [c, i, v, i, c]
  Stack (LIFO) : [c, i, v, i, c]

--- Dequeue (Queue) vs Pop (Stack) Comparison ---
  Step [0]  Dequeued = 'c'  |  Popped = 'c'  →  Match
  Step [1]  Dequeued = 'i'  |  Popped = 'i'  →  Match
  Step [2]  Dequeued = 'v'  |  Popped = 'v'  →  Match
  Step [3]  Dequeued = 'i'  |  Popped = 'i'  →  Match
  Step [4]  Dequeued = 'c'  |  Popped = 'c'  →  Match
-----------------------------------------
Result           : "civic" IS a Palindrome
=========================================

Program exiting... Goodbye!
=========================================
```

---

## 📌 Notes

- Ensure you are in the correct directory containing the `.java` file before compiling.
- Each use case is implemented as a separate class file for modularity and clarity.
- UC3 uses String concatenation (`+`) in a loop to demonstrate **String Immutability** — `StringBuilder` is more efficient (shown in UC2).
- UC4 uses the **Two-Pointer Technique** on a `char[]` — the most memory-efficient approach (O(1) space).
- UC5 requires `import java.util.Stack` — demonstrates LIFO reversal logic.
- UC6 requires `import java.util.Queue`, `import java.util.Stack`, and `import java.util.LinkedList`. It demonstrates that for a palindrome, **FIFO (Queue) and LIFO (Stack) produce identical character sequences**, making it a "fairness check" between the two structures.

---

## 👨‍💻 Author

Muskan
