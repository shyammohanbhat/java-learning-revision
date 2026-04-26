```plantuml
@startuml Strategy Pattern - Payment System

interface PaymentStrategy {
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

note right of PaymentContext : Context class that\nuses the strategy\nto execute payment

note as N1
    Strategy Pattern Components:
    - Strategy: PaymentStrategy (interface)
    - Concrete Strategies: CardPayment, UpiPayment
    - Context: PaymentContext
end note

@enduml