package behavioral_pattern.state;

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
    public void dispense() {
        gumballMachine.releaseBall();
        // TODO: 현재 남아 있는 볼의 개수에 따라 다음 State로 이동 (2가지 경우 처리)
		int count = gumballMachine.getCount();

		if (count > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else if (count == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			throw new IllegalStateException();
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}
