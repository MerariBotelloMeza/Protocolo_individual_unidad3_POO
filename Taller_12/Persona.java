package Taller_12;

public class Persona implements Hablador, Trabajador{

        @Override
        public void hablar(){
            System.out.println("las personas hablan");
        }

        @Override
        public void trabajador(){
            System.out.println("el artesano hace manualidades");
        }
    }
