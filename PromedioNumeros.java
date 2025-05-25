import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;

        System.out.println("Ingrese 12 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}