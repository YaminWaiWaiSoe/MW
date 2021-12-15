import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Test1 {
	
	double[] numbers = {10, 20, 30, 40};

	@Test
	void Challenge1_AddTax() {
		Assert.assertEquals(15, Challenge_1.Add_Tax(10, 0.5), 0 );
	}
	
	@Test
	void Challenge1_Discount() {
		Assert.assertEquals(15, Challenge_1.Discount(10, 0.5), 0 );
	}
	
	@Test
	void Challenge1_Buy_One_Get_One_Half_Price() {
		Assert.assertEquals(15, Challenge_1.Buy_One_Get_One_Half_Price(10, 0.5), 0 );
	}
	
	@Test
	void Challenge1_Calculate_Total_Cost() {
		Assert.assertEquals(100, Challenge_1.Calculate_Total_Cost(numbers), 0 );
	}
}
