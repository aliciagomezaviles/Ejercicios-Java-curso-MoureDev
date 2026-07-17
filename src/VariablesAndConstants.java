public class VariablesAndConstants {

    public static void main(String[] args) {

        //Variables

        String name = "Alicia";
        System.out.println(name);

        name = "Gómez";
        System.out.println(name);

        // name = 37; Error, no podemos cambiar el tipo de dato.

        int age = 38;
        System.out.println(age);

        var email = "gomezcia@hotmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);


        //Constantes

        final String EMAIL = "gomezcia@hotmail.com";
        // EMAIL = "agomez@hotmail.com"; No puede variar porque es constante.
        // Las constantes van en mayúsculas para identificarlas mejor.
        System.out.println(EMAIL);
    }
}
