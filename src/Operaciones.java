import libreria.LeerDatos.LeerDatosJOP;
import libreria.MostrarDatos.MostrarDatos;

/**
 * @author Alejandro Yañez Meseguer
 * @version 1.0
 */

public class Operaciones {

    /**
     * creamos el metodo operar que sera al metodo que utilizaremos de libreria para la calculadora
     *
     */
    public static void operar() {

        /**
         * @param num1 este parametro sera el primer numero de la operacion que introducira el usuario por pantalla
         * @param num2 este parametro sera el segundo numero de la operacion que introducira el usuario por pantalla
         * @param resultado este parametro de utiliza para guardar el resultado de la operacion para poeteriormente mostrarlo por panalla o utilizarlo para lo que se requiera
         * @param opcion este parametro es un numero que se pide por pantalla al usuario que el programa utiliza para saber que operacion tiene que hacer
         */
        float num1;
        float num2;
        float resultado = 0;
        float opcion = LeerDatosJOP.LeerFloat("Introduce la operacion que deseas hacer: \n" +
                "1- Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Raices");
        switch ((int) opcion) {

            /**
             * en caso de que la variable opcion sea "1" el programa hara la suma de los numeros "num1" y "num2" y mostrara el resultado por pantalla
             */
            case 1:
                num1 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                num2 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                resultado = num1 + num2;
                MostrarDatos.MostrarString(String.valueOf(resultado));
                break;
            /**
             * en caso de que la variable opcion sea "2" el programa hara la resta de los numeros "num1" y "num2" y mostrara el resultado por pantalla
             */
            case 2:
                num1 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                num2 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                resultado = num1 - num2;
                MostrarDatos.MostrarString(String.valueOf(resultado));
                break;
            /**
             * en caso de que la variable opcion sea "3" el programa hara la multiplicacion de los numeros "num1" y "num2" y mostrara el resultado por pantalla
             */
            case 3:
                num1 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                num2 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                resultado = num1 * num2;
                MostrarDatos.MostrarString(String.valueOf(resultado));
                break;
            /**
             * en caso de que la variable opcion sea "4" el programa hara la division de los numeros "num1" y "num2" y mostrara el resultado por pantalla
             */
            case 4:
                num1 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                num2 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                resultado = num1 / num2;
                MostrarDatos.MostrarString(String.valueOf(resultado));
                break;
            /**
             * en caso de que la variable opcion sea "1" el programa hara la raiz utilizando el "num1" como radicando y el "num2" como indice y mostrara el resultado por pantalla
             */
            case 5:
                num1 = LeerDatosJOP.LeerFloat("Introduce el radicando: ");
                num2 = LeerDatosJOP.LeerFloat("Introduce el indice: ");
                resultado = (float) Math.pow(num1,1/num2);
                MostrarDatos.MostrarString(String.valueOf(resultado));
                break;
        }
    }
}


