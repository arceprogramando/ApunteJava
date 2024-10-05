# Instalación

El primer paso es instalar un entorno de desarrollo. Entre las opciones disponibles, existen diferentes herramientas que los programadores pueden elegir según sus preferencias. En los rankings de 2024, algunas de las herramientas más destacadas incluyen:

- **[IntelliJ IDEA](https://www.jetbrains.com/idea/)**: El más popular y utilizado, con versiones gratuita (Community) y de pago (Ultimate).
- **[Eclipse](https://eclipseide.org/)**: Conocido por su extensibilidad y personalización.
- **[Visual Studio Code](https://code.visualstudio.com/docs/languages/java)**: Ligero y potente, con extensiones para Java.

Estas opciones ofrecen diversas características, adaptándose a las necesidades de cada desarrollador.

Al tratar con distintos sistemas operativos, cada máquina presenta métodos específicos para instalar el SDK según sus requisitos. Por ejemplo, recomiendo seguir el tutorial de **Visual Studio Code (VSC)**, ya que este tiene su propio instalador que facilita el proceso.

Los pasos generales para la instalación son:

1. **Descargar el instalador**: Visita la página oficial de VSC y descarga la versión adecuada para tu sistema operativo.
2. **Ejecutar el instalador**: Sigue las instrucciones del asistente de instalación.
3. **Configurar el PATH**: En cada distribución, es importante asegurarse de que la ruta de instalación del SDK esté correctamente configurada en las variables de entorno.

Personalmente, en mi experiencia con **Linux Fedora**, el instalador de VSC funcionó muy bien y facilitó la configuración del entorno de desarrollo. Si estás en una distribución diferente, es recomendable revisar la documentación específica para ajustar los pasos según sea necesario.

Para más detalles sobre la instalación en diferentes sistemas operativos, consulta la [documentación oficial de Visual Studio Code](https://code.visualstudio.com/docs/languages/java).

# Resumen sobre JRE y JDK

## JDK (Java Development Kit)
El **JDK** es un conjunto de herramientas y bibliotecas que permiten a los desarrolladores crear aplicaciones en Java. Incluye todo lo necesario para desarrollar, compilar y depurar programas Java. 

### Componentes del JDK:
- **Compilador (`javac`)**: Transforma el código fuente Java en bytecode.
- **Herramientas de desarrollo**: Incluye depuradores y otros utilitarios.
- **JRE**: El entorno de ejecución necesario para ejecutar aplicaciones Java.

## JRE (Java Runtime Environment)
El **JRE** es el entorno que permite ejecutar aplicaciones Java. Incluye la **JVM (Java Virtual Machine)**, que es responsable de ejecutar el bytecode Java, y las bibliotecas de clases necesarias para su funcionamiento.

### Importancia del JRE:
- Permite la ejecución de aplicaciones Java en cualquier plataforma que tenga instalado el JRE.
- Viene incluido en el JDK, lo que facilita a los desarrolladores tanto la creación como la ejecución de sus aplicaciones.

### Conclusión
Al instalar el JDK, también se instala automáticamente el JRE, proporcionando un entorno completo para el desarrollo y la ejecución de aplicaciones Java.
