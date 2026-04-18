package org.example;

public class VeganBuilder implements Builder {
    private double result;

    @Override
    public void reset() {
        this.result = 0;
    }

    @Override
    public void buildBread() {
        this.result = this.result + 100;
    }

    @Override
    public void buildDressing() {
        this.result = this.result + 20;
    }

    @Override
    public void buildPrincipal() {
        this.result = this.result + 500;
    }

    @Override
    public void buildAdditional() {
        this.result = this.result + 0;
    }

    public double getResult() {
        return result;
    }
}
