package behavioral_pattern.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    /**
     * Concrete Strategy 구현체
     */

    private final String name;
    private final String cardNumber;

    public CreditCardStrategy(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}

