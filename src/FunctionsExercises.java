
import java.util.ArrayList;

public class FunctionsExercises {

    public static void main(String[] args){

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde
        // cero!".

        message();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa
        // persona.

        greetUser("Alicia");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.

        int result = subtractNumbers(10, 3);
        System.out.println("Resultado de la resta: " + result);
        System.out.println("15 - 8 = " + subtractNumbers(15, 8));

        // 4. Crea un método que calcule el cuadrado de un número (n * n).

        int square = calculateSquare(5);
        System.out.println("El cuadrado de 5 es: " + square);
        System.out.println("El cuadrado de 7 es: " + calculateSquare(7));

        // 5. Escribe una función que reciba un número y diga si es par o impar.

        checkEvenOrOdd(6);
        checkEvenOrOdd(9);
        checkEvenOrOdd(14);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y
        // false en caso contrario).

        age(9);
        age(19);
        age(54);

        boolean isAdult1 = isAdult(15);
        boolean isAdult2 = isAdult(27);
        System.out.println("¿Es mayor de edad (17 años)? " + isAdult1);
        System.out.println("¿Es mayor de edad (25 años)? " + isAdult2);

        // 7. Implementa una función que reciba una cadena y retorne su longitud.

        String text = "Hola, Java!";
        int length = getStringLength(text);
        System.out.println("La longitud de '" + text + "' es: " + length);
        System.out.println("La longitud de 'Java' es: " + getStringLength("Java"));

        // 8. Crea un método que reciba un array de enteros, calcula su media y lo
        // retorna.

        int[] numbers = { 10, 20, 30, 40, 50 };
        double average = calculateAverage(numbers);
        System.out.println("La media del array es: " + average);

        // 9. Escribe un método que reciba un número y retorna su factorial.

        int factorialResult = calculateFactorial(10);
        System.out.println("El factorial de 10 es: " + factorialResult);
        System.out.println("El factorial de 5 es: " + calculateFactorial(5));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
        // cada elemento.

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("manzana");
        fruits.add("plátano");
        fruits.add("naranja");
        fruits.add("uva");

        printArrayList(fruits);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Madrid");
        cities.add("Barcelona");
        cities.add("Valencia");

        printArrayList(cities);
    }





    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde
    // cero!".

    public static void message() {
        System.out.println("Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa
    // persona.

    public static void greetUser(String name){
        System.out.println("¡Hola, " + name + "! Es un placer conocerte.");
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.

    public static int subtractNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).

    public static int calculateSquare(int number) {
        return number * number;
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("El número " + number + " es par");
        } else {
            System.out.println("El número " + number + " es impar");
        }
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y
    // false en caso contrario).

    public static void age(int number){
        if (number >= 18) {
            System.out.println("Tiene " + number + " y es mayor de edad");
        } else {
            System.out.println("Tiene " + number + " y es menor de edad");
        }
    }

    public static boolean isAdult(int age){
        return age >= 18;
    }

    // 7. Implementa una función que reciba una cadena y retorne su longitud.

    public static int getStringLength(String text) {
        return text.length();
    }

    // 8. Crea un método que reciba un array de enteros, calcula su media y lo
    // retorna.

    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    // 9. Escribe un método que reciba un número y retorna su factorial.

    public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
    // cada elemento.

    public static void printArrayList(ArrayList<String> list) {
        System.out.println("Elementos del ArrayList:");
        for (String element : list) {
            System.out.println("- " + element);
        }
    }
}
