package behavioral_pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    /**
     * Context 클래스
     */
    private final List<Item> items = new ArrayList<>();

    private PaymentStrategy paymentStrategy;


    public void addItem(Item item) {
        this.items.add(item);
    }


    // 전략 설정
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        int total = items.stream()
                .mapToInt(Item::getPrice)
                .sum();
        paymentStrategy.pay(total);
    }
}

