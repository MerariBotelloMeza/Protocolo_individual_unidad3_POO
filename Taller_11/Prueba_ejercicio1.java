package Taller_11;

public class Prueba_ejercicio1 {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        System.out.println("Área del círculo:");
        circulo.mostrarArea();

        System.out.println("\nÁrea del rectángulo:");
        rectangulo.mostrarArea();
    }
}
