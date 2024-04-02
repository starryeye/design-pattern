package creational_pattern.abstract_factory.framework.linux;

import creational_pattern.abstract_factory.framework.Circle;

public class LinuxCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("linux circle draw");
    }

    // TODO: overriding
}
