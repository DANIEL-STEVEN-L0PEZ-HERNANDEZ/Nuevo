import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado();

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        int horas = scanner.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        double pagoHora = scanner.nextDouble();

        empleado.registrar(nombre, horas, pagoHora);
        System.out.println("\n--- Datos del Empleado ---");
        empleado.mostrarDatos();

        scanner.close();
    }
}