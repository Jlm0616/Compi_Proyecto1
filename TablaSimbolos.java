import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class TablaSimbolos {
    private HashMap<String, EntradaSimbolo> tabla = new HashMap<>();
    
    public void agregar(String nombre, String tipo, int linea) {
        tabla.put(nombre, new EntradaSimbolo(nombre, tipo, linea));
    }

    public List<EntradaSimbolo> obtenerEntradas() {
        return new ArrayList<>(tabla.values());
    }
    
    public void imprimir() {
        System.out.println("\n=== TABLA DE SIMBOLOS ===");
        System.out.println(String.format("%-15s %-10s %s", "Variable", "Tipo", "Linea"));
        System.out.println(String.format("%-15s %-10s %s", "--------", "----", "-----"));
        for (EntradaSimbolo s : tabla.values()) {
            System.out.println(String.format("%-15s %-10s %d", s.nombre, s.tipo, s.linea));
        }
    }
}

class EntradaSimbolo {
    String nombre;
    String tipo;
    int linea;
    
    EntradaSimbolo(String nombre, String tipo, int linea) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.linea = linea;
    }
}