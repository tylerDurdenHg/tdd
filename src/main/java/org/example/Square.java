package org.example;

public class Square {
    private int factor = 2 ;

    public long getSquare(int i) {
        return (long) Math.sqrt(i);
    }

    public long multiplyTwo(int i) {
        return i * factor;
    }
}
