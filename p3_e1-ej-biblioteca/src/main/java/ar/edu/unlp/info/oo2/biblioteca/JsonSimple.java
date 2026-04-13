package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonSimple extends JsonExporter{

    @Override
    public String exportar(List<Socio> socios) {
        System.out.println("Exportando con JsonSimple");
        List<JSONObject> sociosJson = new ArrayList<>();
        socios.forEach(socio -> {
            JSONObject obj = new JSONObject();
            obj.put("nombre", socio.getNombre());
            obj.put("legajo", socio.getLegajo());
            obj.put("email", socio.getEmail());
            sociosJson.add(obj);
        });
        return sociosJson.toString();
    }
}
