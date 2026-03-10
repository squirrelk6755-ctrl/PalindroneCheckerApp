# PalindromeCheckerApp

> A console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

## 📋 Project Overview

| Field | Details |
|---|---|
| **Application Name** | PalindromeCheckerApp |
| **Version** | 13.0 |
| **Language** | Java |
| **Type** | Console-Based Application |
| **Current Use Case** | UC13 – Performance Comparison |

---

## 🎯 Objective

The objective of the **PalindromeCheckerApp** is to design and implement a console-based Java application that:

- Validates whether a given string is a palindrome under different conditions.
- Strengthens core programming fundamentals.
- Demonstrates key data structure concepts in Java.
- Explores OOP design patterns and algorithm benchmarking.

---

## 📁 Project Structure

```
PalindromeCheckerApp/
│
├── UseCase1PalindromeCheckerApp.java    # UC1  - Entry point & Welcome Message
├── UseCase2PalindromeCheckerApp.java    # UC2  - Hardcoded Palindrome Check
├── UseCase3PalindromeCheckerApp.java    # UC3  - Palindrome Check Using String Reverse
├── UseCase4PalindromeCheckerApp.java    # UC4  - Character Array Based Palindrome Check
├── UseCase5PalindromeCheckerApp.java    # UC5  - Stack Based Palindrome Checker
├── UseCase6PalindromeCheckerApp.java    # UC6  - Queue + Stack Based Palindrome Check
├── UseCase7PalindromeCheckerApp.java    # UC7  - Deque Based Optimized Palindrome Checker
├── UseCase8PalindromeCheckerApp.java    # UC8  - Linked List Based Palindrome Checker
├── UseCase9PalindromeCheckerApp.java    # UC9  - Recursive Palindrome Checker
├── UseCase10PalindromeCheckerApp.java   # UC10 - Case-Insensitive & Space-Ignored Palindrome
├── UseCase11PalindromeCheckerApp.java   # UC11 - Object-Oriented Palindrome Service
├── UseCase12PalindromeCheckerApp.java   # UC12 - Strategy Pattern for Palindrome Algorithms
├── UseCase13PalindromeCheckerApp.java   # UC13 - Performance Comparison
└── README.md                            # Project documentation
```

---

## 🚀 Use Cases

### UC1: Application Entry & Welcome Message

**Goal:** Display a welcome message and app details at startup.

**Flow:**
1. Program starts.
2. JVM invokes the `main()` method.
3. Application name is displayed.
4. Application version is displayed.
5. Program continues to the next use case or exits.

---

### UC2: Print a Hardcoded Palindrome Result

**Goal:** Display whether a hardcoded string is a palindrome.

**Flow:**
1. A hardcoded string is declared as a `String` literal.
2. The string is reversed using `StringBuilder.reverse()` and compared against the original.
3. Result is printed to the console.

---

### UC3: Palindrome Check Using String Reverse

**Goal:** Check whether a string is a palindrome by reversing it using a `for` loop.

**Flow:**
1. A hardcoded string is declared.
2. A `for` loop iterates in reverse order, building the reversed string character by character using String concatenation (`+`).
3. The original and reversed strings are compared using `equals()`.
4. Result is printed to the console.

---

### UC4: Character Array Based Palindrome Check

**Goal:** Convert string to character array and validate palindrome using the two-pointer technique.

**Flow:**
1. A hardcoded string is converted to a `char[]` using `toCharArray()`.
2. Two pointers — `start` (index 0) and `end` (last index) — are initialized.
3. Characters at `start` and `end` are compared; pointers move inward each iteration.
4. If any mismatch is found, the string is NOT a palindrome.

---

### UC5: Stack Based Palindrome Checker

**Goal:** Use a Stack data structure to reverse characters and validate palindrome.

**Flow:**
1. A hardcoded string is declared and initialized.
2. A `Stack<Character>` is created.
3. Each character of the string is **pushed** onto the stack using `toCharArray()`.
4. The stack is **popped** character by character and compared with the original string.
5. Because of LIFO, popped characters appear in reverse — enabling palindrome validation.

---

### UC6: Queue + Stack Based Palindrome Check

**Goal:** Demonstrate FIFO vs LIFO using Queue and Stack for palindrome validation.

