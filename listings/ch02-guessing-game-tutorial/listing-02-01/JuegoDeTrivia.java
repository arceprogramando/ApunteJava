import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JuegoDeTrivia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String[]> preguntas = new HashMap<>();
        Map<String, String> respuestasCorrectas = new HashMap<>();
        int puntaje = 0;

        preguntas.put("¿Cuál es la capital de Francia?", new String[]{"a) París", "b) Londres", "c) Berlín", "d) Roma"});
        preguntas.put("¿Qué planeta es conocido como el planeta rojo?", new String[]{"a) Venus", "b) Marte", "c) Júpiter", "d) Saturno"});
        preguntas.put("¿Quién escribió 'Cien años de soledad'?", new String[]{"a) Julio Cortázar", "b) Jorge Luis Borges", "c) Gabriel García Márquez", "d) Mario Vargas Llosa"});
        preguntas.put("¿Cuál es el océano más grande?", new String[]{"a) Océano Atlántico", "b) Océano Índico", "c) Océano Ártico", "d) Océano Pacífico"});

        respuestasCorrectas.put("¿Cuál es la capital de Francia?", "a");
        respuestasCorrectas.put("¿Qué planeta es conocido como el planeta rojo?", "b");
        respuestasCorrectas.put("¿Quién escribió 'Cien años de soledad'?", "c");
        respuestasCorrectas.put("¿Cuál es el océano más grande?", "d");

        System.out.println("¡Bienvenido al Juego de Trivia!");
        System.out.println("Responde las siguientes preguntas:");

        for (Map.Entry<String, String[]> entry : preguntas.entrySet()) {
            String pregunta = entry.getKey();
            String[] opciones = entry.getValue();
            String respuestaCorrecta = respuestasCorrectas.get(pregunta);

            System.out.println(pregunta);
            for (String opcion : opciones) {
                System.out.println(opcion);
            }

            System.out.print("Tu respuesta (a/b/c/d): ");
            String respuestaUsuario = scanner.nextLine().toLowerCase();

            if (respuestaUsuario.equals(respuestaCorrecta)) {
                System.out.println("¡Correcto! La respuesta es " + opciones[respuestaCorrecta.charAt(0) - 'a'] + ".");
                puntaje++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es " + opciones[respuestaCorrecta.charAt(0) - 'a'] + ".");
            }
            System.out.println();
        }

        System.out.println("Juego terminado. Tu puntaje final es: " + puntaje + "/" + preguntas.size());
        scanner.close();
    }
}