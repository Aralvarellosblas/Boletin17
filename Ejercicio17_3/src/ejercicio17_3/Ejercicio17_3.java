package ejercicio17_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Ejercicio17_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumnos al=new Alumnos();
        int[] notas=al.arrayAlumnos();
//        al.comprobarAprobados(notas);
//        al.notaMedia(notas);
//        al.notaMasAlta(notas);
        String[] nomes=al.nomesAlumnos();
//        al.notaAlumno(notas, nomes, JOptionPane.showInputDialog("Nombre del alumno"));
        al.nomeAprobados(notas, nomes);
        al.ordenar(notas, nomes);
    }

}
