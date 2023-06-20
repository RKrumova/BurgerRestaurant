# Burger Restaurant

This project implements a small burger restaurant where a young boy, who has completed a course for chefs, decides to open his own business. The restaurant operates with a chef and a cashier, and offers three types of burgers: royal, classic, and vegetarian. Additionally, various sauces can be added to the burgers.

## Design Patterns Used

### 1. Singleton - Restaurant
The **Singleton** design pattern is used to ensure that there is only one instance of the `Restaurant` class throughout the application. This allows easy access to the restaurant instance from different parts of the code.

### 2. Command - Cashier and Chef
The **Command** design pattern is used to implement the interaction between the `Cashier` and `Chef` classes. The `Cashier` acts as the invoker, taking orders and encapsulating them as commands to be executed by the `Chef`. The `Chef` is the receiver, responsible for executing the commands and preparing the requested burgers.

### 3. Factory - Kitchen and Burgers
The **Factory** design pattern is used to create different types of burgers in the `Kitchen`. The `Kitchen` serves as the factory, providing an interface to create the burgers (`RoyalBurger`, `ClassicBurger`, and `VegetarianBurger`).

### 4. Decorator - Add sauces to the burger
The **Decorator** design pattern is used to add sauces to the burgers. The `Burger` class serves as the base component, and the `GarlicSauce` and `Ketchup` classes act as decorators that can be added to the burgers to enhance their flavor.

## Class Diagram

```
                    +------------------+
                    |    Restaurant    |
                    +------------------+
                    | - chef: Chef     |
                    | - cashier: Cashier |
                    +------------------+
                               |
                               |
                 +-----------------------------+
                 |           Cashier           |
                 +-----------------------------+
                 | - orderQueue: Queue<Command> |
                 |                             |
                 | +takeOrder(order: Order): void |
                 | +placeOrder(): void           |
                 +-----------------------------+
                               |
                               |
                 +-----------------------------+
                 |             Chef            |
                 +-----------------------------+
                 | - kitchen: Kitchen           |
                 |                             |
                 | +setKitchen(kitchen: Kitchen): void |
                 | +cookBurger(burger: Burger): void  |
                 +-----------------------------+
                               |
                               |
                 +-----------------------------+
                 |           Kitchen           |
                 +-----------------------------+
                 | +createBurger(type: String): Burger |
                 +-----------------------------+
                 |        ^ (implements)        |
                 |                             |
                 |       BurgerFactory         |
                 +-----------------------------+
                               |
                   +---------+---------+
                   |                   |
           +--------------+     +----------------+
           | RoyalBurger  |     | ClassicBurger  |
           +--------------+     +----------------+
                               |
                   +---------+---------+
                   |                   |
             +--------------------+
             | VegetarianBurger  |
             +--------------------+
                               |
                   +---------+---------+
                   |                   |
          +-----------------+   +----------------+
          |    Burger       |   |    Sauce       |
          +-----------------+   +----------------+
                   |                   |
                   |             +---------------+
                   |             |  GarlicSauce  |
                   |             +---------------+
                   |                   |
                   |             +-----------+
                   |             |   Ketchup   |
                   |             +-----------+
                   |                   
                   |
```

Please note that the class diagram is a simplified representation of the design. Actual implementation details and method signatures are omitted for brevity.
