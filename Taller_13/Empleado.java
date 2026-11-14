package Taller_13;

// esto esta mal
/*public class Empleado implements tejedora {

}*/

/*
 * Aquí aparece un error porque una clase concreta que implementa
 * una interfaz debe proporcionar la implementación de todos sus
 * métodos abstractos. Si no lo hace, Java genera un error de
 * compilación, a menos que la clase se declare abstracta.*/

//la manera corrrecta

public class Empleado implements tejedora {

    @Override
    public void tejer(){
        System.out.println("los artista musicales deben cantar");
    }

}
