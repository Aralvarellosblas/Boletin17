package ejercicio17_3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Alumnos{

    public int[] arrayAlumnos(){
        int[] notas=new int[7];
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

    public String[] nomesAlumnos(){
        String[] nomes={"Pedro", "Manolo", "Roberto", "Laura", "Maria", "Anna", "Sara"};
        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }
        return nomes;
    }

    public void notaAlumno(int[] notas, String[] nomes, String nomeAl){
        int marca=0;
        for(int i=0; i<nomes.length; i++){
            if(nomeAl.equalsIgnoreCase(nomes[i])){
                JOptionPane.showMessageDialog(null, "La nota de "+nomes[i]+" es: "+notas[i]);
                break;
            }
//            else{
//                marca=1;
//            }
//        }
//        if(marca==1){
//            JOptionPane.showMessageDialog(null, "Ese alumno no existe");
        }
    }

    public void nomeAprobados(int[] notas, String[] nomes){
        for(int i=0; i<notas.length; i++){
            if(notas[i]>=5){
                System.out.println("Nombre: "+nomes[i]+". Nota: "+notas[i]);
            }
        }
    }
    public void ordenar(int[] notas, String[] nomes){
       Arrays.sort(notas);
       for(int i=0; i<notas.length; i++){
           System.out.println("Nota: "+notas[i]+" "+nomes[i]);
       }
    }
}
