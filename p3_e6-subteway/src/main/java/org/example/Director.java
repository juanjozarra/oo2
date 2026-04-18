package org.example;

public class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void make(){
        builder.reset();
        builder.buildBread();
        builder.buildDressing();
        builder.buildPrincipal();
        builder.buildAdditional();
    }
}
