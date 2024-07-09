package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;

    //Metodos

    //Metodo Constructor
    public Persona(String _nombre, int _edad){
        edad  = _edad;
        nombre  = _nombre;
    }
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
}
