package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FactoryTest {

    @Test
    void constructorInitialState() {
        Factory f = new Factory(true, 2, 5);
        assertTrue(f.isMarried());
        assertEquals(2, f.getChilds());
        assertEquals(5, f.getSeniority());
    }

    @Test
    void basicSalaryIsFixed() {
        assertEquals(50000, new Factory(false, 0, 0).basicSalary());
    }

    @Test
    void aditionalSalaryWhenNotMarried() {
        Factory f = new Factory(false, 1, 2);
        assertEquals(2000 * (1 + 2), f.aditionalSalary());
    }

    @Test
    void aditionalSalaryWhenMarried() {
        Factory f = new Factory(true, 0, 1);
        assertEquals(5000 + 2000 * (0 + 1), f.aditionalSalary());
    }

    @Test
    void salaryUsesDiscountFormula() {
        Factory f = new Factory(false, 1, 2);
        double basic = 50000;
        double aditional = 2000 * 3;
        double discount = basic * 0.13 + aditional * 0.05;
        assertEquals(discount, f.salaryDiscount(), 1e-9);
        assertEquals(basic + aditional + discount, f.salary(), 1e-9);
    }

    @Test
    void settersUpdateAditionalAndSalary() {
        Factory f = new Factory(false, 0, 0);
        assertEquals(0, f.aditionalSalary());

        f.setMarried(true);
        assertEquals(5000, f.aditionalSalary());

        f.setChilds(1);
        assertEquals(5000 + 2000, f.aditionalSalary());

        f.setSeniority(2);
        assertEquals(5000 + 2000 * (1 + 2), f.aditionalSalary());

        double basic = 50000;
        double aditional = 5000 + 6000;
        assertEquals(basic + aditional + basic * 0.13 + aditional * 0.05, f.salary(), 1e-9);
    }
}
