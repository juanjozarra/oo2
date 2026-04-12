package org.example;

public class Factory extends Employee{
    private boolean married;
    private int childs;
    private int seniority;

    public Factory(boolean married, int childs, int seniority) {
        this.married = married;
        this.childs = childs;
        this.seniority = seniority;
    }

    @Override
    public double basicSalary() {
        return 50000;
    }

    @Override
    public double aditionalSalary() {
        return (married ? 5000 : 0) + (2000 * (childs + seniority));
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

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
}
