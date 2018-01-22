package ejercicio17_2;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Alumnos{

    public int[] arrayAlumnos(){
        int[] notas=new int[30];
        for(int i=0; i<notas.length; i++){
            notas[i]=ThreadLocalRandom.current().nextInt(1, 10+1);
            System.out.println(notas[i]);
        }
        return notas;
    }

    public void comprobarAprobados(int[] notas){
        int aprobados=0;
        int suspensos=0;
        for(int i=0; i<notas.length; i++){
            if(notas[i]>=5){
                aprobados=aprobados+1;
            }else{
                suspensos=suspensos+1;
            }
        }
        JOptionPane.showMessageDialog(null, "Aprobados: "+aprobados+"\nSuspensos: "+suspensos);
    }

    public void notaMedia(int[] notas){
        float notaMed;
        int total=0;
        for(int i=0; i<notas.length; i++){
            total=total+notas[i];
        }
        notaMed=total/notas.length;
        JOptionPane.showMessageDialog(null, "Nota media de la clase: "+notaMed);
    }

    public void notaMasAlta(int[] notas){
        int memoria=0;
        for(int i=0; i<notas.length; i++){
            if(notas[i]>memoria){
                memoria=notas[i];
            }
        }
        JOptionPane.showMessageDialog(null, "La nota mas alta es un: "+memoria);
    }
}
