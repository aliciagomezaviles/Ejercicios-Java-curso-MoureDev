package Extras;

import oop.Classes;
import oop.Person;
// import oop.*; (Utilizar todo el paquete con el *)

import java.util.Scanner;

public class Extras {

    static String globalName = "Aliciagom";

    public static void main(String[] args) {

        // Extras

        // null (ausencia de valor o referencia vacía)

        String name = "Alicia";
        name = null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        }

        // import

        new Person("Alicia", 18);
        new Classes();

        // Scanner (capacidad de solicitar datos al usuario)

        var scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");

        var age = scanner.nextInt();
        System.out.println("La ead es: " + age);

        // Scope: variables globales y locales (ámbito de actuación de las variables)

        test();

        // static (static pertenece a la clase, no a la instancia)



    }

    public static void test() {
        System.out.println(globalName);
    }
}
