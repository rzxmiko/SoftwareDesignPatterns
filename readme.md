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

*Note: The structure above is an example. Adjust the filenames and folders to match your actual project.*

## Clean Code Principles
This project demonstrates the following principles:
- **Meaningful Names** — methods clearly describe their purpose.
- **Single Responsibility Principle** — the facade coordinates operations without implementing device logic.
- **Principle of Least Knowledge** — the client interacts with the facade instead of managing every subsystem.
- **Small, Focused Classes** — each subsystem has its own responsibility.
- **Decoupling** — subsystem classes do not depend on the facade and can be used independently.

## Advantages
- Simplifies interaction with multiple devices.
- Reduces complexity in client code.
- Improves readability and maintainability.

## Disadvantages
- The facade may become too large if too many responsibilities are added.
- An additional class is introduced.
- The simplified interface may not expose every advanced subsystem feature.

## Author
**Dilara Shamelova**  
Group: SE-2506  
Course: Software Design Patterns
