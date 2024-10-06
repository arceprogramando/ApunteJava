# Casting

El casting en Java es el proceso de convertir un valor de un tipo de dato a otro. En Java, el casting puede ser de dos tipos:

- Casting implícito: Se realiza automáticamente cuando no hay pérdida de precisión o información. Generalmente, esto ocurre cuando conviertes de un tipo más pequeño a un tipo más grande, como de `int` a `long`.

- Casting explícito: Es necesario cuando intentas convertir de un tipo más grande o más preciso a uno más pequeño, o cuando Java no puede hacer la conversión de manera automática. En este caso, el programador tiene que indicar explícitamente la conversión.


## ¿Qué es el Casting Explícito?

El casting explícito es cuando fuerzas la conversión de un tipo de dato a otro usando una sintaxis especial. Esto es necesario cuando puedes perder precisión o información durante la conversión, como cuando reduces el tamaño de un tipo de dato numérico o conviertes entre tipos incompatibles.

Sintaxis del Casting Explícito

Para realizar un casting explícito, usas la siguiente sintaxis:

(tipo_destino) valor_a_convertir;

Aquí, tipo_destino es el tipo al que deseas convertir, y valor_a_convertir es la expresión o variable que quieres convertir.

Ejemplo de Casting Explícito:

```bash
double decimal = 9.78;
int entero = (int) decimal; // Casting explícito de double a int
System.out.println(entero);  // Imprime: 9
```

En este ejemplo:

- El valor de decimal es 9.78, de tipo double.
- Se realiza un casting explícito (int) para convertirlo en un valor entero.
- Como resultado, el valor 9.78 se convierte en 9, perdiendo la parte decimal.

¿Cuándo es Necesario el Casting Explícito?

El casting explícito es necesario cuando:

1. Se puede perder información: Al convertir de un tipo más grande o preciso a uno más pequeño, puede haber pérdida de datos. Ejemplo: Convertir un double a un int puede llevar a la pérdida de la parte decimal.

2. Tipos incompatibles: Cuando los tipos no son directamente compatibles, como convertir un tipo de dato numérico a un carácter (char).

3. Java no puede realizar la conversión automáticamente: Cuando la conversión entre tipos requiere que el programador sea consciente de la posible pérdida o transformación de los datos.

Ejemplos de Conversión de Tipos Numéricos:

1. Casting de double a int:

```bash
double num = 10.99;
int numInt = (int) num; // Se convierte a 10 (parte decimal se pierde)
```
2. Casting de long a int:

```bash
long valorGrande = 100000L;
// Puede llevar a una pérdida si el valor es mayor que el rango de 'int'
int valorPequeno = (int) valorGrande;
```

En este caso, long tiene un rango más amplio que int, por lo que es necesario el casting explícito, y podrías perder precisión si el valor de long es demasiado grande para caber en un int.

Si probaramos con un numero grande como: 10000000000009 Tambien podria ocasionar errores como:

```bash
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The literal 10000000000009 of type int is out of range 

        at App.main(App.java:3)
```

Precauciones con el Casting Explícito

Cuando realizas un casting explícito, debes ser consciente de posibles problemas como:

- Pérdida de datos: Como se vio en los ejemplos anteriores, puedes perder parte de la información, como la parte decimal o truncar valores grandes.

- Excepciones en tiempo de ejecución: En algunos casos, si la conversión no es válida (por ejemplo, convertir tipos incompatibles sin lógica correcta), puedes obtener errores en tiempo de ejecución.

Por ejemplo, el siguiente código puede dar resultados inesperados:

long numeroGrande = 9223372036854775807L; // Valor máximo de long
int numeroPequeno = (int) numeroGrande;   // Valor excede el rango de int
System.out.println(numeroPequeno);        // Resultado inesperado: -1

El valor de numeroGrande es mayor que lo que int puede almacenar, por lo que se produce un overflow, dando un valor incorrecto.

Casos Comunes de Casting Explícito

1. Conversión entre tipos numéricos: Reducir el tamaño del tipo de dato, como de double a float, de long a int, etc.

2. Conversión de tipos no relacionados: Por ejemplo, convertir un número a un carácter.

Ejemplo Completo:

public class CastingEjemplo {
    public static void main(String[] args) {
        double decimal = 15.87;
        int entero = (int) decimal;  // Casting explícito, se pierde la parte decimal
        System.out.println("Valor original (double): " + decimal);
        System.out.println("Valor convertido (int): " + entero);

        long grande = 10000000000L;
        int pequeno = (int) grande;  // Posible pérdida de datos si el valor es muy grande
        System.out.println("Valor original (long): " + grande);
        System.out.println("Valor convertido (int): " + pequeno);
    }
}

Conclusión

El casting explícito es una herramienta poderosa en Java que permite al programador forzar la conversión de tipos de datos cuando Java no lo hace automáticamente. Sin embargo, debe usarse con precaución, ya que puede haber pérdida de datos o problemas de rendimiento. Asegúrate de entender las implicaciones de realizar este tipo de conversiones antes de aplicarlas en tu código.
