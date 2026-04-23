import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Uso: java Main <archivo>");
            return;
        }
        
        Lexer lexer = new Lexer(new FileReader(args[0]));
        TablaSimbolos tabla = new TablaSimbolos();
        
        // ===== ESCRIBIR ARCHIVO DE TOKENS =====
        PrintWriter tokenWriter = new PrintWriter(new FileWriter("tokens.txt"));
        tokenWriter.println("=== TOKENS ENCONTRADOS ===\n");
        tokenWriter.println(String.format("%-25s %-20s %s", "Token", "Lexema", "Linea"));
        tokenWriter.println(String.format("%-25s %-20s %s", "-----", "------", "-----"));
        
        // Variables para detectar declaraciones
        String ultimoTipo = "";
        int ultimaLinea = 0;
        
        java_cup.runtime.Symbol token;
        while ((token = lexer.next_token()).sym != sym.EOF) {
            String nombreToken = sym.terminalNames[token.sym];
            String valor = token.value != null ? token.value.toString() : "";
            int linea = token.left;
            
            tokenWriter.println(String.format("%-25s %-20s %d", nombreToken, valor, linea));
            
            // Detectar tipo (int, float, bool, char, string)
            if (token.sym == sym.INT) {
                ultimoTipo = "int";
                ultimaLinea = linea;
            } else if (token.sym == sym.FLOAT) {
                ultimoTipo = "float";
                ultimaLinea = linea;
            } else if (token.sym == sym.BOOL) {
                ultimoTipo = "bool";
                ultimaLinea = linea;
            } else if (token.sym == sym.CHAR) {
                ultimoTipo = "char";
                ultimaLinea = linea;
            } else if (token.sym == sym.STRING) {
                ultimoTipo = "string";
                ultimaLinea = linea;
            }
            // Detectar identificador después de un tipo
            else if (token.sym == sym.IDENTIFICADOR && !ultimoTipo.isEmpty()) {
                tabla.agregar(valor, ultimoTipo, ultimaLinea);
                ultimoTipo = "";
            }
        }
        
        tokenWriter.println("\n=== FIN DEL ANALISIS ===");
        tokenWriter.close();
        
        // ===== ESCRIBIR TABLA DE SIMBOLOS EN ARCHIVO =====
        PrintWriter tablaWriter = new PrintWriter(new FileWriter("tabla_simbolos.txt"));
        tablaWriter.println("=== TABLA DE SIMBOLOS ===\n");
        tablaWriter.println(String.format("%-15s %-10s %s", "Variable", "Tipo", "Linea"));
        tablaWriter.println(String.format("%-15s %-10s %s", "--------", "----", "-----"));
        
        for (EntradaSimbolo s : tabla.obtenerEntradas()) {
            tablaWriter.println(String.format("%-15s %-10s %d", s.nombre, s.tipo, s.linea));
        }
        tablaWriter.close();
        
        System.out.println("Tokens guardados en: tokens.txt");
        System.out.println("Tabla de simbolos guardada en: tabla_simbolos.txt");
        
        // Ejecutar el parser normalmente
        parser p = new parser(new Lexer(new FileReader(args[0])));
        p.setTabla(tabla);
        p.parse();
        System.out.println("Analisis sintactico: EXITOSO");
    }
}
