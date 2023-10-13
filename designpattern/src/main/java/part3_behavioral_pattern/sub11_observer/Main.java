package part3_behavioral_pattern.sub11_observer;

public class Main {

	/**
	 * observer pattern
	 *
	 * 객체 사이에 1:N 의 의존 관계를 정의해 두어, 어떤 객체의 상태가 변할 때
	 * 그 객체에 의존성을 가진 다른 객체들이 그 변화를 통지 받고 자동으로 갱신될 수 있게 한다.
	 *
	 * 상태 변화에 따른 처리를 기술할 때 효과적
	 *
	 * 상호작용 하지만 서로에 대해 잘 모름
	 *
	 * 1-to-many relationship, change propagation, loosely coupling
	 */
	
	public static void main(String[] args) {
		NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
		
		Observer digitobserver = new DigitObserver();
		Observer graphobserver = new GraphObserver();
		
		generator.addObserver(digitobserver);
		generator.addObserver(graphobserver);
		
		generator.execute();
	}

}
