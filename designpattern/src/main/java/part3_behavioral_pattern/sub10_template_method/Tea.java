package part3_behavioral_pattern.sub10_template_method;

public class Tea extends Beverage {

	@Override
	public void brew(){
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments(){
		System.out.println("Adding Lemon");
	}
}
