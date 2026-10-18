# Strategy Pattern: Calculator

Assignment #5, Software Design Patterns 

## Description
A calculator that performs arithmetic operations through interchangeable
strategies. The Calculator (Context) delegates work to the current
OperationStrategy and contains no if/switch on operation type.

## Structure
- `OperationStrategy`: strategy interface
- `AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`, `DivideStrategy`: concrete strategies
- `Calculator`: context, supports `setStrategy()` at runtime
- `StrategyRegistry`: maps a symbol ("+", "-", ...) to a strategy
- `Main`: client

## Run
Java 17. Run `calculator.Main`.

## Adding a new operation
Implement `OperationStrategy` and register it with
`registry.register("^", new PowerStrategy())`. No existing class changes.