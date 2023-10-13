package part1_creational_pattern.sub1_singleton;
 
public class Main {

	/**
	 * 오직 한 개의 클래스 인스턴스만을 갖도록 보장하고,
	 * 이에 대한 전역적인 접근을 할 수 있도록 한다.
	 */
	
	public static void main(String args[]) {
//		ChocolateBoiler boiler = new ChocolateBoiler();
//		boiler.fill();
//		boiler.boil();
//
//		ChocolateBoiler boiler2 = new ChocolateBoiler();
//		boiler2.fill();
//		boiler.drain();
//		boiler2.boil();
//		boiler2.drain();

		ChocolateBoiler boilerSingle = ChocolateBoiler.getInstance();


		boilerSingle.fill();
		boilerSingle.boil();

		ChocolateBoiler boilerSingle2 = ChocolateBoiler.getInstance();
		boilerSingle2.fill();
		boilerSingle.drain();
		boilerSingle2.boil();
		boilerSingle2.drain();
	}
}
