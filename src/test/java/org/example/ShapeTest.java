package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void shouldHave4Corners() {
        Shape shape = new Shape();
        int corners = shape.getCorners();
        assertEquals(4,  corners);
        System.out.println("test ");
    }

}