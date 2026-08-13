public class Arrays {

    public static void main(String[] args) {

        // Declaración y creación

        int[] numbers = new int[3]; // Todavía no tiene dato, pero tiene los huecos reservados.
        System.out.println(numbers);

        String[] names = {"Alicia", "Gómez", "Aliciaga"};
        System.out.println(names);

        // Acceso

        System.out.println(numbers[0]);
        System.out.println(names[0]);

        // Modificación

        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        //numbers[3] = 2; Error porque yo he creado tres espacios y este sería el cuarto

        System.out.println(names[2]);
        names[2] = "Lagartija";
        System.out.println(names[2]);
        // La posición 2 tiene un valor, se modifica y termina teniendo otro.

        System.out.println(names.length); // Comprobar longitud arrays
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);  // La longitud no se puede variar.

        // numbers[2] = null; Error
        
        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);
    }
}
