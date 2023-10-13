package part2_structural_pattern.sub7_decorator;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		// TODO:
		super(beverage);
	}

	public String getDescription() {
		// TODO:
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		// TODO:
		return beverage.cost() + .15;
	}
}
