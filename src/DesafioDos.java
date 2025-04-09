import java.util.Random;
import java.util.Scanner;

public class DesafioDos {
    public static void main(String[] args) {
        // Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y
        // 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
        // Consejos:
        // Para generar un número aleatorio en Java: new Random().nextInt(100);
        // Utiliza el Scanner para obtener los datos del usuario.
        // Utiliza una variable para contar los intentos.
        // Utiliza un bucle para controlar los intentos.
        // Utiliza la instrucción ‘break;’ para salir del bucle.

        Scanner teclado = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int intentos = 0;

        System.out.println("Jueguemos a adivinar el numero secreto.");

        while (intentos < 5) {
            System.out.println("Ingrese un numero para comenzar: ");
            int num = teclado.nextInt();

            if (numeroSecreto == num) {
                System.out.println("Felicitaciones, has adivinado el numero secreto.");
                break;
            } else {
                if (numeroSecreto > num) {
                    System.out.println("El numero a adivinar es mayor.");
                } else {
                    System.out.println("El numero a adivinar es menor.");
                }
            }
            intentos++;

            if (intentos == 5) {
                System.out.println("Agotaste el numero de intentos permitidos. El número secreto era: " + numeroSecreto);
            }
        }
        teclado.close();
    }
}
