package creational_pattern.abstract_factory.framework.windows;

import creational_pattern.abstract_factory.framework.Circle;

public class WindowsCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("window circle draw");
    }

    // TODO: overriding
}
