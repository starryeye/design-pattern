package part1_creational_pattern.sub3_abstract_factory.framework.windows;

import part1_creational_pattern.sub3_abstract_factory.framework.Circle;

public class WindowsCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("window circle draw");
    }

    // TODO: overriding
}
