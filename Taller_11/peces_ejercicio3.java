package Taller_11;

public class peces_ejercicio3 extends Animal_ejercicio_3{

    String tipo = "Pez angel";

    // Obligatorio implementarlo porque es abstracto en el padre

    @Override
    public String especie(){
        System.out.println("la especie es: "+ tipo );
        return tipo;
    }
}