**Flow:**
1. A hardcoded string is declared and initialized.
2. A `Queue<Character>` (LinkedList) and a `Stack<Character>` are created.
3. Each character is simultaneously **enqueued** (into Queue) and **pushed** (onto Stack).
4. Characters are **dequeued** (FIFO) and **popped** (LIFO) and compared pair by pair.
5. For a palindrome, both orderings produce identical character sequences.

---

### UC7: Deque Based Optimized Palindrome Checker

**Goal:** Use Deque to compare front and rear elements.

**Flow:**
1. Characters are inserted into a `Deque` using `addLast()`.
2. `removeFirst()` and `removeLast()` pull characters from both ends simultaneously.
3. If any pair doesn't match, the string is NOT a palindrome.
4. Loop continues while `deque.size() > 1`.

**Key Concepts:**
- **Deque (Double Ended Queue)** – Allows insertion and deletion from both front and rear ends.
- **Front and Rear Access** – Enables direct comparison of first and last characters.
- **Optimized Data Handling** – Eliminates the need for separate reversal data structures.

---

### UC8: Linked List Based Palindrome Checker

**Goal:** Check palindrome using `LinkedList` with double-ended operations.

**Flow:**
1. Characters are added to a `LinkedList<Character>` using `addLast()`.
2. `removeFirst()` and `removeLast()` compare characters from both ends.
3. Loop continues while `list.size() > 1`.

**Key Concepts:**
- **LinkedList** – A dynamic data structure where elements are connected using node references.
- **Double-Ended Operations** – `LinkedList` supports both `removeFirst()` and `removeLast()` natively.

---

### UC9: Recursive Palindrome Checker

**Goal:** Check palindrome using recursion without any extra data structure.

**Flow:**
1. Recursive method `check(String s, int start, int end)` is called.
2. Base condition: if `start >= end`, return `true`.
3. If `charAt(start) != charAt(end)`, return `false`.
4. Otherwise, recurse inward: `check(s, start + 1, end - 1)`.

**Key Concepts:**
- **Recursion** – A technique where a method calls itself to solve smaller subproblems.
- **Base Condition** – Prevents infinite recursion and terminates recursive calls.
- **Call Stack** – Memory structure used to manage method calls during recursion.

---

### UC10: Case-Insensitive & Space-Ignored Palindrome

**Goal:** Ignore spaces, symbols, and case while checking a palindrome.

**Flow:**
1. Input string is normalized: non-alphanumeric characters removed using regex, then converted to lowercase.
2. Standard two-pointer comparison is applied on the normalized string.
3. Result is displayed with both original and normalized strings.

**Key Concepts:**
- **String Preprocessing** – Cleaning input before validation.
- **Regular Expressions** – `replaceAll("[^a-zA-Z0-9]", "")` removes spaces and symbols.

**Example:** `"A man a plan a canal Panama"` → `"amanaplanacanalpanama"` → ✅ Palindrome

---

### UC11: Object-Oriented Palindrome Service

**Goal:** Encapsulate palindrome logic in a dedicated service class.

**Flow:**
1. `PalindromeService` class is created with a `checkPalindrome(String input)` method.
2. Main class creates an instance of `PalindromeService` and delegates the check.
3. Two-pointer logic runs inside the service method.
4. Result is returned and displayed.

**Key Concepts:**
- **Encapsulation** – Logic is hidden inside `PalindromeService`; the main class doesn't need to know *how* it works.
- **Single Responsibility Principle** – Each class has one clear job.
- **Object-Oriented Design** – Improves reusability, readability, and separation of concerns.

---

### UC12: Strategy Pattern for Palindrome Algorithms (Advanced)

**Goal:** Choose a palindrome algorithm dynamically at runtime using the Strategy Design Pattern.

**Flow:**
1. `PalindromeStrategy` interface is defined with a `check(String input)` method.
2. `StackStrategy` and `DequeStrategy` implement the interface with their own logic.
3. The desired strategy is injected at runtime and `check()` is called polymorphically.

**Key Concepts:**
- **Interface** – `PalindromeStrategy` enforces a common `check()` contract for all algorithms.
- **Polymorphism** – The same `strategy.check()` call executes different logic depending on which strategy is injected.
- **Strategy Pattern** – Algorithms are interchangeable at runtime without changing the calling code.

