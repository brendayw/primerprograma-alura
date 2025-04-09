public class Desafio1 {

    public static void main(String[] args) {
        //desafio 1
        //Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit. Utiliza variables para
        // representar los valores de las temperaturas e imprime en la consola el valor convertido de Celsius a
        // Fahrenheit.

        //Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.
        //Después de terminar, probar y verificar que tu programa se haya ejecutado correctamente, crea una variable
        //entera para mostrar la temperatura en Fahrenheit sin decimales. Recuerda que probablemente necesitarás
        //realizar un casting de valores.

        double temperaturaCelsius= 38.5;
        int VALOR_CONSTANTE = 32;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + VALOR_CONSTANTE;
        System.out.println("La temperatura de " + temperaturaCelsius + " °C a Fahrenheit es " + temperaturaFahrenheit);

        //cast explicito
        int tempFahrenheitCast = (int) temperaturaFahrenheit;
        System.out.println("La temperatura con cast explicito es: " + tempFahrenheitCast);
    }
}
