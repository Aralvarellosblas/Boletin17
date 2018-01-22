package ejercicio17_2;

/**
 *
 * @author Arturo
 */
public class Ejercicio17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumnos al=new Alumnos();
        int[] notas=al.arrayAlumnos();
        al.comprobarAprobados(notas);
        al.notaMedia(notas);
        al.notaMasAlta(notas);
    }

}
