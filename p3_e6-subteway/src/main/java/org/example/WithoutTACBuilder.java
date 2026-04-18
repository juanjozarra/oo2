package org.example;

public class WithoutTACBuilder implements Builder {
    private double result;

    @Override
    public void reset() {
        this.result = 0;
    }

    @Override
    public void buildBread() {
        this.result = this.result + 150;
    }

    @Override
    public void buildDressing() {
        this.result = this.result + 18;
    }

    @Override
    public void buildPrincipal() {
        this.result = this.result + 250;
    }

    @Override
    public void buildAdditional() {
        this.result = this.result + 200;
    }

    public double getResult() {
        return result;
    }
}
