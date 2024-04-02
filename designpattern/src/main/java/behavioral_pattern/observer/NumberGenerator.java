package behavioral_pattern.observer;

import java.util.ArrayList;

public abstract class NumberGenerator {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
		// TODO:
		observers.add(observer);
	}
	
	public void deleteObserer(Observer observer) {
		// TODO:
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		// TODO: 등록된 모든 observer 들의 메소드 호출
		observers.forEach(
				observer -> observer.update(this)
		);
	}
	
	public abstract int getNumber();
	public abstract void execute();
}
