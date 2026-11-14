package Taller_12;

public class computadores implements Cantar{
    @Override
    public void cantante(){
        System.out.println("el computador cantan");
    }
    /*
    * este codigo no genera un error porque se implementa todos
    * los metodos pero presenta un problema de diseño ya que estamos
    * obligando a una clase que no tiene nada que ver a realizar un comportamiento
    * que no corresponde esto hace que el código pierda sentido y dificulta su comprensión.*/
}
