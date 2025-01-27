package com.thealgorithms.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeronsFormulaTest {

    @org.junit.Test
    public void test1() {
        Assertions.assertEquals(HeronsFormula.Herons(3, 4, 5), 6.0);
    }

    @Test
    void test2() {
        Assertions.assertEquals(HeronsFormula.Herons(24, 30, 18), 216.0);
    }

    @Test
    void test3() {
        Assertions.assertEquals(HeronsFormula.Herons(1, 1, 1), 0.4330127018922193);
    }

    @Test
    void test4() {
        Assertions.assertEquals(HeronsFormula.Herons(4, 5, 8), 8.181534085976786);
    }
}
