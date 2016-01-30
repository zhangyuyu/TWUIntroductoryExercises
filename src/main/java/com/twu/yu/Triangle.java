package com.twu.yu;

public class Triangle {
    public static void drawHorizontal(int number) {
        for (int line = 1; line <= number; line++) {
            System.out.print("*");
        }
    }

    public void drawVertical(int number) {
        for (int line = 1; line <= number; line++) {
            System.out.println("*");
        }
    }

    public void drawRightRriangle(int number) {
        for (int line = 1; line <= number; line++) {
            drawHorizontal(line);
            System.out.println();
        }
    }
}
