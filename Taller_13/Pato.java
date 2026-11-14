package Taller_13;

public class Pato implements Volador, Nadador {

    @Override
    public void nadar(){

        System.out.println("El pato puede nadar ");
    }

    @Override
    public void volar(){
        System.out.println("el pato pueden volar");
    }

}
