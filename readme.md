# Strategy Pattern: Calculator

Assignment #5, Software Design Patterns

## Description

A calculator that performs arithmetic operations through interchangeable strategies. The Calculator (Context) delegates work to the current OperationStrategy and contains no if/switch on operation type.

## Structure

* `OperationStrategy`: strategy interface
* `AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`, `DivideStrategy`: concrete strategies
* `Calculator`: context, supports `setStrategy()` at runtime
* `StrategyRegistry`: maps a symbol ("+", "-", ...) to a strategy
* `Main`: client

## Run

Java 17. Run `calculator.Main`:

```
javac -d out src/calculator/*.java
java -cp out calculator.Main
```

## Adding a new operation

Register a new strategy, with no changes to existing classes:

```java
registry.register("^", (a, b) -> Math.pow(a, b));
```

You can also write a class that implements `OperationStrategy` and register it the same way.
