package behavioral_pattern.strategy;

public class PaypalStrategy implements PaymentStrategy {

    /**
     * Concrete Strategy 구현체
     */

    private final String email;

    // PayPal 결제 전략을 위한 생성자
    public PaypalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
