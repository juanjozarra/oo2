package org.example;

public abstract class Employee {

    public double salary(){
        return this.basicSalary() + this.aditionalSalary() + this.salaryDiscount();
    }

    public abstract double basicSalary();

    public abstract double aditionalSalary();

    public double salaryDiscount() {
        return this.basicSalary()*0.13 + this.aditionalSalary()*0.05;
    }

}
