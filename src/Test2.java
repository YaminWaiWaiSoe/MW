import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Test2 {

	@Test
	void Challenge2_Bugfix_1()
    {
        int[] numbers = { 1, 2, -3, 4 };
        Assert.assertEquals(1, Challenge_2.bugfix(numbers));
    }
	
	void Challenge2_Bugfix_2()
    {
        int[] numbers = { 1, 2, 3, 4 };
        Assert.assertEquals(1, Challenge_2.bugfix(numbers));
    }
	
	void Challenge2_Bugfix_3()
    {
        int[] numbers = { 1, 2, -3, 4, 5, -99, 100000, -92 };
        Assert.assertEquals(1, Challenge_2.bugfix(numbers));
    }
}
