# 🧪 The Java Servlet Alchemy Lab

> **"Where code meets calculation and coffee turns into logic."**

![Java](https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=java)
![Jakarta EE](https://img.shields.io/badge/Jakarta%20EE-Servlet-blue?style=for-the-badge&logo=eclipse-ide)
![Status](https://img.shields.io/badge/Status-Practice%20Mode-green?style=for-the-badge)

---

## 🧐 What is this?

Welcome to my digital playground! This repository is a **Practice Project**—a safe haven where I tinker with the nuts and bolts of Java Web Development without fear of breaking production.

It's simple. It's functional. It's the building block of something greater.

Inside, you'll find:
- **Classic Servlet Architecture**: Because sometimes you need to know how the sausage is made before using Spring Boot.
- **JSP Magic**: Old school rendering for that nostalgic server-side feel.
- **The Calculator**: A marvel of modern engineering (that adds two numbers together).

---

## 🚀 Features

### 🧮 The Calculator (`/calc`)
Does your brain hurt from adding $2 + 2$? Fear not!
- **Addition (+)/** **Subtraction (-)** / **Multiplication (*)** / **Division (/)**
- Handles input gracefully (mostly).
- Renders results instantly using JSTL tags.

### 👋 Hello World
- The obligatory sanity check to ensure the server is actually breathing.

---

## 🛠 Tech Stack

- **Language:** Java 25 (Bleeding edge!)
- **Build Tool:** Maven
- **Frameworks:** Jakarta Servlet API 6.1.0
- **Frontend:** JSP + JSTL (Jakarta Standard Tag Library)

---

## 🏃‍♂️ How to Run

1.  **Clone the Lab:**
    ```bash
    git clone https://github.com/yourusername/demo.git
    cd demo
    ```

2.  **Ignite the Engine (Maven):**
    ```bash
    ./mvnw clean package
    ```

3.  **Deploy:**
    Drop the generated `.war` file into your favorite Servlet Container (Tomcat, Jetty, GlassFish).

4.  **Visit:**
    Navigate to `http://localhost:8080/demo/calc` to witness the math happen.

---

## 📝 Notes to Self
- Remember: `Double.parseDouble` throws exceptions. Handle them! (Eventually...)
- Keep exploring `jakarta.servlet` annotations.
- Drink more water.

---

*Made with 💻 and a lot of ☕.*
