import java.lang.StringBuilder;
public class Solucion {

    static String toCamelCase(String s){
        String[] lista;
        String camelCase = "";
        if(s.contains("-")){
            lista = s.split("-");
            for(String palabras: lista){
                camelCase += palabras;
            }
        }else if(s.contains("_")){
            lista = s.split("_");
            for(String palabras: lista){
                camelCase += palabras;
            }
        }
        return camelCase;
    }
}

