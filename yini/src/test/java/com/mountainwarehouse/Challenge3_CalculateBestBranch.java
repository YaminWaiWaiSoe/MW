package com.mountainwarehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
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
public class Challenge3_CalculateBestBranch {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {
                        new SalesItem[] {
                                new SalesItem("ABC", 100, LocalDate.now()),
                                new SalesItem("ABC", 50, LocalDate.now().minusDays(-1) ),
                                new SalesItem("ABC", 400, LocalDate.now().minusDays(-2) ),
                                new SalesItem("DEF", 200, LocalDate.now()),
                        }, "ABC"
                },
                {
                        new SalesItem[] {
                                new SalesItem("ABC", 100, LocalDate.now() ),
                                new SalesItem("ABC", 50, LocalDate.now().minusDays(-1) ),
                                new SalesItem("ABC", 200, LocalDate.now().minusDays(-2) ),
                                new SalesItem("DEF", 500, LocalDate.now()),
                        }, "DEF"
                }
        });
    }

    private SalesItem[] fSales;
    private String fExpectedResult;

    public Challenge3_CalculateBestBranch(SalesItem[] sales, String expectedResult) {
        fSales = sales;
        fExpectedResult = expectedResult;
    }

    @Test
    public void test() {
        assertEquals(fExpectedResult, Challenge_3.CalculateBestBranch(fSales));
    }
}
