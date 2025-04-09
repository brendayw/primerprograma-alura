import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicul que quieres ver");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fecha = teclado.nextInt();
        System.out.println("Deci que nota le das a la pelicula");
        double nota = teclado.nextDouble(); //se usa coma, no punto para indicar la nota si es double

        System.out.println(pelicula);
        System.out.println(fecha);
        System.out.println(nota);

    }
}
