package creational_pattern.prototype.graphiceditor;
import creational_pattern.prototype.framework.graphic.Shape;

public class Square extends Shape {
	
	@Override
	public void draw() {
		// TODO:
		System.out.println("Draw Square");
	}
	
	@Override
	public Shape createClone() {
		// TODO:
		Shape s = null;
		try {
			s = (Shape) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return s;
	}
}