| Strategy | Data Structure | Logic |
|---|---|---|
| `StackStrategy` | `Stack<Character>` | LIFO reversal then compare |
| `DequeStrategy` | `ArrayDeque<Character>` | Front & rear removal compare |

---

### UC13: Performance Comparison

**Goal:** Benchmark and compare the execution performance of different palindrome approaches.

**Flow:**
1. Four palindrome algorithms are each wrapped with `System.nanoTime()` calls.
2. Execution duration is calculated as `endTime - startTime` in nanoseconds.
3. All results (palindrome result + execution time) are displayed.
4. A summary table of all execution times is printed.

**Key Concepts:**
- **`System.nanoTime()`** – Provides nanosecond-precision timing for short-duration benchmarks.
- **Algorithm Comparison** – Highlights trade-offs between simplicity, memory, and speed.

| Approach | Data Structure | Expected Speed |
|---|---|---|
| Two-Pointer | None (in-place) | ⚡ Fastest — no extra memory |
| StringBuilder | String buffer | ✅ Fast — built-in JVM optimization |
| Deque-Based | `ArrayDeque` | 🔄 Moderate — object overhead |
| Stack-Based | `Stack` | 🐢 Slowest — synchronized legacy class |

---

## 🧠 Key Concepts

| Concept | UC | Description |
|---|---|---|
| **Class** | UC1–UC13 | Acts as a container for the Palindrome Checker application logic. |
| **Main Method** | UC1–UC13 | Entry point of the Java application: `public static void main(String[] args)` |
| **Static Keyword** | UC1–UC13 | Allows the JVM to invoke `main()` without creating an object instance. |
| **Console Output** | UC1–UC13 | `System.out.println()` displays messages on the console. |
| **String** | UC2–UC13 | Built-in Java class used to store and manipulate textual data. |
| **String Literal** | UC2–UC13 | Text in double quotes (`"madam"`), stored in the String constant pool. |
| **Conditional Statement (if-else)** | UC2–UC13 | Evaluates whether the given string satisfies the palindrome condition. |
| **StringBuilder.reverse()** | UC2 | Reverses the character sequence of the string for comparison. |
| **Loop (for / while)** | UC3–UC13 | Iterates through characters for various push/pop/enqueue/dequeue operations. |
| **String Immutability** | UC3 | String objects are immutable; every `+` creates a new String object in memory. |
| **equals() Method** | UC3 | Compares content of two String objects, not memory references. |
| **Character Array (char[])** | UC4, UC5 | Primitive array storing individual characters for index-based access. |
| **Two-Pointer Technique** | UC4, UC11 | One pointer from the start, one from the end — reduces unnecessary comparisons. |
| **Stack (LIFO)** | UC5, UC6, UC12 | Last In First Out. `push()` inserts, `pop()` removes from top. |
| **Queue (FIFO)** | UC6 | First In First Out. `offer()` enqueues, `poll()` dequeues from front. |
| **LinkedList** | UC6, UC8 | Concrete implementation supporting both Queue and double-ended operations. |
| **Deque** | UC7, UC12 | Double Ended Queue — supports `addLast()`, `removeFirst()`, `removeLast()`. |
| **Recursion** | UC9 | Method calls itself with reduced subproblem until base condition is met. |
| **Base Condition** | UC9 | `start >= end` stops the recursive call chain. |
| **Call Stack** | UC9 | JVM memory structure managing active recursive method calls. |
| **Regular Expressions** | UC10 | `replaceAll("[^a-zA-Z0-9]", "")` strips non-alphanumeric characters. |
| **String Preprocessing** | UC10 | Normalizing input (lowercase + remove symbols) before palindrome check. |
| **Encapsulation** | UC11 | Wrapping palindrome logic inside `PalindromeService` class. |
| **Single Responsibility Principle** | UC11 | Each class has one clear, focused responsibility. |
| **Interface** | UC12 | `PalindromeStrategy` defines a contract that all strategy classes must follow. |
| **Polymorphism** | UC12 | Same `check()` call behaves differently based on the injected strategy. |
| **Strategy Pattern** | UC12 | Algorithms are interchangeable at runtime without modifying calling code. |
| **System.nanoTime()** | UC13 | Nanosecond-precision timer for benchmarking algorithm performance. |
| **Algorithm Benchmarking** | UC13 | Measuring and comparing execution durations across different approaches. |
| **Auto-boxing** | UC5–UC8, UC12 | Automatic conversion of primitive `char` → `Character` for generic collections. |

