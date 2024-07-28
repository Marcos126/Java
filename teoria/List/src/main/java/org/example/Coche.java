package org.example;

public class Coche {
    private String id;
    private String nombre;
    private String desc;

    public Coche(String id, String nombre, String desc){
        this.id = id;
        this.nombre = nombre;
        this.desc = desc;
    }
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDesc(){
        return desc;
    }
}
