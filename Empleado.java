public class Empleado extends Personal {
    @Override
    public void registrar(String nombre, int horasTrabajadas, double pagoPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * pagoPorHora;
    }

    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Pago por hora: $" + pagoPorHora);
        System.out.println("Sueldo total: $" + calcularSueldo());
    }
}