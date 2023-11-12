/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costoKilovat;
        double numKilovat;
        int edad;
        double descuento;
        double total;

        System.out.println("Ingrese el valor de costo por kilovatio/hora");
        costoKilovat = entrada.nextDouble();
        System.out.println("Ingrese el número de kilovatios consumidos en el mes");
        numKilovat = entrada.nextDouble();
        System.out.println("Ingrese la edad del usuario");
        edad = entrada.nextInt();
        total = (numKilovat * costoKilovat);

        if (edad > 65) {
            descuento = total * 0.10;
            total = total - descuento;
            System.out.printf("Su valor a cancelar es: %.2f\n", total);

        } else {
            System.out.printf("Su valor a cancelar es: %.2f\n", total);
        }

    }

}
