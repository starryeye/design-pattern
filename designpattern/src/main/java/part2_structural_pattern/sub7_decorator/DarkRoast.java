package part2_structural_pattern.sub7_decorator;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

