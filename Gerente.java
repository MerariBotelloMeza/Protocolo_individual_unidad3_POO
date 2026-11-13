public class Gerente extends Empleado {
    double salario;

    public Gerente(String nombre, double salario){
        super(nombre);
        this.salario = salario;
    }

    @Override

    public double calcularSalario(){
        return salario;
    }
}
