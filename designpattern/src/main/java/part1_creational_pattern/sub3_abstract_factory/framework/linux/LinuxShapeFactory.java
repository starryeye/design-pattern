package part1_creational_pattern.sub3_abstract_factory.framework.linux;

import part1_creational_pattern.sub3_abstract_factory.framework.AbstractShapeFactory;
import part1_creational_pattern.sub3_abstract_factory.framework.Circle;
import part1_creational_pattern.sub3_abstract_factory.framework.Square;

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
