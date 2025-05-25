import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese 9 valores numéricos:");

        // Llenar la matriz
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Valor [" + fila + "][" + col + "]: ");
                matriz[fila][col] = scanner.nextInt();
            }
        }

        // Mostrar matriz original
        System.out.println("\nMatriz original:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

        // Mostrar transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int col = 0; col < 3; col++) {
            for (int fila = 0; fila < 3; fila++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}