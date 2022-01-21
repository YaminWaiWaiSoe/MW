package com.mountainwarehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Challenge1_Discount {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 10, 0.2, 8 },
                { 78, 0.4, 46.8 },
                { 100, 1, -1 },
                { 100, 2, -1 },
                { 100, -1, -1 }
        });
    }

    private double fCurrentPrice;
    private double fDiscount;
    private double fExpectedResult;

    public Challenge1_Discount(double currentPrice, double discount, double expectedResult) {
        fCurrentPrice = currentPrice;
        fDiscount = discount;
        fExpectedResult = expectedResult;
    }

    @Test
    public void test() {
        assertEquals(fExpectedResult, Challenge_1.Discount(fCurrentPrice, fDiscount));
    }
}
