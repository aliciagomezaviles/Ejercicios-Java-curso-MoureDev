import java.util.ArrayList;
import java.util.Scanner;

public class List {

    public static void main(String[] args){

        // Declaración y creación

        ArrayList<String> names = new ArrayList<>(); // Forma de crearlo clásica
        var numbers = new ArrayList<Integer>();  // Forma de crearlo moderna

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Alicia");
        names.add("Gómez");
        names.add("Pablo");
        System.out.println(names.size());

        // Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1));

        // Modificar los elementos

        names.set(2, "alicia@gmail.com");
        System.out.println(names.getLast());

        // Eliminar elementos

        names.remove(2);
        // System.out.println(names.get(2)); // Error,ya no existe
        System.out.println(names.size());

        // Buscar elementos

        System.out.println(names.contains("Alicia"));
        System.out.println(names.contains("Pablo"));

        // Limpiar Arraylist

        names.clear();
        System.out.println(names.size());
    }
}
