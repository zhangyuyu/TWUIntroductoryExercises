package com.twu.yu;

import static com.twu.yu.Triangle.drawHorizontal;

public class Diamond {
    public void drawIsosceles(int number) {
        drawIsoscelesExceptCenter(number,true);
        drawHorizontal(number * 2 - 1);
    }

    private void drawSpace(int spaceNumber) {
        for (int i = 1; i <= spaceNumber; i++) {
            System.out.print(" ");
        }
    }

    public void drawDiamond(int number) {
        drawIsoscelesExceptCenter(number,true);
        drawHorizontal(number * 2 - 1);
        System.out.println();
        drawIsoscelesExceptCenter(number,false);
    }

    private void drawIsoscelesExceptCenter(int x, boolean up) {
        if (up) {
            for (int i = 1; i < x; i++) {
                drawSpace(x - i);
                drawHorizontal(2 * i - 1);
                System.out.println();
            }
        } else {
            for (int i = x - 1; i > 0; i--) {
                drawSpace(x - i);
                drawHorizontal(2 * i - 1);
                System.out.println();
            }
        }
    }
}
