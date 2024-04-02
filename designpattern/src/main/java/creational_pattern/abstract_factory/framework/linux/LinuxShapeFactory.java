package creational_pattern.abstract_factory.framework.linux;

import creational_pattern.abstract_factory.framework.AbstractShapeFactory;
import creational_pattern.abstract_factory.framework.Circle;
import creational_pattern.abstract_factory.framework.Square;

public class LinuxShapeFactory extends AbstractShapeFactory {
    @Override
    public Circle createCircle() {
        return new LinuxCircle();
    }

    @Override
    public Square createSquare() {
        return new LinuxSquare();
    }


    // TODO: overriding
}
