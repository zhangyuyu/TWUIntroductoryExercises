package com.twu.yu;

public class Triangle {
    public static void drawHorizontal(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
    }

    public void drawVertical(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println("*");
        }
    }

    public void drawRightRriangle(int number) {
        for (int i = 1; i <= number; i++) {
            drawHorizontal(i);
            System.out.println();
        }
    }
}
