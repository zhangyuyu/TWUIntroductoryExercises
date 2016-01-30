package com.twu.yu;

import static com.twu.yu.Triangle.drawHorizontal;

public class Diamond {
    public void drawIsosceles(int number) {
        for (int i = 1; i <= number; i++) {
            drawSpace(number - i);
            drawHorizontal(2 * i - 1);
            System.out.println();
        }
    }

    private void drawSpace(int spaceNumber) {
        for (int i = 1; i <= spaceNumber; i++) {
            System.out.print(" ");
        }
    }
}
