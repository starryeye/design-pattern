package creational_pattern.abstract_factory;

import creational_pattern.abstract_factory.framework.Circle;
import creational_pattern.abstract_factory.framework.Square;
import creational_pattern.abstract_factory.framework.AbstractShapeFactory;
import creational_pattern.abstract_factory.framework.linux.LinuxShapeFactory;
import creational_pattern.abstract_factory.framework.windows.WindowsShapeFactory;

public class Main {

	/**
	 * abstract factory
	 *
	 * 상세화된 서브클래스를 정의하지 않고도
	 * 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한
	 * 인터페이스를 제공한다.
	 */

	public static void main(String[] args) {
		
		// TODO: factory로 부터 각각 circle과 square를 생성한다.
		// 생성된 circle과 square 참조를 이용해 그림을 그린다.

		AbstractShapeFactory linuxFactory = new LinuxShapeFactory();
		Circle linuxCircle = linuxFactory.createCircle();
		linuxCircle.draw();
		Square linuxSquare = linuxFactory.createSquare();
		linuxSquare.draw();


		AbstractShapeFactory windowFactory = new WindowsShapeFactory();
		Circle windowCircle = windowFactory.createCircle();
		windowCircle.draw();
		Square windowSquare = windowFactory.createSquare();
		windowSquare.draw();
	}
}
