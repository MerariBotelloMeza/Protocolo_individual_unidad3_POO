package Taller_11;

public class pruebaEjercicio2 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Mery", 3000000);

        Vendedor vendedor = new Vendedor("Sandra", 9000000, 10000000);

        System.out.println("Datos del gerente");
        gerente.mostrarDetalles();

        System.out.println("\nDatos del vendedor");
        vendedor.mostrarDetalles();
    }

}
