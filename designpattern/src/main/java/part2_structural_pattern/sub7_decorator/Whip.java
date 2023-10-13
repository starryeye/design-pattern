package part2_structural_pattern.sub7_decorator;
 
public class Whip extends CondimentDecorator {
 
	public Whip(Beverage beverage) {
		// TODO:
		super(beverage);
	}
 
	public String getDescription() {
		// TODO:
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		// TODO:
		return beverage.cost() + .10;
	}
}
