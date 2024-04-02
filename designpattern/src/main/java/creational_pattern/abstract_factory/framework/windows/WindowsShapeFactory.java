package creational_pattern.abstract_factory.framework.windows;

import creational_pattern.abstract_factory.framework.AbstractShapeFactory;
import creational_pattern.abstract_factory.framework.Circle;
import creational_pattern.abstract_factory.framework.Square;

public class WindowsShapeFactory extends AbstractShapeFactory {
    @Override
    public Circle createCircle() {
        return new WindowsCircle();
    }

    @Override
    public Square createSquare() {
        return new WindowsSquare();
    }

    // TODO: overriding
}
