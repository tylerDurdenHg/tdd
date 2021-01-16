package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void calculateSquare() {
        Square square = new Square();
        long actual = square.getSquare(25);
        assertEquals(5, actual);
    }

    @Tag("Multiply Two")
    @Test
    void multiplyTwo() {
        Square square = new Square();
        long actual = square.multiplyTwo(5);
        assertEquals(11, actual, "is not equal");
    }
}
