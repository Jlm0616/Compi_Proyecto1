import java.io.*;

public class TestLexer {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Uso: java TestLexer <archivo>");
            return;
        }
        
        Lexer lexer = new Lexer(new FileReader(args[0]));
        java_cup.runtime.Symbol token;
        
        System.out.println("=== TOKENS ENCONTRADOS ===\n");
        
        while ((token = lexer.next_token()).sym != sym.EOF) {
            String nombre = sym.terminalNames[token.sym];  // ← CAMBIO: nombres → terminalNames
            String valor = token.value != null ? token.value.toString() : "";
            System.out.println("Token: " + nombre + "\tLexema: " + valor + "\tLinea: " + token.left);
        }
        
        System.out.println("\n=== FIN DEL ANALISIS ===");
        System.out.println("Total de errores lexicos: " + Lexer.erroresLexicos);
    }
}