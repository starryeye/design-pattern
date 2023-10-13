package part2_structural_pattern.sub7_decorator;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		// TODO:
		super(beverage);
	}

	public String getDescription() {
		// TODO:
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		// TODO:
		return beverage.cost() + .10;
	}
}
