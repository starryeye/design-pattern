package creational_pattern.abstract_factory.framework.windows;

import creational_pattern.abstract_factory.framework.Square;

public class WindowsSquare extends Square {
    @Override
    public void draw() {
        System.out.println("window square draw");
    }

    // TODO: overriding
}
