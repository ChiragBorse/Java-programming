# Java Programming Examples

A collection of fundamental Java programming examples, including a simple Swing GUI application for form design. This repository serves as a basic resource for learning and practicing core Java concepts.

## 🚀 Overview

This repository provides a set of straightforward Java programs demonstrating various basic programming constructs and a simple Graphical User Interface (GUI) application. It's ideal for beginners looking to understand Java syntax, control flow, object-oriented concepts, and basic GUI development with Swing.

The highlight of this collection is `FormDesign.java`, a simple Swing application that illustrates how to create a basic form with input fields, a button, and a display area.

## ✨ Features

*   **Basic Java Concepts**: Examples covering arithmetic operations, conditional statements, loops, and string manipulation.
*   **Leap Year Checker**: Determine if a given year is a leap year.
*   **Palindrome Checker**: Check if a string or number is a palindrome.
*   **Simple Calculator**: Perform basic arithmetic operations.
*   **Student Record Management (Basic)**: A rudimentary example for handling student data.
*   **Alphabet Checker**: Determine if a character is an alphabet.
*   **Days in Month Calculator**: Calculate the number of days in a specific month.
*   **GUI Form Design (`FormDesign.java`)**:
    *   User-friendly interface for inputting Name and Email.
    *   Button interaction to display entered information.
    *   Uses standard Java Swing components (`JFrame`, `JLabel`, `JTextField`, `JButton`, `JTextArea`).
    *   Demonstrates basic layout management (`GridBagLayout`, `BorderLayout`).

## 🛠️ Tech Stack

*   **Language**: Java
*   **GUI Framework**: Java Swing (for `FormDesign.java`)
*   **Development Kit**: Java Development Kit (JDK) 8 or higher

## 📂 Repository Structure

The repository contains several `.java` files, each representing a standalone program:

```
├── Calc.java               # Simple calculator program
├── Calculateprogram.java   # Another basic calculation example
├── Leapyear.java           # Checks if a year is a leap year
├── Palindrome.java         # Checks for palindromes
├── Studentre.java          # Basic student record example
├── alphabet.java           # Checks if a character is an alphabet
├── daysmonth.java          # Determines days in a month
└── formdes.java            # Java Swing GUI for form design
```

## 🚀 Getting Started

To get these examples running on your local machine, follow these steps.

### Prerequisites

*   **Java Development Kit (JDK)**: You need JDK 8 or a newer version installed on your system.
    *   You can download it from [Oracle's website](https://www.oracle.com/java/technologies/downloads/) or use an open-source distribution like [OpenJDK](https://openjdk.java.net/install/).
    *   Verify your installation by running:
        ```bash
        java -version
        javac -version
        ```

### Installation

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/ChiragBorse/java-programming.git
    cd java-programming
    ```

## 💡 Usage

Each `.java` file in this repository is a standalone program. You can compile and run them individually.

### General Steps to Compile and Run a Java Program

1.  **Open a terminal or command prompt**.
2.  **Navigate to the directory** where the `.java` file is located (e.g., `cd java-programming`).
3.  **Compile the Java file**:
    ```bash
    javac YourProgramName.java
    ```
    (Replace `YourProgramName.java` with the actual file name, e.g., `Leapyear.java`)
    If compilation is successful, a `YourProgramName.class` file will be created in the same directory.
4.  **Run the compiled Java program**:
    ```bash
    java YourProgramName
    ```
    (Replace `YourProgramName` with the class name, which is usually the same as the file name without the `.java` extension)

### Example: Running `FormDesign.java`

`FormDesign.java` is a GUI application.

1.  **Compile `formdes.java`**:
    ```bash
    javac formdes.java
    ```
2.  **Run `FormDesign`**:
    ```bash
    java FormDesign
    ```
    A GUI window will appear.

#### Interacting with the `FormDesign` GUI:
1.  Enter your `Name` in the first text field.
2.  Enter your `Email` in the second text field.
3.  Click the `Display` button.
4.  Your entered Name and Email will appear in the text area below the button.

### Example: Running `Leapyear.java`

1.  **Compile `Leapyear.java`**:
    ```bash
    javac Leapyear.java
    ```
2.  **Run `Leapyear`**:
    ```bash
    java Leapyear
    ```
    The program will prompt you to enter a year in the console.

## 🧑‍💻 Development

For developing or modifying these programs:

1.  **Edit the `.java` files** using your preferred text editor or Integrated Development Environment (IDE) like VS Code, IntelliJ IDEA, or Eclipse.
2.  **Save your changes**.
3.  **Recompile** the modified `.java` file using `javac`.
4.  **Rerun** the program using `java`.

## 🤝 Contributing

Contributions are welcome! If you have suggestions for improvements, bug fixes, or new basic Java examples, please follow these steps:

1.  **Fork** the repository.
2.  **Create a new branch** for your feature or fix: `git checkout -b feature/your-feature-name` or `bugfix/your-bug-fix`.
3.  **Make your changes** and ensure they adhere to basic Java coding conventions.
4.  **Commit your changes** with a clear and descriptive commit message.
5.  **Push your branch** to your forked repository.
6.  **Open a Pull Request** to the `main` branch of this repository.

## ❓ Troubleshooting

*   **`'javac' is not recognized as an internal or external command`**: This usually means the JDK is not installed or its `bin` directory is not added to your system's `PATH` environment variable. Ensure JDK is installed correctly and `PATH` is configured.
*   **`Error: Could not find or load main class YourProgramName`**: This often happens if you are not in the correct directory when running `java YourProgramName`, or if the class file was not generated due to compilation errors. Check your current directory and ensure `javac` ran successfully.
*   **Compilation Errors**: Read the error messages carefully. They usually point to the line number and type of error (e.g., syntax error, missing semicolon, undeclared variable).

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Credits

*   **Chirag Borse** - Initial work and repository owner.

---
_This README was generated by an AI assistant._