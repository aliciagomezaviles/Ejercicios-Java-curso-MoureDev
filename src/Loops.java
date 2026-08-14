import java.util.HashMap;
import java.util.HashSet;

public class Loops {

    public static void main(String[] args) {

        // Loops

        // - for controlado por contador

        for (int index = 0; index < 5; index++) {
            System.out.println("Hola, Alicia!");
        }

        for (int index = 2; index < 4; index++) {
            System.out.println("Hola, Java!");
        }

        for (int i = 3; i >= 1; i--) {
            System.out.println("Es verano");
        }

        // - for en estructuras

        String[] names =  {"Alicia", "Bob", "Charlie"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        for (int index = 1; index < names.length + 1; index++) {
            System.out.println(names[index -1]);
        }

        // for-each, ideal para recorrer arrays o listas

        for (String name : names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (Integer number : numbers) {
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Alicia", "alicia@gmail.com");
        emails.put("Bob", "bob@gmail.com");
        emails.put("Charlie", "charlie@gmail.com");

        for (HashMap.Entry<String, String> email : emails.entrySet()) {
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        // - while (se repite mientras la condición sea verdadera)

        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Alicia!");
            index++;
        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
                index ++;
        }

        index = 0;
        Boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Bob")) {
                find = true;
            }
            index++;
        }

        // - do-while (se ejecuta siempre una vez)

        index = 0;

        do {
            System.out.println("Hola, Alicia!");
            index++;
        } while (index < 0); // Se ejecuta una vez y después se empieza a comprobar el criterio.

        // - break (Detiene el bucle)(control de bucles)

        for (String name : names) {
            if (name.equals("Bob")) {
                break;
            }
            System.out.println(name);
        }

        // - continue (Continua el bucle) (Control de bucles)

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue; // fuerza la siguiente ejecución del bucle
            }
            System.out.println(i);
        }
    }
}
