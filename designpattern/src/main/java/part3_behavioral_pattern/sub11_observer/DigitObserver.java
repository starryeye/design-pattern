package part3_behavioral_pattern.sub11_observer;

public class DigitObserver implements Observer {

    @Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver: " + generator.getNumber());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
