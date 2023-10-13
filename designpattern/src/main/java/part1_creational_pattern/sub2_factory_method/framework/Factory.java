package part1_creational_pattern.sub2_factory_method.framework;

public abstract class Factory {
		
	public Shape create() {
		Shape shape = createShape();
		return shape;
	}
	
	protected abstract Shape createShape();

}
