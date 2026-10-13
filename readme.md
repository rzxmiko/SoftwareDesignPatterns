# Home Theater Facade System

## Overview
This project demonstrates the **Facade Design Pattern** in Java. The system simplifies the process of controlling a home theater by providing one interface for several subsystem components.

Instead of controlling each device separately, the client uses the `HomeTheaterFacade` class to start or end a movie session.

## Design Pattern
**Facade Pattern** is a structural design pattern that provides a simplified interface to a complex subsystem.

### Subsystem Classes
- `Amplifier` — controls the sound system and volume.
- `Projector` — controls the projector and input source.
- `TheaterLights` — controls the room lighting.
- `PopcornPopper` — controls the popcorn machine.

### Facade Class
- `HomeTheaterFacade` — coordinates the subsystem components and provides simple methods such as `watchMovie()` and `endMovie()`.

## How It Works
1. The client creates the home theater subsystem objects.
2. The client creates a `HomeTheaterFacade`.
3. The client calls `watchMovie("Inception")` to prepare the home theater.
4. The facade coordinates the devices in the correct order.
5. The client can call `endMovie()` to finish the movie session.

## Technologies
- Java
- JDK 17
- IntelliJ IDEA

## Project Structure
```text
src/
└── facade/
    ├── HomeTheaterFacade.java
    ├── Main.java
    └── subsystem/
        ├── Amplifier.java
        ├── PopcornPopper.java
        ├── Projector.java
        └── TheaterLights.java
```

## Clean Code Principles
This project demonstrates the following principles:
- **Meaningful Names** — methods like `watchMovie()` and `endMovie()` show the goal, not the technical steps.
- **Single Responsibility Principle** — the facade only calls the devices in the right order. The device logic stays in the device classes.
- **Explicit Dependencies (Constructor Injection)** — the devices come through the constructor and are saved in final fields.
- **Small, Focused Classes** — each device class is small and has one job.
- **No Leaking of Subsystem Details** — the client gives only the movie title. The order of calls and the settings stay inside the facade.

## Advantages
- Simplifies interaction with multiple devices.
- Reduces complexity in client code.
- Improves readability and maintainability.

## Disadvantages
- The facade may become too large if too many responsibilities are added.
- The simplified interface may not expose every advanced subsystem feature.
- The devices do not check their own state and the facade has no error handling. This is the next improvement.

## Author
**Dilara Shamelova**  
Group: SE-2506  
Course: Software Design Patterns