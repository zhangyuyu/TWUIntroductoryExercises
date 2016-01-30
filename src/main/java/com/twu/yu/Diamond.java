package com.twu.yu;

import static com.twu.yu.Triangle.drawHorizontal;

public class Diamond {
    public void drawIsosceles(int number) {
        drawIsoscelesExceptCenter(number,true);
        drawHorizontal(number * 2 - 1);
    }

    public void drawDiamond(int number) {
        drawIsosceles(number);
        System.out.println();
        drawIsoscelesExceptCenter(number, false);
    }

    public void drawDiamondWithName(int number, String name) {
        drawIsoscelesExceptCenter(number,true);
        System.out.println(name);
        drawIsoscelesExceptCenter(number,false);
    }

    private void drawIsoscelesExceptCenter(int number, boolean up) {
        if (up) {
            for (int line = 1; line < number; line++) {
                drawLineOfIsosceles(number, line);
            }
        } else {
            for (int line = number - 1; line > 0; line--) {
                drawLineOfIsosceles(number, line);
            }
        }
    }

    private void drawLineOfIsosceles(int number, int line) {
        drawSpace(number - line);
        drawHorizontal(2 * line - 1);
        System.out.println();
    }

    private void drawSpace(int spaceNumber) {
        for (int line = 1; line <= spaceNumber; line++) {
            System.out.print(" ");
        }
    }
}
