import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int pares = 0;
        int impares = 0;

        System.out.println("Ingrese 12 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        scanner.close();
    }
}