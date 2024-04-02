package creational_pattern.prototype.graphiceditor;

import creational_pattern.prototype.framework.graphic.Shape;

public class Rectangle extends Shape {
	
	private String type;
	
	public Rectangle(String type) {
		this.type = type;
	}
	
	@Override
	public void draw() {
		System.out.println("Draw " + type + " Rectangle");
	}
	
	@Override
	public Shape createClone() {
		Shape s = null;
		try {
			s = (Shape) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return s;
	}
}
