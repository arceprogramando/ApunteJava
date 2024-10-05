# Creación de Juego

Primero, crea un proyecto y crea un  archivo llamado `JuegoDeTrivia.java` en tu carpeta src/ o en tu App principal editor de texto y añade el siguiente código:

```java
{{#include ../listings/ch02-guessing-game-tutorial/listing-02-01/JuegoDeTrivia.java}}
```

Como viste en el Capítulo 1, `javac` genera un archivo llamado `HolaMundo.class`, que es el bytecode del proyecto. Después de esto, el comando `java HolaMundo` se utiliza como ejecutor del programa para correr el bytecode, que es el proyecto multiplataforma.

> **Nota**: En el Capítulo 1 también se advierte que, en las versiones más recientes de Java, específicamente desde **Java 11**, no es necesario compilar explícitamente a un archivo `.class` antes de ejecutar el programa. Puedes ejecutar archivos `.java` directamente utilizando el siguiente comando:

```bash
java JuegoDeTrivia.java
```