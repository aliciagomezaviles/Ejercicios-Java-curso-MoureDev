public class DataTypes {

    public static void main(String[] args) {

        // Tipos de datos primitivos

        int myInt = 38;
        System.out.println(myInt);

        double myDouble = 1.72;
        System.out.println(myDouble);

        // float, long, byte

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hello";
        System.out.println(myString);
        //String no es un dato primitivo pero se usa muchísimo

        // Tipo de dato en tiempo de compilación

        System.out.println(myString.getClass().getSimpleName());
    }
}
