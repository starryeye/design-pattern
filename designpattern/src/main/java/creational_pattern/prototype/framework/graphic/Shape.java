package creational_pattern.prototype.framework.graphic;

public abstract class Shape implements Cloneable {
	
	public abstract void draw();
	public abstract Shape createClone();
}
