package com.twu.yu;

import org.junit.Test;

public class TriangleTest {
    @Test
    public void printOneAsteriskToTheConsole() throws Exception {
        System.out.println("*");
    }

    @Test
    public void print3AsterisksonOneLineWhenGivenNumberIs3() throws Exception {
        Triangle triangle = new Triangle();
        triangle.drawHorizontal(3);
    }

    @Test
    public void print3LinesWithOneAsteriskPerLineWhenGivenNumberIs3() throws Exception {
        Triangle triangle = new Triangle();
        triangle.drawVertical(3);
    }

    @Test
    public void print3LinesWithLinenumberAsteriskPerLineWhenGivenNumberIs3() throws Exception {
        Triangle triangle = new Triangle();
        triangle.drawRightRriangle(3);
    }
}
