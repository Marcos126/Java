package ClasesYObjetos;

public class Brazo {

    private float durabilidad  = 100;

    public void usoDurabilidad(float uso_durabilidad){
        durabilidad -= uso_durabilidad;
    }

    public void recargaDurabilidad(float recarga_durabilidad){
        durabilidad += recarga_durabilidad;
    }

    public float getDurabilidad(){
        return durabilidad;
    }

}
