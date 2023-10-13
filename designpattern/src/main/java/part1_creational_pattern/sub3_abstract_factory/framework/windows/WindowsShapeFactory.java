package part1_creational_pattern.sub3_abstract_factory.framework.windows;

import part1_creational_pattern.sub3_abstract_factory.framework.AbstractShapeFactory;
import part1_creational_pattern.sub3_abstract_factory.framework.Circle;
import part1_creational_pattern.sub3_abstract_factory.framework.Square;

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
