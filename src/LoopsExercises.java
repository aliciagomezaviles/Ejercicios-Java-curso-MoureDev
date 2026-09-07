import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while

        int index = 1;
        while(index <= 10){
            System.out.println((index++));
        }

        // 2. Usa do-while para mostrar todos los valores de un Arraylist

        ArrayList<String> names = new ArrayList<>();

        names.add("Alicia");
        names.add("Bob");
        names.add("Paul");

        int i = 0;

        if (!names.isEmpty()) {
            do {
                System.out.println(names.get(i));
                i++;
            } while (i < names.size());
        } else {
            System.out.println("El Arraylist está vacío");
        }

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        for (int number = 1; number <= 50; number++){
            if (number % 5 == 0){
                System.out.println("Múltiplo de 5: " + number);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.

        int[] numbers = {2, 4 ,6 , 8, 10};
        int sum = 0;

        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("La suma total es: " + sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        int[] numeros = {10, 5, 8, 12, 3};

        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        HashSet<String> fruits = new HashSet<>();
        fruits.add("Manzana");
        fruits.add("Plátano");
        fruits.add("Naranja");

        // Recorrer HashSet con for-each
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Ana", 20);
        ages.put("Luis", 25);
        ages.put("Marta", 22);

        // Recorrer HashMap con for-each
        for (Map.Entry<String, Integer> person : ages.entrySet()) {
            System.out.println(person.getKey() + ": " + person.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.

        for (i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        for (i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un
        // array.

        int[] num = {1, 2, 3, 0, 4, 5, -2, 1};

        for (i = 0; i < num.length; i++){
            if (num[i] < 0) {
                break;
            }
            System.out.println(num[i]);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.

        int factorial = 1;

        for (i = 1; i <= 5; i++) {
            factorial *= i;
        }

        System.out.println("El resultado factorial de 5 es:  " + factorial);
    }
}
