package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TemporaryTest {

    @Test
    void constructorInitialState() {
        Temporary t = new Temporary(12.5, true, 2);
        assertEquals(12.5, t.getWorkHours(), 1e-9);
        assertTrue(t.isMarried());
        assertEquals(2, t.getChilds());
    }

    @Test
    void basicSalaryIncludesHourlyComponent() {
        Temporary t = new Temporary(10, false, 0);
        assertEquals(20000 + 10 * 300, t.basicSalary(), 1e-9);
    }

    @Test
    void aditionalSalaryWhenNotMarried() {
        Temporary t = new Temporary(0, false, 3);
        assertEquals(6000, t.aditionalSalary());
    }

    @Test
    void aditionalSalaryWhenMarried() {
        Temporary t = new Temporary(0, true, 1);
        assertEquals(5000 + 2000, t.aditionalSalary());
    }

    @Test
    void salaryDiscountAndTotalSalary() {
        Temporary t = new Temporary(10, false, 2);
        double basic = 20000 + 10 * 300;
        double aditional = 4000;
        double discount = basic * 0.13 + aditional * 0.05;
        assertEquals(discount, t.salaryDiscount(), 1e-9);
        assertEquals(basic + aditional + discount, t.salary(), 1e-9);
    }

    @Test
    void settersUpdateComputedAmounts() {
        Temporary t = new Temporary(0, false, 0);
        assertEquals(20000, t.basicSalary(), 1e-9);
        assertEquals(0, t.aditionalSalary());

        t.setWorkHours(5);
        assertEquals(20000 + 5 * 300, t.basicSalary(), 1e-9);

        t.setMarried(true);
        assertEquals(5000, t.aditionalSalary());

        t.setChilds(2);
        assertEquals(5000 + 4000, t.aditionalSalary());
    }
}
