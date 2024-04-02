package behavioral_pattern.strategy;

public class Main {
    public static void main(String[] args) {

        /**
         * Strategy Pattern
         * - 객체의 행동을 실행 시간에 변경할 수 있도록 하는 디자인 패턴
         *
         * 구조
         * - Context
         * 이 객체는 전략을 사용하여 특정 작업을 수행한다.
         * Context는 필요에 따라 다른 전략을 사용할 수 있다.
         * Context는 전략 객체의 참조를 유지하며, 이 참조를 통해 전략 객체의 메서드를 호출한다.
         * - Strategy
         * 이 인터페이스(또는 추상 클래스)는
         * Context에서 사용할 수 있는 모든 전략(알고리즘)의 공통 인터페이스를 정의한다.
         * - Concrete Strategies
         * Strategy 인터페이스를 구현하는 클래스이다.
         * 각 구현체는 Strategy가 정의한 알고리즘의 실제 구현을 제공한다.
         *
         * 예제 코드 설명
         * - PaymentStrategy 인터페이스를 통해 결제 방법의 알고리즘을 캡슐화하고,
         * CreditCardStrategy와 PaypalStrategy 클래스를 통해 이를 구체화했다.
         * - ShoppingCart 클래스(컨텍스트)는 결제 전략을 설정할 수 있으며,
         * 결제 전략에 따라 다른 결제 방식을 실행할 수 있게된다.
         * 이로써, 결제 방식을 쉽게 추가하거나 변경할 수 있는 유연성을 얻을 수 있다.
         */


        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("1234", 100));
        cart.addItem(new Item("5678", 200));

        // 신용카드로 결제
        cart.setPaymentStrategy(new CreditCardStrategy("John Doe", "1234567890123456"));
        cart.checkout(); // 출력: 300 paid with credit card.

        //--------

        ShoppingCart cart2 = new ShoppingCart();

        cart2.addItem(new Item("91011", 150));
        cart2.addItem(new Item("121314", 250));

        // PayPal로 결제
        cart2.setPaymentStrategy(new PaypalStrategy("john.doe@example.com"));
        cart2.checkout(); // 출력: 400 paid using PayPal.
    }
}

