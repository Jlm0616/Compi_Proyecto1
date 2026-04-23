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
        }
    }

    public boolean existe(Object id) {
        return tabla.containsKey(id.toString());
    }
    
    
    public String getTipo(Object id) {
        EntradaSimbolo entrada = tabla.get(id.toString());
        return entrada != null ? entrada.tipo : null;
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