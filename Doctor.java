public class Doctor implements Profesion{
    private int pacientesAtendidos;
    private double pagoPorPaciente;

    public Doctor(int pacientesAtendidos, double pagoPorPaciente) {
        this.pacientesAtendidos = pacientesAtendidos;
        this.pagoPorPaciente = pagoPorPaciente;
    }

    @Override
    public double calcularSueldo() {
        return pacientesAtendidos * pagoPorPaciente;
    }
}