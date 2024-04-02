package creational_pattern.abstract_factory.framework.linux;

import creational_pattern.abstract_factory.framework.Square;

public class LinuxSquare extends Square {
    @Override
    public void draw() {
        System.out.println("linux square draw");
    }

    // TODO: overriding
}
