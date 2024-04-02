package behavioral_pattern.observer;

public class IncrementalNumberGenerator extends NumberGenerator {
    
	private int number;
	private int end;
	private int inc;
	
	public IncrementalNumberGenerator(int start, int end, int inc) {
		this.number = start;
		this.end = end;
		this.inc = inc;
	}
	
	@Override
	public int getNumber() {
		return number;
	}
	
	@Override
	public void execute() {
		// TODO: 등록된 observer들에게 변경사항 통지
		while(number < end) {
			notifyObservers();
			number += inc;
		}
	}
}
