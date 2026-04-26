```mermaid
classDiagram
    class PaymentStrategy {
        <<interface>>
        +pay(amount: int): void
    }
    
    class CardPayment {
        +pay(amount: int): void
    }
    
    class UpiPayment {
        +pay(amount: int): void
    }
    
    class PaymentContext {
        -paymentStrategy: PaymentStrategy
        +PaymentContext(paymentStrategy: PaymentStrategy)
        +executePayment(amount: int): void
    }
    
    PaymentStrategy <|.. CardPayment : implements
    PaymentStrategy <|.. UpiPayment : implements
    PaymentContext --> PaymentStrategy : uses
    
    note for PaymentContext "Context class that uses the strategy to execute payment"
    
    note for PaymentStrategy "Strategy Pattern Components: Strategy interface, Concrete Strategies (CardPayment, UpiPayment), Context (PaymentContext)"