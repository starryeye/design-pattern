package part1_creational_pattern.sub3_abstract_factory.framework.windows;

import part1_creational_pattern.sub3_abstract_factory.framework.Square;

public class WindowsSquare extends Square {
    @Override
    public void draw() {
        System.out.println("window square draw");
    }

    // TODO: overriding
}
