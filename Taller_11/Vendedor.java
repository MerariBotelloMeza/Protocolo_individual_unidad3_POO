package Taller_11;

public class Vendedor extends Empleado{
    double salarioBase;
    double Ventas;

    public Vendedor(String nombre, double salarioBase, double Ventas) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.Ventas = Ventas;
    }

    @Override

    public double calcularSalario() {
        return salarioBase + (Ventas * 0.06);
    }

}
