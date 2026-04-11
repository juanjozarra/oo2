package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.util.List;

public class Jackson extends JsonExporter{

    @Override
    public String exportar(List<Socio> socios) {
        System.out.println("Exportando con Jackson");
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try{
            return ow.writeValueAsString(socios);
        }catch(JsonProcessingException e){
            throw new IllegalArgumentException("No se pudo convertir a formato json la lista de socios ");
        }
    }
}
