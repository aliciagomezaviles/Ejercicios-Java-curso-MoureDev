public class Operators {

    public static void main(String[] args) {

        // Operadores

        // Aritméticos (operaciones matemáticas)

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); /* Da resultado entero porque los dos datos son enteros,
        si se cambia alguno de ellos a decimal (double, float) ya daría resultado con decimales */
        System.out.println(a % b); // Resultado del resto de la división.

        double c = 5;
        var d = 2;
        System.out.println(c / d); // Resultado 2.5, con decimales ya.


        // Asignación (asigna valores a las variables)

        a = b;
        System.out.println(a); // Ahora "a" tiene el valor de "b".

        a = b * 2;
        System.out.println(a); // Ahora el nuevo valor de "a" es "b" x2.

        a += 1; // Sería como a = a + 1
        System.out.println(a); // Al valor de "a" se le está sumando 1.

        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Todas las operaciones se van ejecutando tomando el resultado anterior de "a".


        // Relacionales o de comparación. (True/False)

        System.out.println(a == b); // Compara si el valor de "a" coincide con el valor de "b".
        System.out.println(a == 6); // False, en la última operación "a" valía 0.
        System.out.println(a == 0);

        System.out.println(a != b); // Desigualdad, ¿a es distinto de b?
        System.out.println(a > b); // Mayor que
        System.out.println(a >= b); // Mayor o igual que
        System.out.println(a < b); // Menor que
        System.out.println(a <= b); // Menor o igual que


        // Lógicos
        // Si usamos && (AND) solo es verdadero si todo es verdadero, en caso contrario siempre será falsa.

        // Y (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2); // Verdadero y falso = falso

        // O (OR)
        // Funciona al contrario que AND, va a ser falsa si todas son false
        // En el momento que haya alguna verdadera va a ser true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2); // True porque una de las condiciones es verdadera.

        // NO (NOT) (Operador de negación)
        // Le da la vuelta al resultado
        // Si algo es verdadero y lo negamos será falso
        // Si algo es falso y lo negamos será verdadero

        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2); // Da false porque estoy negando algo que es verdadero


        // Unarios (Operan sobre un solo operando)

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b); // Si ponemos el operador delante va a incrementar el valor antes de imprimirlo
        System.out.println(b++); // Si ponemos el operador detrás lo que hace es imprimirlo primero y
        // luego aumentar el valor
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}
