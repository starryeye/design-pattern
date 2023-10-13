package part3_behavioral_pattern.sub10_template_method;

public class Coffee extends Beverage {

	@Override
	public void brew(){
		System.out.println("Dripping coffee through filter");
	}

	@Override
	public void addCondiments(){
		System.out.println("Adding sugar and milk");
	}
}

