package org.example;

public class Temporary extends Employee {
    private double workHours;
    private boolean married;
    private int childs;

    @Override
    public double basicSalary() {
        return 20000 + (workHours * 300);
    }

    @Override
    public double aditionalSalary() {
        return (married ? 5000 : 0) + (2000 * childs);
    }

    public Temporary(double workHours, boolean married, int childs) {
        this.workHours = workHours;
        this.married = married;
        this.childs = childs;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getChilds() {
        return childs;
    }

    public void setChilds(int childs) {
        this.childs = childs;
    }
}
