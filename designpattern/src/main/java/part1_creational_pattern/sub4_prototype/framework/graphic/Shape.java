package part1_creational_pattern.sub4_prototype.framework.graphic;

public abstract class Shape implements Cloneable {
	
	public abstract void draw();
	public abstract Shape createClone();
}
