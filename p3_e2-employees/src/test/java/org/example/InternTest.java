package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InternTest {

    @Test
    void constructorAndGetTestsDone() {
        Intern intern = new Intern(4);
        assertEquals(4, intern.getTestsDone());
    }

    @Test
    void basicSalaryIsFixed() {
        assertEquals(20000, new Intern(0).basicSalary());
        assertEquals(20000, new Intern(10).basicSalary());
    }

    @Test
    void aditionalSalaryScalesWithTestsDone() {
        assertEquals(0, new Intern(0).aditionalSalary());
        assertEquals(6000, new Intern(3).aditionalSalary());
    }

    @Test
    void salaryMatchesFormula() {
        Intern intern = new Intern(3);
        double basic = 20000;
        double aditional = 6000;
        double discount = basic * 0.13 + aditional * 0.05;
        assertEquals(basic + aditional + discount, intern.salary(), 1e-9);
    }

    @Test
    void salaryWithZeroTests() {
        Intern intern = new Intern(0);
        assertEquals(20000 + 0 + 20000 * 0.13, intern.salary(), 1e-9);
    }

    @Test
    void setTestsDonesUpdatesAditionalAndSalary() {
        Intern intern = new Intern(1);
        assertEquals(2000, intern.aditionalSalary());
        intern.setTestsDones(5);
        assertEquals(5, intern.getTestsDone());
        assertEquals(10000, intern.aditionalSalary());
        double basic = 20000;
        double aditional = 10000;
        assertEquals(basic + aditional + basic * 0.13 + aditional * 0.05, intern.salary(), 1e-9);
    }
}
