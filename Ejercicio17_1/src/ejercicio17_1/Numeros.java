package ejercicio17_1;

import static java.lang.Math.random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Arturo
 */
public class Numeros {
       
    public void arrayNum(){
        int[] numeros =new int[6];
        
        for(int i=0;i<numeros.length;i++){
            numeros[i]=ThreadLocalRandom.current().nextInt(1,50+1);
            System.out.println(numeros[i]);
        }
    }
}
