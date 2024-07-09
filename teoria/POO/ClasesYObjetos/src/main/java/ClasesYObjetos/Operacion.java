package ClasesYObjetos;


public class Operacion {
    //Metodos
    //Metodo para leer 2 numeros;

    public int sumar(int numero1, int numero2){
        return numero1 + numero2;
    }
    public int restar(int numero1, int numero2){
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }
    public int dividir(int numero1, int numero2){
        return numero1 / numero2;
    }

    public void mostrarResultado(int suma, int resta, int multiplicacion,int division){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

    }
}

