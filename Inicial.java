import java.util.Scanner;

public class Inicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objeto de tipo Animal
        Animal animal = new Animal();

        System.out.print("Ingrese el nombre del animal: ");
        animal.setNombre(scanner.nextLine());

        System.out.print("Ingrese el orden del animal: ");
        animal.setOrden(scanner.nextLine());

        System.out.print("Ingrese la cantidad de extremidades: ");
        animal.setExtremidades(scanner.nextInt());

        // Mostrar información
        System.out.println("\n--- Información del Animal ---");
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Orden: " + animal.getOrden());
        System.out.println("Extremidades: " + animal.getExtremidades());

        scanner.close();
    }
}

// Clase Animal (misma clase en el mismo archivo)
class Animal {
    private String nombre;
    private String orden;
    private int extremidades;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getOrden() {
        return orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }
}