public class Ejecutarr {
    public static void main(String[] args) {
        Profesion prof1 = new Ingeniero(160, 10.5); // 160 horas a $10.5/h
        Profesion prof2 = new Doctor(40, 25); // 40 pacientes a $25 c/u

        System.out.println("Sueldo del Ingeniero: $" + prof1.calcularSueldo());
        System.out.println("Sueldo del Doctor: $" + prof2.calcularSueldo());
    }
}