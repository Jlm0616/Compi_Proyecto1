import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class TablaSimbolos {
    private HashMap<String, EntradaSimbolo> tabla = new HashMap<>();
    
    public void agregar(String nombre, String tipo, int linea) {
        if (tabla.containsKey(nombre)) {
            System.err.println("[ERROR SEMANTICO] Linea " + linea + ": Variable '" + nombre + "' ya declarada");
        } else {
            tabla.put(nombre, new EntradaSimbolo(nombre, tipo, linea));
            System.out.println("[TABLA] " + nombre + " : " + tipo);
        }
    }
    
    public List<EntradaSimbolo> obtenerEntradas() {
        return new ArrayList<>(tabla.values());
    }
    
    public void imprimir() {
        System.out.println("\n=== TABLA DE SIMBOLOS ===");
        for (EntradaSimbolo s : tabla.values()) {
            System.out.println("  " + s.nombre + " | " + s.tipo + " | linea " + s.linea);
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