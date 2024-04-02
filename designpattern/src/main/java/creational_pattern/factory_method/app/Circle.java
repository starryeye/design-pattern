package creational_pattern.factory_method.app;

import creational_pattern.factory_method.framework.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }
}
