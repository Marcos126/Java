package ClasesYObjetos;

public class Nucleo {

    private float energia=100;

    public float getEnergia(){
        return this.energia;
    }

    public void usoEnergia(float energia){
        this.energia -= energia;
    }


}
