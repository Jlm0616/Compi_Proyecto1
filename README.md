Proyecto #1 - Analizador Léxico

Descripción
Analizador léxico para un lenguaje imperativo de configuración de chips, implementado con JFlex.

Tecnologías
| Tecnología | Versión |
|------------|---------|
| Java | OpenJDK 1.8.0_482 |
| JFlex | 1.9.1 |
| CUP | 11b (20160615) |

Archivos del proyecto

| Archivo | Tipo | Descripción |
|---------|------|-------------|
| `lenguaje.flex` | Fuente | Especificación de tokens para JFlex |
| `sym.java` | Fuente | Constantes numéricas para cada token |
| `TestLexer.java` | Fuente | Programa de prueba del lexer |
| `prueba.txt` | Datos | Archivo de ejemplo para probar |
| `lib/jflex-full-1.9.1.jar` | Herramienta | Generador de lexers JFlex |
| `java-cup-11b-runtime.jar` | Librería | Runtime de CUP |

Cómo ejecutar

1. Generar el lexer

java -jar lib\jflex-full-1.9.1.jar lenguaje.flex# Compi_Proyecto1

2. Compilar

javac -cp ".;java-cup-11b-runtime.jar" *.java

3. Ejecutar prueba

java -cp ".;java-cup-11b-runtime.jar" TestLexer prueba.txt
