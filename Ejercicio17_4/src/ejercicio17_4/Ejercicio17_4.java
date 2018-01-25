package ejercicio17_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Ejercicio17_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI dni=new DNI();
        String[]letras=dni.arrayLetra();
        int numerodni=39495621;
        int resto=dni.calcularResto(numerodni);
        JOptionPane.showMessageDialog(null,"DNI: "+numerodni);
        dni.calcularLetra(letras, resto);
    }

}
