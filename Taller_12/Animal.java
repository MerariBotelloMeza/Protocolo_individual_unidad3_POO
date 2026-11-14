package Taller_12;

public class Animal implements Nadador, Volador {

    @Override
    public void nadar(){
        System.out.println("los animales pueden nadar ");
    }

    @Override
    public void volar(){
        System.out.println("algunos animales pueden volar");
    }

}
