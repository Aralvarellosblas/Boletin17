package ejercicio17_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class DNI {
    public String[] arrayLetra(){
        String[] letras={"T","R","W","A","G","M","Y","F","P","D","10","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        return letras;
    }
    public int calcularResto(int dni){
        int resto=dni%23;
        return resto;
    }
    public void calcularLetra(String[] array,int resto){
        for(int i=0;i<array.length;i++){
            if(resto==i){
                JOptionPane.showMessageDialog(null,"La letra del DNI será: "+array[i]);
            }
        }
    }
}
