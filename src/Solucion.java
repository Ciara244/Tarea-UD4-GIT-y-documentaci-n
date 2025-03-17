import java.lang.StringBuilder;
public class Solucion {

    static String toCamelCase(String s){
        String[] lista;
        StringBuilder camelCase = new StringBuilder();
        if(s.contains("-")){
            lista = s.split("-");
            for(String palabras: lista){
                camelCase.append(palabras);
            }
        }else if(s.contains("_")){
            lista = s.split("_");
            for(String palabras: lista){
                camelCase.append(palabras);
            }
        }
        return camelCase.toString();
    }
}