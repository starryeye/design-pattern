package part1_creational_pattern.sub1_singleton;
 
public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;

	private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();

	public static ChocolateBoiler getInstance() {
		return uniqueInstance;
	}
  
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("1. 보일러에 우유/초콜릿 혼합한 재료를 집어 넣음");
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			System.out.println("2. 재료를 끓임");
			boiled = true;
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			System.out.println("3. 끓인 재료를 다음 단계로 넘김");
			empty = true;
		}
	}
 
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
