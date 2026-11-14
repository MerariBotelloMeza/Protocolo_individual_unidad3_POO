package Taller_13;
public abstract class Animal {

   /* public default void caminar(){
        System.out.println("Algunos animales caminan");
    }

     * Aquí hay un error porque la palabra clave default se utiliza
     * para definir métodos predeterminados dentro de las interfaces,
     * no dentro de las clases abstractas.
     *
     * Además, en Java una clase concreta que implementa una interfaz
     * debe definir todos sus métodos abstractos; de lo contrario,
     * se produce un error de compilación. */

    // la manera correcta
    public void caminar(){
        System.out.println("Algunos animales caminan");

    }
}
