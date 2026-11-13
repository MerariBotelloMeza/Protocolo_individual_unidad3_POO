package Taller_11;

public abstract class Animal_ejercicio_3 {

    public abstract String especie();

    /* esto es erroneo
    public abstract void transportar() {
    System.out.println("Los animales pueden moverse");
}*/

    // este es correcto
    public void transpotan() {
        System.out.println("Los animales pueden moverse");
    }

    /*
    * en el metodo comentado esta ma l porque java no permite que el metodo sea
    * abtrato y al mismo tiempo se escriba intrucciones entre llaves.
    * Además, un metodo concreto no puede obligar a las clases hijas a sobrescribirlo.
    * Si necesitas que sea obligatorio, debes declararlo como abstracto y dejarlo sin cuerpo.  */
}
