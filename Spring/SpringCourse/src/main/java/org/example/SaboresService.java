package org.example;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SaboresService {
    List <Sabores> sabores =  new ArrayList<>(Arrays.asList(
            new Sabores("1","Chocolate","chocolate pos wn (? "),
            new Sabores("2","Crema del cielo","kjj"),
            new Sabores("3","Vainilla","vainilla po")
    ));
    public List<Sabores> getAllSabores(){
        return sabores;
    }

    public Sabores getSaborById(String id){
        for(Sabores sabor: sabores)
            if(sabor.getId().equals(id)){
                return sabor;
            }
        return null;
    }

    public String addSabor(Sabores sabor){
        sabores.add(sabor);
        return "Añadiste un sabor correctamente";
    }

    public void updateSabor(String id, Sabores updatedSabor) {
        for(int i = 0; i < sabores.size(); i++){
            Sabores sabor = sabores.get(i);
            if(sabor.getId().equals(id)){
                sabores.set(i,updatedSabor);
                return;
            }
        }
    }
    public String deleteSabor(String id){
        sabores.remove(getSaborById(id));
        return "Sabor borrado correctamente";
    }
}
