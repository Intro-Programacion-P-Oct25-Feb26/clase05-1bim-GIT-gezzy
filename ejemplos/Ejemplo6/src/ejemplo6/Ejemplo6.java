/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String apellido;
        String usuario;
        String parroquia;
        int edad;
        int dia_pago;
        double membresia = 25.0;
        double descuento = 25.0 * 0.05;
        double total;

        System.out.println("Ingrese sus nombres:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos:");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su parroquia:");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese el dia de pago:");
        dia_pago = entrada.nextInt();

        if ((dia_pago < 10) && (parroquia.equals("El Valle")
                || parroquia.equals("El Sagrario"))) {
            total = membresia - descuento;
            System.out.printf("\t\tFactura\n"
                    + "-------------------------------------------\n"
                    + "Nombres: %s \n"
                    + "Apellidos: %s \n"
                    + "Usuario: %s \n"
                    + "Edad: %d \n"
                    + "Parroquia: %s \n"
                    + "Dia de pago: %s \n"
                    + "Valor del descuento (aplica): $ %.2f\n"
                    + "-------------------------------------------\n"
                    + "Total a cancelar: $ %.2f", nombre, apellido, usuario,
                    edad, parroquia, dia_pago, descuento, total);
        } else {
            total = membresia;
            System.out.printf("\t\tFactura\n"
                    + "-------------------------------------------\n"
                    + "Nombres: %s \n"
                    + "Apellidos: %s \n"
                    + "Usuario: %s \n"
                    + "Edad: %d \n"
                    + "Parroquia: %s \n"
                    + "Dia de pago: %s \n"
                    + "-------------------------------------------\n"
                    + "Total a cancelar (no aplica descuento): $ %.2f",
                    nombre, apellido, usuario, edad, parroquia,
                    dia_pago, total);
        }

    }

}
