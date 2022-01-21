package com.mountainwarehouse;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.Collection;

//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Challenge1_AddTax_ShouldThrow {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { Double.MAX_VALUE, 2 }
        });
    }

    private double fNonTaxAmount;
    private double fTaxRate;

    public Challenge1_AddTax_ShouldThrow(double nonTaxAmount, double taxRate) {
        fNonTaxAmount = nonTaxAmount;
        fTaxRate = taxRate;
    }

    @Test
    public void test() {
        assertThrows(BufferOverflowException.class, () -> Challenge_1.Add_Tax(fNonTaxAmount, fTaxRate));
    }
}
