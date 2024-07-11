package ClasesYObjetos;

import java.util.Scanner;

public class Jarvis {

    static Pierna piernaIzquierda = new Pierna();
    static Pierna piernaDerecha = new Pierna();

    static Brazo brazoIzquierdo = new Brazo();
    static Brazo brazoDerecho = new Brazo();

    static Nucleo nucleo = new Nucleo();

    public static void main(String[] args) {

        selector();

    }

    public static void selector(){
        Scanner input = new Scanner(System.in);
        int selector_de_accion;

        while(true){
            System.out.print("\n1. Moverse \n2. Mostrar Status\n0. salir\nSeleccionando: ");
            selector_de_accion = input.nextInt();
            switch (selector_de_accion){
                case 1:
                    movimiento();
                    break;
                case 2:
                    System.out.println("\n" + nucleo.energia + ". Energia restante");
                    System.out.println(piernaDerecha.durabilidad + ". Durabilidad pierna derecha");
                    System.out.println(piernaIzquierda.durabilidad + " .Durabilidad pierna izquierda");
                    break;
                case 0:
                    return;
            }

            }
    }

    public static void movimiento(){

        Scanner input = new Scanner(System.in);


        int selector_de_movimiento;
        int metros;
        float selector_de_consumo; ;

        do {
            System.out.print("\n1. Caminar.\n2. Correr.\n3. Volar.\n0. volver\nPor favor, seleccione una opcion: ");
            selector_de_movimiento = input.nextInt();
            switch (selector_de_movimiento) {
                case 1: selector_de_consumo = 0.5f;
                    break;
                case 2: selector_de_consumo = 1f;
                    break;
                case 3: selector_de_consumo = 1.5f;
                    break;
                case 0:
                    System.out.println("[+] Saliendo...");
                    return;
                default:
                    System.out.println("Por favor seleccione una de las 3 opciones");
                    continue;
            }
            System.out.print("Por favor ingrese cuanto quiere moverse: ");
            metros = input.nextInt();

            if(moverse(metros,selector_de_consumo)){
                System.out.println(" ");
                System.out.println("Ha avanzado " + metros + " metros");
            }
        } while (true);

    }
    public static boolean moverse(int metros,float selector_de_consumo) {

        for(int i = 0; i < metros; i++) {
            if (nucleo.energia <= 0) {
                System.out.println("Energia agotada");
                return false;
            }

            if (piernaIzquierda.durabilidad <= 87 || piernaDerecha.durabilidad <= 87) {
                System.out.println("Piernas averiadas");
                return false;
            }

            nucleo.energia -= selector_de_consumo ;
            piernaDerecha.durabilidad -= selector_de_consumo; ;
            piernaIzquierda.durabilidad -= selector_de_consumo;
            }
        return true;
    }

    public static void enemigos() {
    }
}