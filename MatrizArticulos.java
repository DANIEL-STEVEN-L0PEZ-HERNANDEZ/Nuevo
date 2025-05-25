import java.util.Scanner;

public class MatrizArticulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] articulos = new String[3][3];

        System.out.println("Ingrese 9 nombres de artículos:");

        // Llenar la matriz
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Artículo [" + fila + "][" + col + "]: ");
                articulos[fila][col] = scanner.nextLine();
            }
        }

        // Mostrar matriz con filas invertidas
        System.out.println("\nMatriz con filas en orden invertido:");
        for (int fila = 2; fila >= 0; fila--) {
            for (int col = 0; col < 3; col++) {
                System.out.print(articulos[fila][col] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}