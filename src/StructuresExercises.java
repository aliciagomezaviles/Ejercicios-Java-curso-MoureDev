import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println("La longitud del Array es de: " + numbers.length);


        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes
        // y después de modificarlo.

        System.out.println("El valor de la posición 2 es: " + numbers[1]);
        numbers[1] = 6;
        System.out.println("El valor de la posición 2 después de modificarla es de: " + numbers[1]);


        // 3. Crea un ArrayList vacío

        ArrayList<String> names = new ArrayList<>();

        System.out.println("ArrayList vacío creado. Tamaño: " + names.size());


        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

        names.add("Lagartija");
        names.add("Hipopótamo");
        names.add("Cocodrilo");
        names.add("Elefante");
        System.out.println("ArrayList después de añadir 4 animales: " + names);
        names.remove("Hipopótamo");
        System.out.println("ArrayList después de borrar Hipopótamo: " + names);

        // 5. Crea un HashSet con 2 valores diferentes.

        HashSet<String> names2 = new HashSet<>();
        names2.add("Mosca");
        names2.add("Mosquito");
        System.out.println("HashSet creado con dos valores diferentes: " + names2);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        names2.add("Mosca");
        names2.add("Abeja");
        System.out.println("HashSet después de intentar añadir un valor repetido (Mosca) y otro nuevo (Abeja): " + names2);

        // 7. Elimina uno de los elementos del HashSet.

        names2.remove("Mosca");
        System.out.println("HashSet después de eliminar 'Mosca': " + names2);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de
        // teléfono. Añade tres contactos.

        HashMap<String, String> names3 = new HashMap<>();

        names3.put("Alicia", "123456789");
        names3.put("Pablis", "987654321");
        names3.put("Bob", "234156798");
        System.out.println("Agenda de teléfonos: " + names3);

        // 9. Modifica uno de los contactos y elimina otro.

        names3.put("Alicia", "000987678");
        System.out.println("Agenda después de modificar número de teléfono de 'Alicia': " + names3);
        names3.remove("Bob");
        System.out.println("Agenda después de eliminar el contacto de 'Bob': " + names3);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        // Array

        String[] countries = {"España", "Italia", "Colombia", "Argentina"};
        System.out.println("Array original: " + java.util.Arrays.toString(countries));

        // Array a ArrayList

        ArrayList<String> countriesList = new ArrayList<>();
        for(String country : countries) {
            countriesList.add(country);
        }
        System.out.println("ArrayList: " + countriesList);

        // ArrayList a HashSet (elimina duplicados)

        HashSet<String> countriesSet = new HashSet<>(countriesList);
        System.out.println("HashSet (sin duplicados): " + countriesSet);

        // HashSet a HashMap

        HashMap<String, String> countriesMap = new HashMap<>();
        for(String country : countriesSet) {
            countriesMap.put(country, country);
        }
        System.out.println("HashMap (clave = valor): " + countriesMap);
    }
}
