package creational_pattern.factory_method.app;

import creational_pattern.factory_method.framework.Shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square draw");
    }
}
