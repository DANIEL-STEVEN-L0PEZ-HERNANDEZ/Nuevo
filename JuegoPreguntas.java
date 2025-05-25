import java.util.Scanner;

public class JuegoPreguntas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntaje = 0;

        System.out.println("=== NIVEL 1 ===");

        // Pregunta 1 - Nivel 1
        System.out.println("Pregunta 1: ¿Cuál es la capital de Francia?");
        System.out.println("a) Roma\nb) París\nc) Berlín");
        System.out.print("Tu respuesta: ");
        String r1 = scanner.nextLine();
        if (r1.equalsIgnoreCase("b")) {
            puntaje += 10;
        } else {
            puntaje -= 5;
        }

        // Pregunta 2 - Nivel 1
        System.out.println("\nPregunta 2: ¿Cuánto es 5 x 3?");
        System.out.println("a) 15\nb) 10\nc) 20");
        System.out.print("Tu respuesta: ");
        String r2 = scanner.nextLine();
        if (r2.equalsIgnoreCase("a")) {
            puntaje += 10;
        } else {
            puntaje -= 5;
        }

        System.out.println("\nTu puntaje al finalizar el NIVEL 1 es: " + puntaje);
        System.out.println("\n=== NIVEL 2 ===");

        // Pregunta 1 - Nivel 2
        System.out.println("Pregunta 1: ¿Cuál es el océano más grande?");
        System.out.println("a) Atlántico\nb) Pacífico\nc) Índico");
        System.out.print("Tu respuesta: ");
        String r3 = scanner.nextLine();
        if (r3.equalsIgnoreCase("b")) {
            puntaje += 20;
        } else {
            puntaje -= 10;
        }

        // Pregunta 2 - Nivel 2
        System.out.println("\nPregunta 2: ¿En qué año llegó el hombre a la Luna?");
        System.out.println("a) 1969\nb) 1959\nc) 1979");
        System.out.print("Tu respuesta: ");
        String r4 = scanner.nextLine();
        if (r4.equalsIgnoreCase("a")) {
            puntaje += 20;
        } else {
            puntaje -= 10;
        }

        // Pregunta 3 - Nivel 2
        System.out.println("\nPregunta 3: ¿Cuál es el resultado de 9 + 10?");
        System.out.println("a) 21\nb) 19\nc) 20");
        System.out.print("Tu respuesta: ");
        String r5 = scanner.nextLine();
        if (r5.equalsIgnoreCase("b")) {
            puntaje += 20;
        } else {
            puntaje -= 10;
        }

        // Pregunta 4 - Nivel 2
        System.out.println("\nPregunta 4: ¿Qué planeta es conocido como el planeta rojo?");
        System.out.println("a) Marte\nb) Venus\nc) Júpiter");
        System.out.print("Tu respuesta: ");
        String r6 = scanner.nextLine();
        if (r6.equalsIgnoreCase("a")) {
            puntaje += 20;
        } else {
            puntaje -= 10;
        }

        // Resultado final
        System.out.println("\nTu puntaje total acumulado de los dos niveles es: " + puntaje);

        scanner.close();
    }
}