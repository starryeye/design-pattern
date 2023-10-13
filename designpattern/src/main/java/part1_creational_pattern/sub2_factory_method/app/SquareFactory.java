package part1_creational_pattern.sub2_factory_method.app;

import part1_creational_pattern.sub2_factory_method.framework.Factory;
import part1_creational_pattern.sub2_factory_method.framework.Shape;

public class SquareFactory extends Factory {

    @Override
    protected Shape createShape() {
        return new Square();
    }
}
