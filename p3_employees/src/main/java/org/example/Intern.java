package org.example;

public class Intern extends Employee {
    private int testsDone;

    public Intern(int testsDone) {
        this.testsDone = testsDone;
    }

    @Override
    public double basicSalary() {
        return 20000;
    }

    @Override
    public double aditionalSalary() {
        return 2000 * testsDone;
    }

    public int getTestsDone() {
        return testsDone;
    }

    public void setTestsDones(int doneTests) {
        this.testsDone = doneTests;
    }
}
