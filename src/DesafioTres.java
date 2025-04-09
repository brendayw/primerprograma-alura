import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        String nombre = "Brenda";
        String tipoDeCuenta = "CC";
        double saldo = 250000.00;
        int opcion = 0;

        System.out.println("***********************");
        System.out.println("El nombre del cliente es: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldo);
        System.out.println("***********************");

        String menu = """
                Ingrese una opcion:
                1 - Consultar saldo
                2 - Retirar dinero
                3 - Depositar dinero
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es " + saldo + " pesos");
                    break;
                case 2:
                    System.out.println("¿Cuanto desea retirar?");
                    double dineroARetirar = teclado.nextDouble();
                    if (dineroARetirar > saldo) {
                        System.out.println("Saldo no suficiente");
                    } else {
                        saldo = saldo - dineroARetirar;
                        System.out.println("Su saldo restante es: " + saldo + " pesos");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuanto desea depositar?");
                    double dineroADepositar = teclado.nextDouble();
                    saldo = saldo + dineroADepositar;
                    System.out.println("El saldo actual es: " + saldo + " pesos");
                    break;
                case 9:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
