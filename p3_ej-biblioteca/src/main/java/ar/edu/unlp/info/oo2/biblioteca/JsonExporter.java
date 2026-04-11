package ar.edu.unlp.info.oo2.biblioteca;


import java.util.List;

public abstract class JsonExporter implements Exporter {

    @Override
    public abstract String exportar(List<Socio> socios);
}
