public abstract class Personal {
    protected String nombre;
    protected int horasTrabajadas;
    protected double pagoPorHora;

    public abstract void registrar(String nombre, int horasTrabajadas, double pagoPorHora);

    public abstract double calcularSueldo();
}