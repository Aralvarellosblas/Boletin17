package ejercicio17_1;

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Arturo
 */
public class Numeros{

    int[] numeros=new int[6];

    public void arrayNum(){

        for(int i=0; i<numeros.length; i++){
            numeros[i]=ThreadLocalRandom.current().nextInt(1, 50+1);
            System.out.println(numeros[i]);
        }
    }
    public void mostrarArray(){
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    public int[] reverseArray(){
        for(int i=0; i<numeros.length/2; i++){
            int temp=numeros[i];
            numeros[i]=numeros[numeros.length-i-1];
            numeros[numeros.length-i-1]=temp;
        }
        return numeros;
    }
}
