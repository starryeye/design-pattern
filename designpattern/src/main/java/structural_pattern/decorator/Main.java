package structural_pattern.decorator;

public class Main {

	/**
	 * decorator pattern
	 *
	 * 객체에 동적으로 새로운 기능을 추가
	 *
	 * 기능 추가를 위해서 서브 클래스를 생성하는 것 보다 융통성이 있음
	 *
	 * 기존 클래스의 코드는 전혀 바꾸지 않고 객체에 새로운 임무를 부여
	 *
	 */
	
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(
				beverage.getDescription() + " $" + beverage.cost()
		);
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(
				beverage2.getDescription() + " $" + beverage2.cost()
		);
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(
				beverage3.getDescription() + " $" + beverage3.cost()
		);
		
		Beverage beverage4 = new Milk(new Espresso());
		System.out.println(
				beverage4.getDescription() + " $" + beverage4.cost()
		);
	}
}
