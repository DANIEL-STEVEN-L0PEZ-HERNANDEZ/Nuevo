public class Ingeniero implements Profesion {
    private int horasTrabajadas;
    private double pagoPorHora;

    public Ingeniero(int horasTrabajadas, double pagoPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * pagoPorHora;
    }
}