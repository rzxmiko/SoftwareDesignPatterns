# Vehicle Factory System — Assignment #2
---

##  Project Overview
This project demonstrates two creational design patterns implemented in Java:
1. **Part A — Factory Method:** Used to encapsulate the creation of individual vehicles (`TwoWheeler` and `FourWheeler`) without coupling the client code to concrete classes.
2. **Part B — Abstract Factory:** Used to create families of related vehicle components (`Engine` and `SafetyFeature`) to ensure compatibility between parts (e.g., Bike Engine + Helmet, Car Engine + Seatbelt).

---

##  Clean Code Principles Applied
* **Clear Names:** All classes and methods follow explicit domain-driven naming.
* **Polymorphism:** Replaced `if-else` / `switch` statements with polymorphic factory calls.
* **Small Methods:** Each method performs a single creation or assembly task.
* **DRY (Don't Repeat Yourself):** Reused object delivery logic in the abstract base class.
* **Single Responsibility Principle (SRP):** Isolated creation logic inside factory classes.

---
##  How to Run
1. Open the project in IntelliJ IDEA or VS Code.
2. Run `Main.java` to see both patterns in action.