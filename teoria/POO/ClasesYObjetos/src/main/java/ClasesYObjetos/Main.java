package ClasesYObjetos;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Operacion op = new Operacion();

        int numero_a;
        int numero_b;

        numero_a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero_b = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        int suma = op.sumar(numero_a,numero_b);
        int resta = op.restar(numero_a,numero_b);
        int mult = op.multiplicar(numero_a,numero_b);
        int div = op.dividir(numero_a,numero_b);

        op.mostrarResultado(suma,resta,mult,div);

    }
}
