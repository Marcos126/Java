package ClasesYObjetos;

public class Registro {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setterEdad(21);
        persona1.setterNombre("Marcos");

        System.out.println("Mi nombre es " + persona1.getterNombre() + " tengo " + persona1.getterEdad());

    }
}
