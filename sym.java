/**
 * Constantes de tokens para el lenguaje
 * Generado por CUP, pero definido manualmente para el lexer
 */

public class sym {
    /* Palabras reservadas */
    public static final int PALABRA_MAIN = 1;
    public static final int INT = 2;
    public static final int FLOAT = 3;
    public static final int BOOL = 4;
    public static final int CHAR = 5;
    public static final int STRING = 6;
    public static final int IF = 7;
    public static final int ELSE = 8;
    public static final int DO = 9;
    public static final int WHILE = 10;
    public static final int SWITCH = 11;
    public static final int CASE = 12;
    public static final int DEFAULT = 13;
    public static final int RETURN = 14;
    public static final int BREAK = 15;
    public static final int CIN = 16;
    public static final int COUT = 17;
    public static final int BOOLEANO = 18;
    public static final int EMPTY = 19;
    
    /* Operadores relacionales */
    public static final int EQUAL = 20;
    public static final int N_EQUAL = 21;
    public static final int LESS_T = 22;
    public static final int LESS_TE = 23;
    public static final int GREATER_T = 24;
    public static final int GREATER_TE = 25;
    
    /* Operadores y símbolos */
    public static final int ASIGNACION = 26;
    public static final int SEPARADOR = 27;
    public static final int DELIMITADOR_EXP = 28;
    public static final int INICIO_BLOQUE = 29;
    public static final int FIN_BLOQUE = 30;
    public static final int INICIO_PARENTESIS = 31;
    public static final int FIN_PARENTESIS = 32;
    public static final int INICIO_INDICE = 33;
    public static final int FIN_INDICE = 34;
    public static final int COMA = 35;
    public static final int DOS_PUNTOS = 36;
    public static final int MAS = 37;
    public static final int MENOS = 38;
    public static final int MULTIPLICACION = 39;
    public static final int DIVISION = 40;
    public static final int MODULO = 41;
    public static final int POTENCIA = 42;
    public static final int INCREMENTO = 43;
    public static final int DECREMENTO = 44;
    public static final int OPERADOR_LOGICO_BINARIO = 45;
    public static final int OPERADOR_LOGICO_UNARIO = 46;
    
    /* Literales */
    public static final int NUMERO_ENTERO = 47;
    public static final int NUMERO_FLOTANTE = 48;
    public static final int NOTACION_CIENTIFICA = 49;
    public static final int FRACCIONARIO = 50;
    public static final int CADENA = 51;
    public static final int CARACTER = 52;
    public static final int IDENTIFICADOR = 53;
    
    /* Fin de archivo */
    public static final int EOF = 54;
    
    /* Arreglo con nombres de tokens para reportes */
    public static String[] nombres = new String[55];
    
    static {
        nombres[PALABRA_MAIN] = "PALABRA_MAIN";
        nombres[INT] = "INT";
        nombres[FLOAT] = "FLOAT";
        nombres[BOOL] = "BOOL";
        nombres[CHAR] = "CHAR";
        nombres[STRING] = "STRING";
        nombres[IF] = "IF";
        nombres[ELSE] = "ELSE";
        nombres[DO] = "DO";
        nombres[WHILE] = "WHILE";
        nombres[SWITCH] = "SWITCH";
        nombres[CASE] = "CASE";
        nombres[DEFAULT] = "DEFAULT";
        nombres[RETURN] = "RETURN";
        nombres[BREAK] = "BREAK";
        nombres[CIN] = "CIN";
        nombres[COUT] = "COUT";
        nombres[BOOLEANO] = "BOOLEANO";
        nombres[EMPTY] = "EMPTY";
        nombres[EQUAL] = "EQUAL";
        nombres[N_EQUAL] = "N_EQUAL";
        nombres[LESS_T] = "LESS_T";
        nombres[LESS_TE] = "LESS_TE";
        nombres[GREATER_T] = "GREATER_T";
        nombres[GREATER_TE] = "GREATER_TE";
        nombres[ASIGNACION] = "ASIGNACION";
        nombres[SEPARADOR] = "SEPARADOR";
        nombres[DELIMITADOR_EXP] = "DELIMITADOR_EXP";
        nombres[INICIO_BLOQUE] = "INICIO_BLOQUE";
        nombres[FIN_BLOQUE] = "FIN_BLOQUE";
        nombres[INICIO_PARENTESIS] = "INICIO_PARENTESIS";
        nombres[FIN_PARENTESIS] = "FIN_PARENTESIS";
        nombres[INICIO_INDICE] = "INICIO_INDICE";
        nombres[FIN_INDICE] = "FIN_INDICE";
        nombres[COMA] = "COMA";
        nombres[DOS_PUNTOS] = "DOS_PUNTOS";
        nombres[MAS] = "MAS";
        nombres[MENOS] = "MENOS";
        nombres[MULTIPLICACION] = "MULTIPLICACION";
        nombres[DIVISION] = "DIVISION";
        nombres[MODULO] = "MODULO";
        nombres[POTENCIA] = "POTENCIA";
        nombres[INCREMENTO] = "INCREMENTO";
        nombres[DECREMENTO] = "DECREMENTO";
        nombres[OPERADOR_LOGICO_BINARIO] = "OPERADOR_LOGICO_BINARIO";
        nombres[OPERADOR_LOGICO_UNARIO] = "OPERADOR_LOGICO_UNARIO";
        nombres[NUMERO_ENTERO] = "NUMERO_ENTERO";
        nombres[NUMERO_FLOTANTE] = "NUMERO_FLOTANTE";
        nombres[NOTACION_CIENTIFICA] = "NOTACION_CIENTIFICA";
        nombres[FRACCIONARIO] = "FRACCIONARIO";
        nombres[CADENA] = "CADENA";
        nombres[CARACTER] = "CARACTER";
        nombres[IDENTIFICADOR] = "IDENTIFICADOR";
        nombres[EOF] = "EOF";
    }
}