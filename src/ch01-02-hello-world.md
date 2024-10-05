# ¡Hola, Mundo!

Ahora que has instalado Java, es hora de escribir tu primer programa. Es tradicional cuando se aprende un nuevo lenguaje escribir un pequeño programa que imprima el texto ¡Hola, mundo! en la pantalla, ¡así que haremos lo mismo aquí!

## Creando un directorio de proyecto

Para comenzar a trabajar en Java, es fundamental organizar tus proyectos de manera efectiva. A continuación, aprenderás a crear un directorio específico para tus ejercicios y proyectos.

### Paso 1: Crear un directorio de proyectos

Utilizaremos el directorio `proyectos` en tu directorio de inicio para mantener todos tus proyectos organizados. Esto te ayudará a acceder a ellos fácilmente y a mantener un entorno de trabajo limpio.

### Paso 2: Abrir la terminal

Abre una terminal en tu sistema. Puedes hacerlo buscando "Terminal" en el menú de aplicaciones de tu sistema operativo o usando el atajo de teclado correspondiente.

### Paso 3: Crear el directorio

En la terminal, escribe los siguientes comandos para crear el directorio `proyectos` y, dentro de él, un directorio para tu primer proyecto, que será “¡Hola, mundo!”:

```bash
mkdir ~/Desktop/proyectos
mkdir ~/Desktop/proyectos/hola-mundo

cd ~/Desktop/proyectos/hola-mundo
```

### Paso 4

Escribir y ejecutar un programa.

A continuación, crea un nuevo archivo de texto y llámalo HolaMundo.java. Los archivos Java siempre terminan con la extensión .java. Si estás usando más de una palabra en tu nombre de archivo, la convención es utilizar CamelCase, es decir, cada palabra comienza con una letra mayúscula y no se utilizan guiones bajos. Por ejemplo, usa HolaMundo.java en lugar de hola_mundo.java.

Ahora abre el archivo HolaMundo.java que acabas de crear y escribe el código en el Listado 1-1.

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```

Guarda el archivo y vuelve a la ventana de la terminal en el directorio 

```console
$ javac HolaMundo.java
$ java HolaMundo
¡Hola, mundo!
```

Si `¡Hola, mundo!` se imprimió, ¡felicidades! Acabas de escribir oficialmente un programa en Java. Eso te convierte en un programador de Java, ¡bienvenido!

> **Nota**: En las versiones más recientes de Java, específicamente desde **Java 11**, no es necesario compilar explícitamente a un archivo `.class` antes de ejecutar el programa. Puedes ejecutar archivos `.java`, por eso al ejecutar en aplicaciones como vsc directamente compila y entrega el proyecto final, puedes probar utilizando directamente utilizando el siguiente comando:

```bash
java NombreDelArchivo.java
```