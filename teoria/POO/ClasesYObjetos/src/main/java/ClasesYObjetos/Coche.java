package ClasesYObjetos;

public class Coche {
    //Atributos

    String color;
    String marca;
    int km;

    //Metodo

    public static void main(String [] args){
        Coche coche1 = new Coche();

        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del auto1 es " + coche1.color);
        System.out.println("La marca del auto1 es " + coche1.marca);
        System.out.println("El kilometraje del auto1 es: " + coche1.km);


        Coche coche2 = new Coche();

        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 200;

        System.out.println("El color del auto2 es " + coche2.color);
        System.out.println("La marca del auto2 es " + coche2.marca);
        System.out.println("El kilometraje del auto2 es: " + coche2.km);
    }
}
