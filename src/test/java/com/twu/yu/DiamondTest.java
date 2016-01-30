package com.twu.yu;

import org.junit.Test;

public class DiamondTest {
    @Test
    public void isoscelesTriangle() throws Exception {
        Diamond diamond = new Diamond();
        diamond.drawIsosceles(3);
    }

    @Test
    public void drawDiamond() throws Exception {
        Diamond diamond = new Diamond();
        diamond.drawDiamond(3);
    }

    @Test
    public void DiamondWithName() throws Exception {
        Diamond diamond = new Diamond();
        diamond.drawDiamondWithName(3, "zhangyu");
    }
}