package Exceptions;

import java.lang.reflect.Array;

public class ExceptionsExercises {

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por
        // cero con try-catch.

        int number1 = 10;
        int number2 = 0;

        try {
            int result = number1 / number2;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error, no se puede dividir por cero");
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el
        // ArrayIndexOutOfBoundsException.

        int[] numbers = {1, 2, 3};

        try {
            System.out.println("Elemento en índice 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error, índice fuera del rango del array");
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el
        // NullPointerException.

        String text = null;

        try {
            System.out.println("La longitud del texto es: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Error, la variable del texto es nula");
        }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para
        // manejar entradas no válidas (NumberFormatException).

        System.out.println(convertToNumber("123"));
        System.out.println(convertToNumber("abc"));


        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o
        // no error.

        try {
            int division = 10 / 2;
            System.out.println("División exitosa: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error en la división");
        } finally {
            System.out.println("Este bloque siempre se ejecuta");
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido
        // es negativo.

        try {
            checkPositiveNumber(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error :" + e.getMessage());
        }

        try {
            checkPositiveNumber(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si
        // la temperatura es menor a -50 o mayor a 50.

        TemperatureChecker temperatureChecker = new TemperatureChecker();

        try {
            temperatureChecker.checkTemperature(25);
        } catch (InvalidTemperatureException e) {
            System.out.println("Error de temperatura: " + e.getMessage());
        }

        try {
            temperatureChecker.checkTemperature(60);
        } catch (InvalidTemperatureException e) {
            System.out.println("Error de temperatura: " + e.getMessage());
        }


        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException,
        // otro para ArrayIndexOutOfBoundsException.

        try {
            int[] array = {1, 2, 3};
            int result = 10 / 2;
            System.out.println(array[10]);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: División por cero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de array: índice fuera de límites");
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la
        // contraseña es demasiado corta.

        try {
            checkPassword("123");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de contraseña: " + e.getMessage());
        }

        try {
            checkPassword("miContraseñaSegura");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de contraseña: " + e.getMessage());
        }

        // 10. Implementa una clase LoginSystem que use una excepción personalizada
        // LoginFailedException si el usuario o contraseña son incorrectos.

        LoginSystem loginSystem = new LoginSystem();

        try {
            loginSystem.login("admin", "password123");
        } catch (LoginFailedException e) {
            System.out.println("Error de login: " + e.getMessage());
        }

        try {
            loginSystem.login("usuario", "incorrecta");
        } catch (LoginFailedException e) {
            System.out.println("Error de login: " + e.getMessage());
        }
    }


    // 4. Escribe una función que transforma texto a número. Usa try-catch para
    // manejar entradas no válidas (NumberFormatException).

    public static String convertToNumber(String text) {
        try {
            int number = Integer.parseInt(text);
            return "Número convertido: " + number;
        } catch (NumberFormatException e) {
            return "Error, no se puede convertir " + text + " a número";
        }
    }


    // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido
    // es negativo.

    public static void checkPositiveNumber(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        } else {
            System.out.println("Número válido: " + number);
        }
    }


    // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si
    // la temperatura es menor a -50 o mayor a 50.

    public static class TemperatureChecker {

        public void checkTemperature(double temperature) throws InvalidTemperatureException {
            if (temperature < -50 || temperature > 50) {
                throw new InvalidTemperatureException("La temperatura debe estar entre -50 y 50");
            } else {
                System.out.println("La temperatura es válida: " + temperature + " Grados");
            }
        }

    }

    public static class InvalidTemperatureException extends Exception {
        public InvalidTemperatureException(String message) {
            super(message);
        }
    }

    // 9. Crea una función checkPassword(String pass) que lance una excepción si la
    // contraseña es demasiado corta.

    public static void checkPassword(String password) throws IllegalArgumentException {
        if (password.length() < 8) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres");
        } else {
            System.out.println("Contraseña válida");
        }
    }

    // 10. Implementa una clase LoginSystem que use una excepción personalizada
    // LoginFailedException si el usuario o contraseña son incorrectos.

    public static class LoginSystem {
        private final String validUser = "admin";
        private final String validPassword = "password123";

        public void login(String username, String password) throws LoginFailedException {
            if (!username.equals(validUser) || !password.equals(validPassword)) {
                throw new LoginFailedException("Usuario o contraseña incorrectos");
            } else {
                System.out.println("Login exitoso para el usuario: " + username);
            }
        }
    }

    public static class LoginFailedException extends Exception {
        public LoginFailedException(String message) {
            super(message);
        }
    }
}

