import libreria.LeerDatos.LeerDatosJOP;
import libreria.MostrarDatos.MostrarDatos;

public class Operaciones {

    public static void operar() {

        float num1;
        float num2;
        float resultado = 0;
        float opcion = LeerDatosJOP.LeerFloat("Introduce la operacion que deseas hacer: \n" +
                "1- Sumar\n2-Restar\3-Multiplicar\4-Dividir");
        switch ((int) opcion) {

            case 1:
                num1 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                num2 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                resultado = num1 + num2;
                MostrarDatos.MostrarString(String.valueOf(resultado));

                break;
            case 2:
                num1 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                num2 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                resultado = num1 - num2;
                MostrarDatos.MostrarString(String.valueOf(resultado));
                break;
            case 3:
                num1 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                num2 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                resultado = num1 * num2;
                MostrarDatos.MostrarString(String.valueOf(resultado));
                break;
            case 4:
                num1 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                num2 = LeerDatosJOP.LeerFloat("Introduce un numero: ");
                resultado = num1 / num2;
                MostrarDatos.MostrarString(String.valueOf(resultado));
                break;
        }
    }
}


