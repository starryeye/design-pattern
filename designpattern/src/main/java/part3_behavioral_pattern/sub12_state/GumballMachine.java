package part3_behavioral_pattern.sub12_state;

public class GumballMachine {
 
	// TODO: 4개의 State에 대한 참조 선언
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;

	State state = null;
	int count = 0;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
 
    int getCount() {
        return count;
    }
    
    void setState(State state) {
		// TODO:
		this.state = state;
    }
 
    public State getState() {
		// TODO:
		return state;
    }
    
    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
	public void insertQuarter() {
		// TODO: 현재의 State에 맞는 메소드 호출
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		// TODO: 현재의 State에 맞는 메소드 호출
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		// TODO: 현재의 State에 맞는 메소드 호출
		// 손잡이를 돌리고, 배출하는 메소스까지 호출
		state.turnCrank();
		state.dispense();
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2012");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		
		return result.toString();
	}
}
