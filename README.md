# 🚀 Object-Oriented Programming Concepts in Java 17

Welcome to the repository that explores various Object-Oriented Programming (OOP) concepts using Java 17 with IntelliJ IDEA. This project is designed for educational purposes to help you understand and implement core OOP principles in Java.

## 📚 Table of Contents
1. [Introduction](#introduction)
2. [Classes and Objects](#classes-and-objects)
3. [Method Overloading](#method-overloading)
4. [The `this` Operator](#the-this-operator)
5. [Constructors](#constructors)
6. [Packages](#packages)
7. [Encapsulation](#encapsulation)
8. [Inheritance](#inheritance)
9. [Method Overriding](#method-overriding)
10. [Polymorphism](#polymorphism)
11. [`toString` Method](#tostring-method)
12. [The `Object` Class](#the-object-class)
13. [Static Methods](#static-methods)
14. [Static Variables](#static-variables)
15. [How to Run](#how-to-run)
16. [Contributing](#contributing)
17. [License](#license)

## 🌟 Introduction
This repository contains examples and explanations of essential OOP concepts in Java. Each concept is demonstrated through code snippets and comments to enhance your understanding.

## 🏷️ Classes and Objects
- **Class**: A blueprint for creating objects.
- **Object**: An instance of a class.
```java
public class Car {
    String color;
    String model;

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Tesla";
        System.out.println("Cat model: " + myCar.model);
    }
}
```

## 🔄 Method Overloading
- Define multiple methods with the same name but different parameters.
```java
public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

## 🔄 The `this` Operator
- Reference the current object within a method or constructor.
```java
public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Employee name: " + this.name);
    }
}
```

## 🚧 Constructors
- Initialize new objects.
```java
public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }
}
```

## 📦 Packages
- Organize related classes.
```java
package com.example.myapp;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

## 🔒 Encapsulation
- Restrict access to certain components.
```java
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

## 🧬 Inheritance
- Derive a class from another class.
```java
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
```

## 🔄 Method Overriding
- Override a method in a subclass.
```java
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats fish.");
    }
}
```

## 🔀 Polymorphism
- Use a single action in different ways.
```java
public class Zoo {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.eat(); // Outputs: The dog eats food.
    }
}
```

## 📝 `toString` Method
- Return a string representation of an object.
```java
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}
```

## 🌐 The `Object` Class
- The root class of all classes in Java.
```java
public class Example {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString());
    }
}
```

## 🔧 Static Methods
- Belong to the class, not instances.
```java
public class Utility {
    public static int add(int a, int b) {
        return a + b;
    }
}
```

## 🔒 Static Variables
- Shared among all instances of a class.
```java
public class Counter {
    public static int count = 0;

    public Counter() {
        count++;
    }
}
```

## 🚀 How to Run
1. Clone this repository.
   ```bash
   git clone https://github.com/yourusername/OOP-Concepts-Java.git
   ```
2. Open the project in IntelliJ IDEA.
3. Navigate to the `src` folder and explore the code examples.
4. Run the main class files to see the concepts in action.

## 🤝 Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.

## 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Happy coding! 😊
