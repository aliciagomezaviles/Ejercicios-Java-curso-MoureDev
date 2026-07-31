public class Strings {

    public static void main(String[] args) {

        // Cadena de texto

        String name = "Alicia";
        var surname = new String("Gómez");

        // Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // length (Retorna la longitud del String)
        System.out.println(name.length());

        // charAt (Obtener caracter concreto)
        // El primer índice corresponde al valor 0
        System.out.println(name.charAt(1)); // La primera posición corresponde con el 0

        // Último caracter si no sabemos la longitud
        System.out.println(name.charAt(name.length() - 1));

        // Obtener una subcadena, un trocito de la cadena
        // substring
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3)); // Excluye el valor del índice final

        // Transformar cadenas de texto a mayúsculas o a minúsculas
        // toUpperCase
        // toLowerCase
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);

        // Contains (verifica si una cadena de texto incluye una palabra, letra o fragmento específico)
        // Devuelve true o false
        System.out.println("Hola, Java".contains("Alicia"));
        System.out.println("Hola, Java".contains("ava"));
        System.out.println("Hola, Java".contains("AVA"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Equals (compara si dos Strings son exactamente iguales)
        // No se usa == para comparar Strings
        // Devuelve true o false
        System.out.println(name.equals("Alicia"));
        System.out.println(name.equals("alicia"));
        System.out.println(name.equalsIgnoreCase("alicia")); // Ignora mayúsculas y minúsculas

        // Trim (Elimina espacios al principio y al final)
        System.out.println(" Hola, me llamo Alicia ");
        System.out.println(" Hola, me llamo Alicia ".trim());

        // Replace (reemplazar caracteres)
        System.out.println(" Hola, me llamo Alicia ".replace("Alicia", "Gómez"));
        System.out.println(" Hola, me llamo Alicia ".replace(" ", ""));

        // Format
        // Permite insertar valores dentro de un texto de forma ordenada y controlada
        // %s formateo cadena de texto
        // %d formateo números enteros
        // %f formateo números decimales
        var age = 39;
        System.out.println(String.format("Hola, %s. Tengo %d años", name, age));
    }
}
