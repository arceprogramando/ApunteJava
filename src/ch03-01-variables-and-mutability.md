# Variables y Mutabilidad

Una variable es un espacio de almacenamiento con un nombre asociado que se utiliza para contener datos que pueden cambiar durante la ejecución de un programa. Se define con un tipo específico, que determina qué tipo de valores puede almacenar (como números enteros, decimales, caracteres o booleanos). Las variables permiten a los desarrolladores almacenar, modificar y recuperar información de manera eficiente, facilitando la manipulación de datos y la realización de cálculos dentro de un programa.

En Java, las variables por defecto son mutables, lo que significa que se pueden reasignar libremente, excepto cuando se usan con la palabra clave `final`. La mutabilidad en Java no está tan estrictamente controlada como en otros lenguajes como Rust, pero es útil entender cuándo y por qué restringir los cambios a una variable.

## Variables Mutables
Una variable común en Java se puede cambiar después de su asignación inicial:

```java
public class Variables {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("El valor de x es: " + x);
        x = 6;  // Reasignando a x
        System.out.println("El valor de x ahora es: " + x);
    }
}
```

Al ejecutar este programa, obtendrás:

```
El valor de x es: 5
El valor de x ahora es: 6
```

Esto demuestra la naturaleza mutable de las variables en Java. Puedes cambiar libremente el valor de `x` sin ninguna restricción.

## Variables Inmutables usando `final`
En Java, si deseas que una variable no cambie después de ser inicializada, puedes usar la palabra clave `final`. Esto hace que la variable sea efectivamente inmutable.

```java
public class Variables {
    public static void main(String[] args) {
        final int x = 5;
        System.out.println("El valor de x es: " + x);
        // x = 6;  // Esto causará un error de compilación
    }
}
```

Si intentas reasignar el valor de `x`, obtendrás un error como este:

```
error: cannot assign a value to final variable x
```

## Constantes
En Java, las constantes se declaran típicamente usando `final` y están en mayúsculas, lo que sigue la convención de nombres para constantes:

```java
public class Constantes {
    public static final int THREE_HOURS_IN_SECONDS = 60 * 60 * 3;

    public static void main(String[] args) {
        System.out.println("Tres horas en segundos: " + THREE_HOURS_IN_SECONDS);
    }
}
```

Esto garantiza que el valor de `THREE_HOURS_IN_SECONDS` no cambie durante la ejecución del programa.

## Shadowing
Java permite shadowing, que es cuando declaras una nueva variable con el mismo nombre dentro de un bloque más pequeño de código (como en un bloque `if` o un método).

```java
public class ShadowingExample {
    static int x = 5; // Variable de clase

    public static void main(String[] args) {
        System.out.println("El valor de x antes del shadowing: " + x); // Imprime 5

        // Se define un bloque estático
        {
            int x = 10; // Variable local que "sombrea" la variable de clase
            System.out.println("El valor de x dentro del bloque: " + x); // Imprime 10
        }

        System.out.println("El valor de x después del bloque: " + x); // Imprime 5, no 10
    }
}
```

Salida:

```
El valor de x antes del shadowing: 5
El valor de x dentro del bloque: 10
El valor de x después del bloque: 5
```

> Aquí, la variable `x` dentro del bloque interno **"oculta"** la variable `x` del ámbito externo solo dentro de ese bloque. Fuera de este bloque, la variable `x` del ámbito externo sigue siendo accesible y mantiene su valor.

shadowing permite que una variable local "oculte" o "sombre" una variable en un ámbito más externo. Es importante destacar que el shadowing puede causar confusión, por lo que es recomendable evitar el uso de nombres de variables idénticos en diferentes ámbitos, a menos que tengas una razón clara para hacerlo. Si deseas, puedes agregar este tipo de aclaraciones en tu explicación para ayudar a otros a entender el concepto más claramente.

En Java, las variables son mutables por defecto, pero puedes restringir su mutabilidad usando `final` si deseas que sean inmutables. También puedes utilizar `final` para definir constantes. Y, aunque Java permite el shadowing, es importante ser cuidadoso con este mecanismo para evitar confusiones en el código.

