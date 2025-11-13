/*
El programa presenta mensaje de "acceso correcto" para las placas
de vehículos de la provincia del Guayas y Pichincha

LBA-0010
GBC-0010
gbz-0101
PRZ-2020
pRC-3231
 */
package ejemplo4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo7 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la placa");
        String placa = entrada.nextLine();

        String inicial = placa.substring(0, 1); // se obtiene 

        if (inicial.equals("G") || inicial.equals("P")) {
            System.out.printf("%s\n", "acceso correcto");
        } else {
            System.out.printf("%s\n", "acceso incorrecto");
        }
    }
}
