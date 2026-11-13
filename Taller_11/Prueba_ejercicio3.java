package Taller_11;

public class Prueba_ejercicio3 {
    public static void main(String[] args){

       // Animal_ejercicio_3 Animel = new Animal_ejercicio_3();

        /*
        * Aquí hay un error porque no se puede crear un objeto directamente de una
        * clase abstracta esto sucede porque una casa abstracta puede tener un metodo sin implementar
        * por lo tanto necesita que una clase hija proporcione su implementación en este caso se agrege la clase hija
        * peces_ejercicio3 para implementar los métodos necesarios.
        *  */

        Animal_ejercicio_3 miPez = new peces_ejercicio3();
        miPez.especie();
        miPez.transpotan();
    }
}
