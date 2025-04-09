import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0.0;
        double mediaEvaluaciones = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota que le daria a la pelicula: ");
            nota = teclado.nextDouble();
            mediaEvaluaciones += nota;
        }
        System.out.println("La media de las evaluaciones es " + mediaEvaluaciones / 3);
    }
}
