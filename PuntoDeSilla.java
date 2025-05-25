import java.util.Scanner;

public class PuntoDeSilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas = 3;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];

        // Llenar la matriz
        System.out.println("Ingrese 12 números para la matriz 3x4:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean hayPuntoDeSilla = false;

        // Buscar punto de silla
        for (int i = 0; i < filas; i++) {
            // Encontrar el menor de la fila i
            int menorFila = matriz[i][0];
            int colPos = 0;

            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < menorFila) {
                    menorFila = matriz[i][j];
                    colPos = j;
                }
            }

            // Verificar si ese menor es el mayor en su columna
            boolean esPuntoDeSilla = true;
            for (int k = 0; k < filas; k++) {
                if (matriz[k][colPos] > menorFila) {
                    esPuntoDeSilla = false;
                    break;
                }
            }

            if (esPuntoDeSilla) {
                System.out.println("\n¡Punto de silla encontrado!");
                System.out.println("Valor: " + menorFila + " en posición [" + i + "][" + colPos + "]");
                hayPuntoDeSilla = true;
            }
        }

        if (!hayPuntoDeSilla) {
            System.out.println("\nNo se encontró ningún punto de silla.");
        }

        scanner.close();
    }
}