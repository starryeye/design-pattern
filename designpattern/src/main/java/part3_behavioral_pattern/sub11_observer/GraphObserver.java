package part3_behavioral_pattern.sub11_observer;

import java.util.stream.IntStream;

public class GraphObserver implements Observer {

    @Override
	public void update(NumberGenerator generator) {
		System.out.print("GraphObserver: ");
		
		// TODO: NumberGenerator 에서 정해진 숫자만큼 '*' 출력
		int number = generator.getNumber();
		IntStream.range(0, number)
				.forEach(i -> System.out.print("*"));
		System.out.println();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
    
}
