package structural_pattern.decorator;

public class Mocha extends CondimentDecorator {
 
	public Mocha(Beverage beverage) {
		// TODO:
		super(beverage);
	}
 
	public String getDescription() {
		// TODO:
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		// TODO:
		return beverage.cost() + .20;
	}
}
