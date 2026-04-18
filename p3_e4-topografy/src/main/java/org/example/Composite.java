package org.example;

import java.util.List;

public class Composite implements Celda {
    private List<Celda> celdas;

    public void addCelda(Celda celda) {
        celdas.add(celda);
    }

    public void removeCelda(Celda celda) {
        celdas.remove(celda);
    }

    @Override
    public int topologia() {
        return this.celdas.stream().mapToInt(Celda::topologia).sum();
    }
}
