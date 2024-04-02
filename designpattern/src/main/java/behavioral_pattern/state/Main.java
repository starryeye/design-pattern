package behavioral_pattern.state;

public class Main {

	/**
	 * observer pattern
	 *
	 * 객체의 내부 상태에 따라 스스로 행동을 변경할 수 있게 하는 패턴
	 *
	 * 상태를 별도의 클래스로 캡슐화한 다음 현재 상태를 나타내는 객체에게 행동을 위임
	 *
	 * 마치 객체의 클래스가 바뀌는 것 같은 효과를 얻음
	 *
	 * 구성(composition)을 통해서 여러 상태 객체를 바꿔가면서 사용
	 */

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}
}
