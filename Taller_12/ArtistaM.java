package Taller_12;

/*public class ArtistaM implements Cantar{

}
/*
* aqui aparece un error porque cuando una clase implenta una interfaz, debe
* proporcinar todos sus metodos abstractos. Si no lo hace, Java genera un
* error de compilación, a menos que la clase también se declare abstracta. */

// la manera correcta

public class ArtistaM implements Cantar{
    @Override
    public void cantante(){
        System.out.println("los artista musicales deben cantar");
    }

}