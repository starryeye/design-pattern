package part1_creational_pattern.sub2_factory_method;

import java.util.ArrayList;
import java.util.List;

import part1_creational_pattern.sub2_factory_method.app.CircleFactory;
import part1_creational_pattern.sub2_factory_method.app.SquareFactory;
import part1_creational_pattern.sub2_factory_method.framework.Factory;
import part1_creational_pattern.sub2_factory_method.framework.Shape;

public class Main {

	/**
	 * factory method pattern
	 *
	 * 1. 객체를 생성하기 위해 인터페이스를 정의해둠,
	 * 어떤 클래스의 인스턴스를 생성할지에 대한 결정은 서브 클래스가 준다.
	 *
	 * 2. 기반클래스가 대부분의 일을 하지만 정확히 어떤 객체를 갖고 작업할지에 대해서는
	 * 런타임 시로 미룰때 유용하다.
	 *
	 * 3. Virtual Constructor 라고도 불림
	 */

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		// TODO: Factory Method를 사용해 4개의 객체를 생성
		// circle, square, circle, square
		// ArrayList에 저장하고, 메소드를 호출해 순서대로 그린다.

		Factory circleFactory = new CircleFactory();
		Factory squareFactory = new SquareFactory();

		Shape circle1 = circleFactory.create();
		Shape square1 = squareFactory.create();
		Shape circle2 = circleFactory.create();
		Shape square2 = squareFactory.create();

		shapes.addAll(List.of(circle1, square1, circle2, square2));

		drawAllShapes(shapes);
	}

	private static void drawAllShapes(ArrayList<Shape> shapes) {

		shapes.forEach(Shape::draw);
	}
}
