# Tipos de Datos

En Java, cada valor tiene un tipo de dato asociado que determina cómo se puede usar. Los tipos de datos en Java se dividen en dos categorías principales: **tipos primitivos** y **tipos de referencia**. A diferencia de Rust, Java es un lenguaje también estáticamente tipado, lo que significa que se debe conocer el tipo de las variables en tiempo de compilación.

## Tipos primitivos

Java tiene ocho tipos primitivos, que son:

1. **Enteros**:

| Tamaño  | Tipo   | Rango                                         |
|---------|--------|-----------------------------------------------|
| 8-bit   | `byte` | -128 a 127                                   |
| 16-bit  | `short`| -32,768 a 32,767                             |
| 32-bit  | `int`  | -2,147,483,648 a 2,147,483,647               |
| 64-bit  | `long` | -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 |

2. **Números de punto flotante**:

| Tamaño  | Tipo    | Rango                 |
|---------|---------|-----------------------|
| 32-bit  | `float` | Aproximadamente -3.4E38 a 3.4E38 |
| 64-bit  | `double`| Aproximadamente -1.7E308 a 1.7E308 |

3. **Booleano**

| Tamaño  | Tipo     | Valores    |
|---------|----------|------------|
| 1-bit   | `boolean`| `true` (1) o `false` (0) |

4. **Carácter**:

| Tamaño  | Tipo   | Rango de Valores                  |
|---------|--------|-----------------------------------|
| 16-bit  | `char` | 0 a 65,535 (valor Unicode)        |

## Tipos de referencia

Los tipos de referencia son utilizados para almacenar referencias a objetos y arrays. En Java, todos los tipos de referencia heredan de la clase `Object`. Algunos ejemplos son:

- **Clases**: Una clase define un tipo de objeto, que puede contener campos y métodos.
- **Interfaces**: Un contrato que una clase puede implementar.
- **Arrays**: Estructuras que pueden contener múltiples valores del mismo tipo.

Cuando declaras una variable, se almacena en memoria RAM, ocupando espacio dependiendo del tipo de datos. Usar tipos grandes innecesariamente puede malgastar esta memoria.