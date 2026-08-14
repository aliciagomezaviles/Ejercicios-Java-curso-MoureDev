import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // HashMaps es una estructura de datos que almacena un conjunto de pares clave-valor
        // Hay que indicar de qué tipo de dato va a ser la clave y de qué tipo de dato va a ser el valor

        // Declaración y creación

        HashMap<String, String> names  = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.put("Alicia", "alicia@gmail.com");
        names.put("Bob", "bob@gmail.com");
        names.put("Pablis", "pablis@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // No trabaja con una estructura ordenada.

        // Acceder a los elementos (Se accede al elemento por la clave)

        System.out.println(names.get("Alicia"));
        System.out.println(names.get("Charlie")); // No existe y nos devuelve null

        // Verificar elementos

        System.out.println(names.containsKey("Bob")); // Verifica si contiene la clave
        System.out.println(names.containsKey("Paul"));

        System.out.println(names.containsValue("alicia@gmail.com")); // Verifica si el valor existe

        // Eliminar elementos

        names.remove("Bob");
        System.out.println(names);

        // Limpiar Hashmap

        names.clear();
        System.out.println(names);

        // Modificación de elementos.

        names.put("Alicia", "alicia@gmail.com");
        System.out.println(names);

        names.put("Alicia", "aliciagomez@gmail.com");
        System.out.println(names);  // Para modificar solo hay que añadir otro valor a la clave y lo reemplaza

        names.replace("Bob", "bob@gmail.com");
        System.out.println(names); // Con "replace" Solo se añade si la clave existe si no existe no añade nada,
        // se añade sí o sí con el put

        names.putIfAbsent("Bob", "bob@gmail.com"); // Solo lo añade si no existe
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty()); // Comprueba si está vacío

        System.out.println(names.values()); // Devuelve solo los valores
    }
}
