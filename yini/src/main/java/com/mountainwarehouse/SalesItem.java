package com.mountainwarehouse;

import java.time.LocalDate;

public class SalesItem {
    public String Branch;
    public double TotalSales;
    public LocalDate Date;

    public SalesItem(String branch, double totalSales, LocalDate date) {
        Branch = branch;
        TotalSales = totalSales;
        Date = date;
    }
}
