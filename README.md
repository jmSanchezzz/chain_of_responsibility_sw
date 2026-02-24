
# Chain of Responsibility

In this implementation, the `ATMDispenseChain` class sets up and manages the dispensing logic for BPI’s ATM system with denominations of 1000, 500, 200, 100, and 20 peso bills. The `BPI_Atm` class allows users to adjust a (hard-coded) amount and initiates the dispensing process using the Chain of Responsibility pattern.

This design ensures that the ATM system dispenses cash in the specified denominations according to the requested amount.

In the provided example, the elements of the Chain of Responsibility pattern can be identified as follows:

Handler: The handler objects are the concrete classes that implement the `DispenseChain` interface. In this case, the handlers are: `Peso1000Dispenser`, `Peso500Dispenser`, `Peso200Dispenser`, `Peso100Dispenser`, and `Peso20Dispenser`. Each handler is responsible for dispensing a specific denomination of currency.

Chain: The chain is represented by the `ATMDispenseChain` class. It sets up the sequence of handlers by linking them together using the `setNextChain()` method. The chain is responsible for passing the request along the sequence of handlers.

Request: The request is represented by the `dispense()` call made with a `Currency` object (the amount to withdraw).

Client: The client is the `BPI_Atm` class. It creates and initializes the chain (via `new ATMDispenseChain()`) and sends the request to the chain by calling `dispense()`.

Context: The context includes `ATMDispenseChain` (wiring and delegation), `Currency` (request data), `DispenseChain` (the handler contract), and the concrete dispenser classes that handle each denomination.




