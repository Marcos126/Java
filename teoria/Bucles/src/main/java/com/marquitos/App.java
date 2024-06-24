package com.marquitos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
{
        //Ciclo while
        //while(condicion){
        //accion
        //}
        int i=1;
        while (i<=100){
            System.out.println("Numero " + i);
            i++;
        }


        //  Ciclo Do while
        //
        //  do{
        //  accion
        //  }while{condicion};
        int a;
        a = 1;

        do{
            System.out.println("Numero " + a);
            a++;
        }while(a <= 20);

        //Ciclo For
        //for(variable;condicion;aumento o decremento){
        //accion
        //}
        for(int f = 1; f<=10;f++){
            System.out.println(f);

        }
    }
}

