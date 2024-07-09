package ClasesYObjetos;

public class Persona {
    String nombre;
    int edad;
    String dni;

    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(String dni){
        this.dni = dni;
    }

    public void correr(String nombre, int edad){
        System.out.println("Mi nombre es " + nombre + " tengo " + edad + " Y estoy corriendo una maraton");
    }

    public void correr(){
        System.out.println("Ahre que no me muevo de la silla (?");

    }


}
