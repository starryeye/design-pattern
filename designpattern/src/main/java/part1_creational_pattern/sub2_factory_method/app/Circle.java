package part1_creational_pattern.sub2_factory_method.app;

import part1_creational_pattern.sub2_factory_method.framework.Shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }
}
