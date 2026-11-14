package Taller_13;

public class PruebaEjercicio1 {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(5, 3);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        System.out.println("Área del triangulo:");
        triangulo.mostrarArea();

        System.out.println("\nÁrea del rectángulo:");
        rectangulo.mostrarArea();
    }
}
