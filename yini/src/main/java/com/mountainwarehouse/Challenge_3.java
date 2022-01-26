package com.mountainwarehouse;

import java.util.HashMap;

public class Challenge_3 {
    /// <summary>
    /// It has been a busy year at mountain warehouse, having made lots of sales.
    /// Management would like to know which branch made the most in revenue.
    /// For this challenge you will be given an array of sales broken down by Branch
    /// and Date.
    /// You will need to sum all branch sales across multiple days and identify
    /// which
    /// branch had the highest sales overall
    /// Assume that there is only one branch with the highest total
    /// We have provided some comments to help assist the steps we think you need to
    /// go through
    /// </summary>
    /// <param name="sales">The array of sales items</param>
    /// <returns>The branch with the best performing sales</returns>
    public static String CalculateBestBranch(SalesItem[] sales) {
        HashMap<String, Double> branchSales = new HashMap<String, Double>();

        // TODO: Add branch sales to Hash Map
        //SalesItem("ABC", 100, LocalDate.now())
        for(int i =0; i<sales.length;i++){//loop the list of sales
            Object value = Object.values(sales[i][1]);//get the value of totalSales
            Object key = Object.values(sales[i][0]);//get the value of totalSales
            branchSales.put((String)key,(double)value);//put the sale into hashmap 
            // branchSales.put(Integer.toString(i),(int)sales[i][1]);
        }
    
            
        // TODO: Sort/get entry with highest sales value
        int biggestSale=(Collections.max(branchSales.values()));
        String biggestSaleBranch = biggestSale.getKey();

        // TODO: Return branch
        return biggestSaleBranch;

        //add dictionary
        //go through sales
        //loop through dictionary add branch
        //add value to existing value
    }
}