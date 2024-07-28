package ClasesYObjetos;

import java.util.*;

public class Jarvis {
    static int damage_a_enemigos = 50;
    static private int posicion = 1;

    static Pierna piernaIzquierda = new Pierna();
    static Pierna piernaDerecha = new Pierna();

    static Brazo brazoIzquierdo = new Brazo();
    static Brazo brazoDerecho = new Brazo();

    static Nucleo nucleo = new Nucleo();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de enemigos: ");
        int cantidadEnemigos = input.nextInt();
        List<Enemigo> listaDeEnemigos = cargarEnemigos(cantidadEnemigos);

        selector(listaDeEnemigos);
    }

    private static List <Enemigo> cargarEnemigos(int cantidadEnemigo){

        List<Enemigo> enemigosCargados = new ArrayList <Enemigo>();

        String nombreEnemigo;
        for(int i = 0; i < cantidadEnemigo;i++){
            nombreEnemigo = "Enemigo " + (i + 1);
            enemigosCargados.add(new Enemigo(nombreEnemigo, posicionarEnemigos(), 50));
        }

        return enemigosCargados;
    }
    public static void selector(List<Enemigo> enemigosCargados) {

        Scanner input = new Scanner(System.in);

        int selectorDeAccion = 0;

        while (true) {

            System.out.print("\n1. Moverse \n2. Mostrar Status\n3. Atacar\n0. salir\nSeleccionando: ");
            try {
                selectorDeAccion = input.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("Hubo un error");
                selector(enemigosCargados);
            }

            switch (selectorDeAccion) {
                case 1:
                    movimiento();
                    break;
                case 2:
                    mostrarStatus();
                    break;
                case 3:
                    objetivoAtaque(enemigosCargados);
                    break;
                case 0:
                    System.out.println("[!] Saliendo");
                    return;
                default:
                    System.out.println("La opcion elegida no es correcta");

            }
        }
    }


    public static void movimiento() {

        Scanner input = new Scanner(System.in);

        int selector_de_movimiento;
        int metros;
        float selector_de_consumo;

        while (true) {
            System.out.print("\n1. Caminar.\n2. Correr.\n3. Volar.\n0. volver\nPor favor, seleccione una opcion: ");
            selector_de_movimiento = input.nextInt();
            switch (selector_de_movimiento) {
                case 1:
                    selector_de_consumo = 0.5f;
                    break;
                case 2:
                    selector_de_consumo = 1f;
                    break;
                case 3:
                    selector_de_consumo = 1.5f;
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

            double numero_random = Math.random();
            moverse(metros, selector_de_consumo, numero_random);

        }
    }

    //golpe critico
    static int golpe_critico = 50;

    public static void moverse(int metros, float consumo, double numero_random) {

        if (numero_random < 0.2) {
            System.out.println("se te rompieron asi como que las patas (?");
            piernaIzquierda.usoDurabilidad(golpe_critico);
            piernaDerecha.usoDurabilidad(golpe_critico);
        }

        for (int i = 0; i < metros; i++) {
            if (nucleo.getEnergia() <= 0) {
                System.out.println("Energia agotada");
                return;
            }

            if (piernaIzquierda.getDurabilidad() <= 87 && piernaDerecha.getDurabilidad() <= 87) {
                System.out.println("Piernas averiadas");
                return;
            }

            System.out.println(Jarvis.posicion++);
            nucleo.usoEnergia(consumo * 0.3f);
            piernaDerecha.usoDurabilidad(consumo);
            piernaIzquierda.usoDurabilidad(consumo);
        }
        System.out.println("\nHa avanzado " + metros + " metros");
    }


    //daño base
    public static void objetivoAtaque(List <Enemigo> enemigosCargados){

        Scanner input = new Scanner(System.in);
        int opcion = 0;
        while(true){
            for(Enemigo enemigo : enemigosCargados) {
                opcion++;
                System.out.println(opcion + ": ");
                System.out.println("Nombre del enemigo: " + enemigo.getNombre());
                System.out.println("Posicion del enemigo: " + enemigo.getPosicion());
                System.out.println("Vida del enemigo: " + enemigo.getVida());
                System.out.println(" ");
            }
            opcion = 0;
            System.out.print("Seleccionando: ");
            int menu = input.nextInt();
            switch(menu) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Elegiste:  " + menu);
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    return;
                default:
                    System.out.println("Opcion Incorrecta, por favor elija una de las opciones: ");
                    continue;
            }
            double numero_random = Math.random();
            atacar(numero_random,enemigosCargados.get(menu-1));
            limpiarEnemigosMuertos(enemigosCargados);
        }
    }

    public static void limpiarEnemigosMuertos(List<Enemigo> enemigosCargados) {
        enemigosCargados.removeIf(enemigo -> enemigo.getVida() <= 0);
    }

    public static void atacar(double numero_random, Enemigo enemigo){

        if(numero_random < 0.2){
            System.out.println("se te rompieron los brazos");
            brazoIzquierdo.usoDurabilidad(golpe_critico);
            brazoDerecho.usoDurabilidad(golpe_critico);
        }

        if(enemigo.getVida() <= 0 ){
            return;
        }

        if(enemigo.getPosicion() - Jarvis.posicion == 1 ||enemigo.getPosicion() - Jarvis.posicion == 0   ){
            enemigo.directDamage(damage_a_enemigos);
        }else{
            System.out.println("No estas a rango para pegarle al enemigo");
        }
    }

    //Utilidades

    //Validacion de posicionamiento de enemigos
    public static int posicionarEnemigos() {

        int posicionEnemigos = (int) (Math.random() * 10);

        while (posicionEnemigos == 0) {
            posicionEnemigos = (int) (Math.random() * 10);
        }

        return posicionEnemigos;
    }

    //Parte del menu de status
    private static void mostrarStatus(){
        System.out.println("\n" + nucleo.getEnergia() + ". Energia restante");
        System.out.println(piernaIzquierda.getDurabilidad() + ". Durabilidad de pierna izquierda");
        System.out.println(piernaDerecha.getDurabilidad() + ". Durabilidad de pierna derecha");
        System.out.println(brazoDerecho.getDurabilidad() + ". Durabilidad brazo derecha");
        System.out.println(brazoIzquierdo.getDurabilidad() + ". Durabilidad brazo izquierda");
        System.out.println(Jarvis.posicion + ". Posicion de Jarvis");

    }
}