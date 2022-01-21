package com.mountainwarehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Challenge2_ReturnSmallestValueInArray {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 1 },
                { new int[] { 1, 2, -3, 4 }, -3 },
                { new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE, 1, 2, -3, 4 }, Integer.MIN_VALUE },
                { new int[] { 0, 0, 0, 0, 0 }, 0 },
                { new int[] { Integer.MAX_VALUE }, Integer.MAX_VALUE },
                { new int[] {}, 0 },
                { new int[] { Integer.MAX_VALUE - 1 }, Integer.MAX_VALUE - 1 },
        });
    }

    private int[] fNumbers;
    private int fExpectedResult;

    public Challenge2_ReturnSmallestValueInArray(int[] numbers, int expectedResult) {
        fNumbers = numbers;
        fExpectedResult = expectedResult;
    }

    @Test
    public void test() {
        assertEquals(fExpectedResult, Challenge_2.returnSmallestValueInArray(fNumbers));
    }
}
