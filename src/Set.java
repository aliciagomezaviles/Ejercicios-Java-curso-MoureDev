import java.util.HashSet;

public class Set {

    public static void main(String[] args) {

        // Declaración y creación

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Alicia");
        names.add("Bob");
        names.add("Charlie");
        names.add("alicia@gmail.com");
        System.out.println(names.size());

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Acceder a los elementos. El set es una estructura desordenada (No se utilizan los sets para almacenar
        // datos de forma ordenada

        System.out.println(names);

        // Eliminar elementos

        names.remove("Charlie");
        System.out.println(names.size());

        // Buscar elementos

        System.out.println(names.contains("Alicia"));
        System.out.println(names.contains("Bob"));
        System.out.println(names.contains("Charlie"));
        System.out.println(names.contains("Pablo"));

        // No permite datos repetidos

        System.out.println(names);
        names.add("Alicia");
        names.add("Alicia");
        names.add("Alicia");
        System.out.println(names);

        // Trabajo con conjuntos

        // names.addAll(numbers); (Error por incompatibilidad de datos)

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("Francia");
        countries.add("Argentina");

        names.addAll(countries);

        System.out.println(names);

        names.removeAll(countries);

        System.out.println(names);

        names.retainAll(countries); // Deja solo los elementos comunes
    }
}
