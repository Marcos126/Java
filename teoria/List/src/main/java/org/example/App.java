package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    static List<Coche> listCoches = new ArrayList<>(Arrays.asList(
            new Coche("1","corvete","anaanananashei"),
            new Coche("2","lambo","nashei"),
            new Coche("3","ferrari","fiuuum")
    ));

    public static  void main( String[] args )
    {
        updateCoche("1", );

        for(Coche coche : listCoches){
            System.out.println(coche.getId());
            System.out.println(coche.getNombre());
            System.out.println(coche.getDesc());
        }
    }
    public static Coche creacionCoche(){
        return new Coche("5","Ford Fiesta","Miller");
    }
    public static Coche getCocheById(String id){
        for(int i = 0; i < listCoches.size(); i++) {
            if(listCoches.get(i).getId().equals(id)) {
                return listCoches.get(i);
            }
        }
        return null;
    }

    public static void updateCoche(String id,Coche coche){
        for(int i = 0; i < listCoches.size(); i++){
            if(listCoches.get(i).getId().equals(id)) {
                listCoches.set(i, coche);
            }
        }
    }
}
