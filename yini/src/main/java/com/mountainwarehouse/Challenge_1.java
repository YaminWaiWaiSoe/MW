package com.mountainwarehouse;

public class Challenge_1 {

	/**
	 * Receives an amount and returns the total amount including tax.
	 * 
	 * @param nonTaxAmount The total cost of goods without tax.
	 * @param The          tax rate The tax rate to be applied.
	 * @return Return the price including tax.
	 */
	public static double Add_Tax(double nonTaxAmount, double taxRate) {
        double taxAmount = nonTaxAmount * (1+taxRate);
        return taxAmount;
//		throw new RuntimeException("Not implemented");
	}

	/**
	 * Takes in the current price and returns the price after discount has been
	 * deducted.
	 * If the discount value is not valid then this method should return -1
	 *  
	 * @param currentPrice The current price of the product.
	 * @param discount     The percentage off of the rrp to be applied. E.g. 10% =
	 *                     0.1
	 * @return Returns the price after discount.
	 */
	public static double Discount(double currentPrice, double discount) {
        double discountPrice = currentPrice * (1-discount);
        return discountPrice;
//		throw new RuntimeException("Not implemented");
	}

	/**
	 * Calculate the total price where two items are part of a "Buy One Get One Half
	 * Price" promotion.
	 * The cheapest item is the item sold at half price
	 * 
	 * @param item1 The first item bought.
	 * @param item2 The second item bought.
	 * @return Returns total value of goods
	 */
	public static double Buy_One_Get_One_Half_Price(double item1, double item2) {
        double totalValue;
        if(item1<item2){
            totalValue=item1;
        }
        else{
            totalValue=item2;
        }
        return totalValue;
		//throw new RuntimeException("Not implemented");
	}

	/**
	 * Calculates the sum of items within an array.
	 * 
	 * @param amounts A list containing the price of each item.
	 * @return Returns the total value of goods.
	 */
	public static double Calculate_Total_Cost(double[] amounts) {
        double arrayTotal = 0;
        int i;
		for(i=0; i<amounts.length;i++){
            arrayTotal = arrayTotal + amounts[i];
        }
        return arrayTotal;
//		throw new RuntimeException("Not implemented");
	}

}
