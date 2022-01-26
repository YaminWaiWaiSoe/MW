package com.mountainwarehouse;

public class Challenge_4 {

	/**
	 * For this task you will have to calculate and return the stamp duty of a
	 * property you have purchased.
	 * Stamp duty is a type of tax applied by the UK goverment when you
	 * purchase a property, this tax works in price brackets - i.e the same way
	 * income tax does.
	 * Less than £300,000 there is 0% tax.
	 * £300,001 - £925,000 there is 5% tax.
	 * £925,001 - £1,500,000 there is 10% tax.
	 * £1,500,001+ there is 12% tax
	 * All amounts as each tax bracket is calculated is rounded to the nearest pound
	 * 
	 * For example if you buy a house worth £1,595,000:
	 * 0% on the first £300,000 = £0
	 * 5% on £624,999 (£300,001 -> £925,000) = £31,250
	 * 10% on £574,999 (£1,500,000 - £925,001) = £57,500
	 * 12% on the remaining £94,999 (£1,595,000 - £1,500,001) = £11,400
	 * Total tax = £100,150
	 * 
	 * @param propertyPrice The price of the property being bought
	 * @return Total stamp duty
	 */
	public static int StampDuty(int propertyPrice) {
		if (propertyPrice <= 300001)
			return 0;

		int startingValueForTax = propertyPrice;
		int tax = 0;

		if (startingValueForTax > 1500000) {
            startingValueForTax = startingValueForTax-1500000;//get the price over 1.5M
            tax= ((int)((12*startingValueForTax)/100));//find 12%
            //throw new RuntimeException("Not implemented");
            startingValueForTax = propertyPrice;
        }

        if (startingValueForTax > 925000) {
            
            if(startingValueForTax<1500000){
                startingValueForTax=startingValueForTax-925000;
                tax = ((int)((10*startingValueForTax)/100));//find 10% of the value above 300k and add onto the total tax
            }
            else{
                tax=tax+57500;//10% of 574,999
            }
            //throw new RuntimeException("Not implemented");
            startingValueForTax = propertyPrice;
        }

        if (startingValueForTax > 300000) {
            if(startingValueForTax<925000){
                startingValueForTax=startingValueForTax-300000;
                tax=((int)((5*startingValueForTax)/100));//find 5% of the value above 300k and add onto the total tax
            }
            else{
                tax=tax+31250;//5% on 624,999
            }
    		//throw new RuntimeException("Not implemented");
        }
        
		return tax;
	}
}
