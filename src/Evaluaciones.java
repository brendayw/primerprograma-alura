import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0.0;
        double mediaEvaluaciones = 0.0;
        double totalEvaluaciones = 0.0;

        while(nota != -1.0) {
            System.out.println("Ingrese la nota que le daria a la pelicula: ");
            nota = teclado.nextDouble();
            if (nota != -1.0) {
                mediaEvaluaciones += nota;
                ++totalEvaluaciones;
            }
        }

        System.out.println("La media de las evaluaciones es " + mediaEvaluaciones / totalEvaluaciones);
        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
        }

    }
}
