package Exceptions;

public class Exceptions {

    public static void main(String[] args) {

        // Manejo de excepciones

        // try catch

        try {
            var result = 10/0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0. Error: " + e);
        }

        // try con múltiples catch

        try {
            var result = 10/5;
            System.out.println(result);

            var name = "Alicia";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0. Error: " + e);
        } catch (NullPointerException e) {
            System.out.println("Ha ocurrido un null pointer mítico. Error: " + e);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado. Error: " + e);
        }

        // finally

        try {
            var result = 10/0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0. Error: " + e);
        } finally {
            System.out.println("Fin del bloque try-catch ");
        }


        // throw

        var throwExample = new ThrowExample();

        try {
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }

        // Excepción personalizada

        try {
            throwExample.checkScore(450);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuación: " + e.getMessage());
        }

        System.out.println("Fin");
    }
}
