import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
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
                                { Branch = "ABC", TotalSales = 100, Date = DateTime.Today },
                                { Branch = "ABC", TotalSales = 50, Date = DateTime.Today.AddDays(-1) },
                                { Branch = "ABC", TotalSales = 400, Date = DateTime.Today.AddDays(-2) },
                                { Branch = "DEF", TotalSales = 200, Date = DateTime.Today }
                        }, "ABC"
                },
                {
                        new SalesItem[] {
                                { Branch = "ABC", TotalSales = 100, Date = DateTime.Today },
                                { Branch = "ABC", TotalSales = 50, Date = DateTime.Today.AddDays(-1) },
                                { Branch = "ABC", TotalSales = 200, Date = DateTime.Today.AddDays(-2) },
                                { Branch = "DEF", TotalSales = 500, Date = DateTime.Today }
                        }, "DEF"
                }
        });
    }

    private SalesItem[] fSales;
    private string fExpectedResult;

    public Challenge3_CalculateBestBranch(SalesItem[] sales, string expectedResult) {
        fSales = sales;
        fExpectedResult = expectedResult;
    }

    @Test
    public void test() {
        assertEquals(fExpectedResult, Challenge_3.CalculateBestBranch(fSales));
    }
}
