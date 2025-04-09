public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "plus";

        //operador relacional
        if (fechaDeLanzamiento > 2022) {
            System.out.println("Películas más populares");
        } else {
            System.out.println("Películas retro que aun vale la pena ver");
        }

        //operador logico
        if (incluidoEnElPlan && tipoDePlan.equals("plus")) {
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("La pelicula no esta disponible pra este plan");
        }
    }
}
