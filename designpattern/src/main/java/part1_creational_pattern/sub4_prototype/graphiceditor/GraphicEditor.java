package part1_creational_pattern.sub4_prototype.graphiceditor;

import part1_creational_pattern.sub4_prototype.framework.graphic.GraphicManager;
import part1_creational_pattern.sub4_prototype.framework.graphic.Shape;

public class GraphicEditor {

	// TODO: GraphicManager 객체에 대한 참조
	private static final GraphicManager manager = new GraphicManager();

	public GraphicEditor() {
		Shape circle = new Circle();
		Shape roundedRect = new Rectangle("round off the edge");
		Shape normalRect = new Rectangle("normal");
		Shape square = new Square();
		
		// TODO: 4개의 객체를 이름과 Shape 타입으로 등록한다.
		manager.register("circle", circle);
		manager.register("rounded rectangle", roundedRect);
		manager.register("rectangle", normalRect);
		manager.register("square", square);
	}
	
	public void clickCircle() {
		// TODO: 다른 메소드 참고
		Shape s = manager.create("circle");
		s.draw();
	}
	
	public void clickRectangle() {
		Shape s = manager.create("rectangle");
		s.draw();
	}
	
	public void clickRoundedRectangle() {
		Shape s = manager.create("rounded rectangle");
		s.draw();
	}
	
	public void clickSquare() {
		// TODO: 다른 메소드 참고
		Shape s = manager.create("square");
		s.draw();
	}
}