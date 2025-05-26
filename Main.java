public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Automovil();
        Vehiculo vehiculo2 = new Barco();
        Vehiculo vehiculo3 = new Avion();

        vehiculo1.mover(); // Salida: El automóvil se desplaza por la carretera
        vehiculo2.mover(); // Salida: El barco navega por el mar
        vehiculo3.mover(); // Salida: El avión vuela por el cielo
    }
}