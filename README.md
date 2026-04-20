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

java -jar lib\jflex-full-1.9.1.jar lenguaje.flex

2. Compilar

javac -cp ".;java-cup-11b-runtime.jar" *.java

3. Ejecutar prueba

java -cp ".;java-cup-11b-runtime.jar" TestLexer prueba.txt

4: Ejecutar prueba

java -cp ".;lib\java-cup-11b-runtime.jar" Parser prueba.txt


Por el momento se estara usando el tipo en vez de tipo_arreglo por diversos errores de duplicacion de conflictos en el sistema aun que en el archivo pide que unicamente se puede crear funciones con
int y float, esto en el lenguaje.cup.

