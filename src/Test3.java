import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Test3 {

	@Test
	void Challenge3_StampDuty_1()
    {
        Assert.assertEquals(4750, Challenge_3.StampDuty(295000), 0);
    }
	
	@Test
	void Challenge3_StampDuty_2()
    {
        Assert.assertEquals(0, Challenge_3.StampDuty(125000), 0);
    }
}