**Data Structures used across all UCs:**
- `String` → UC2 & UC3
- `char[]` → UC4 & UC5
- `Stack<Character>` → UC5, UC6 & UC12
- `Queue<Character>` (LinkedList) → UC6
- `Deque<Character>` (ArrayDeque) → UC7 & UC12
- `LinkedList<Character>` → UC8
- Call Stack (implicit) → UC9
- `String` (normalized) → UC10
- Service Class (OOP) → UC11
- Strategy Interface → UC12

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

### UC7

```bash
javac UseCase7PalindromeCheckerApp.java
java UseCase7PalindromeCheckerApp
```

**Expected Output:**
```
Input String: refer
"refer" is a Palindrome.
```

---

### UC8

```bash
javac UseCase8PalindromeCheckerApp.java
java UseCase8PalindromeCheckerApp
```

**Expected Output:**
```
Input : level
Is Palindrome? : true
```

---

### UC9

```bash
javac UseCase9PalindromeCheckerApp.java
java UseCase9PalindromeCheckerApp
```

**Expected Output:**
```
Input : madam
Is Palindrome? : true
```

---

### UC10

```bash
javac UseCase10PalindromeCheckerApp.java
java UseCase10PalindromeCheckerApp
```

**Expected Output:**
```
Input        : A man a plan a canal Panama
Normalized   : amanaplanacanalpanama
Is Palindrome? : true
```

---

### UC11

```bash
javac UseCase11PalindromeCheckerApp.java
java UseCase11PalindromeCheckerApp
```

**Expected Output:**
```
Input          : racecar
Is Palindrome? : true
```

---

### UC12

```bash
javac UseCase12PalindromeCheckerApp.java
java UseCase12PalindromeCheckerApp
```

**Expected Output:**
```
Input : level
Is Palindrome? : true

Input : level
Is Palindrome? : true
```

---

### UC13

```bash
javac UseCase13PalindromeCheckerApp.java
java UseCase13PalindromeCheckerApp
```

**Expected Output:**
```
========================================
  UC13: Palindrome Performance Comparison
========================================
Input : level

--- Two-Pointer Approach ---
Is Palindrome?  : true
Execution Time  : 852600 ns

--- Stack-Based Approach ---
Is Palindrome?  : true
Execution Time  : 1023400 ns

--- Deque-Based Approach ---
Is Palindrome?  : true
Execution Time  : 987200 ns

--- StringBuilder Reverse Approach ---
Is Palindrome?  : true
Execution Time  : 764100 ns

========================================
  Summary
========================================
Two-Pointer     : 852600 ns
Stack-Based     : 1023400 ns
Deque-Based     : 987200 ns
StringBuilder   : 764100 ns
```

> ⚠️ Execution times will vary per machine and JVM state.

---

## 📌 Notes

- Ensure you are in the correct directory containing the `.java` file before compiling.
- Each use case is implemented as a separate class file for modularity and clarity.
- UC3 uses String concatenation (`+`) in a loop to demonstrate **String Immutability** — `StringBuilder` is more efficient (shown in UC2).
- UC4 uses the **Two-Pointer Technique** on a `char[]` — the most memory-efficient approach (O(1) space).
- UC5 requires `import java.util.Stack` — demonstrates LIFO reversal logic.
- UC6 requires `import java.util.Queue`, `import java.util.Stack`, and `import java.util.LinkedList`. It demonstrates that for a palindrome, **FIFO (Queue) and LIFO (Stack) produce identical character sequences**.
- UC7 uses `ArrayDeque` which is preferred over `Stack` for deque operations (non-synchronized, faster).
- UC8 uses `LinkedList` which implements the `Deque` interface — same logic as UC7 but backed by linked nodes.
- UC9 uses **no extra data structure** — the Call Stack itself serves as the implicit memory mechanism.
- UC10 applies `replaceAll("[^a-zA-Z0-9]", "")` regex — the `^` inside `[]` means "NOT these characters".
- UC11 and UC12 both follow **OOP principles** — UC11 uses encapsulation, UC12 adds polymorphism via Strategy Pattern.
- UC13 uses `System.nanoTime()` (not `currentTimeMillis()`) for sub-millisecond precision benchmarking.

---

## 👨‍💻 Author

Muskan
