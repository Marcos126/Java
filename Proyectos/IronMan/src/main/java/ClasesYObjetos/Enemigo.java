package ClasesYObjetos;

public class Enemigo {

    private int vida;
    private String nombre;
    private int posicion;

    public Enemigo(String nombre, int posicion, int vida){
        this.vida = vida;
        this.posicion = posicion;
        this.nombre = nombre;

    }

    public int getVida(){
        return this.vida;
    }

    public void directDamage(int damage){
        if(vida <= 0) {
            System.out.println("El enemigo murio");
        }else {
            vida -= damage;
            System.out.println("El enemigo recibio un golpe \nVida restante: " + vida);

            if (vida <= 0) {
                System.out.println("El enemigo murio");
            }
        }
    }

    public int getPosicion(){
        return this.posicion;
    }

    public  String getNombre(){
        return this.nombre;
    }
}
