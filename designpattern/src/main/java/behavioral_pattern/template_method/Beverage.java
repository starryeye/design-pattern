package behavioral_pattern.template_method;

public abstract class Beverage {

    public final void prepareRecipe() {
        // TODO: 템플릿 메소드 구현
        // 전체 알고리즘을 정의한다.

		boilWater();
		brew();
		pourInCup();
		addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private final void boilWater() {
        System.out.println("Boiling water");
    }

    private final void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
    