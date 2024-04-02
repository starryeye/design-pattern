package behavioral_pattern.template_method;

public class Main {

    /**
     * template method pattern
     *
     * 메서드에서 알고리즘의 구조만 정의하고 각 단계에서 수행할
     * 구체적 처리는 하위 클래스로 위임
     *
     * 알고리즘의 구조 자체는 그대로 놔둔 채 알고리즘 각 단계 처리를
     * 하위 클래스에서 재정의
     *
     * 서로 다른 하위 클래스가 서로 다른 구현을 실행하면서 서로 다른 처리 수행
     *
     * 처리의 큰 흐름은 상위 클래스에서 결정한 대로 이루어짐
     */

    public static void main(String[] args) {
		Beverage coffee = new Coffee();
        Beverage tea = new Tea();
		
		System.out.println("\n[Making coffee...]");
		coffee.prepareRecipe();
		
        System.out.println("\n[Making tea...]");
        tea.prepareRecipe();
	}
    
}

    