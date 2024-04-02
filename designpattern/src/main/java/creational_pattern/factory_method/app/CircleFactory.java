package creational_pattern.factory_method.app;

import creational_pattern.factory_method.framework.Factory;
import creational_pattern.factory_method.framework.Shape;

public class CircleFactory extends Factory {


    @Override
    protected Shape createShape() {
        return new Circle();
    }
}
