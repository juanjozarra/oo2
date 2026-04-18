package org.example;

public class Topografia implements Celda {
    int[] composicion;

    public Topografia(int[] composicion) {
        this.composicion = composicion;
    }

    @Override
    public int topologia() {
        int total = 0;
        for (int j : composicion) {
            total = total + j;
        }
        return total/composicion.length;
    }
}
