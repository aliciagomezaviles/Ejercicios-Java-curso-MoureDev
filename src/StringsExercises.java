public class StringsExercises {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.
        System.out.println("Mi nombre es" + " " + "Alicia");

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("Gómez".length());

        // 3. Muestra el primer y último carácter de un string
        String name = "Alicia";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("Vivo en Madrid".contains("Madrid"));

        // 6. Formatea un string con un entero.
        int age = 39;
        System.out.println(String.format("Tengo %d años", age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" En mi tiempo libre me gusta leer ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(" En mi tiempo libre me gusta leer ".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println("Pelota".equals("Pelota"));
        System.out.println("Pelota".equals("pelota"));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println("Pelota".length() == ("pelota".length()));
    }
}
