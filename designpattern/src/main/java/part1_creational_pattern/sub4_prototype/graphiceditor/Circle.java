package part1_creational_pattern.sub4_prototype.graphiceditor;

import part1_creational_pattern.sub4_prototype.framework.graphic.Shape;

public class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Draw Circle");
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
