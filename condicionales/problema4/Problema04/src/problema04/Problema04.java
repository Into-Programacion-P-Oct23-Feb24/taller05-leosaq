/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int dias;
        double precioDia;
        double subtotal;
        double descuento;
        double total;

        System.out.println("Ingrese el número de días que se va a hospedar");
        dias = entrada.nextInt();
        System.out.println("Ingrese el precio diario de la habitación");
        precioDia = entrada.nextDouble();

        subtotal = dias * precioDia;

        if (dias >= 5 && dias < 10) {
            descuento = subtotal * 0.10;
            total = subtotal - descuento;
            System.out.printf("Su recibo con valores a pagar:\n"
                    + "Subtotal:%s\nDescuento:%s\nTotal a pagar:%s\n"
                    , subtotal, descuento, total);
        }
        if (dias >= 10 && dias < 15) {
            descuento = subtotal * 0.15;
            total = subtotal - descuento;
            System.out.printf("Su recibo con valores a pagar:\n"
                    + "Subtotal:%s\nDescuento:%s\nTotal a pagar:%s\n"
                    , subtotal, descuento, total);
        }
        if (dias > 15) {
            descuento = subtotal * 0.20;
            total = subtotal - descuento;
            System.out.printf("Su recibo con valores a pagar:\n"
                    + "Subtotal:%s\nDescuento:%s\nTotal a pagar:%s\n"
                    , subtotal, descuento, total);
        }
        if (dias < 5) {
            descuento = 0;
            total = subtotal - descuento;
            System.out.printf("Su recibo con valores a pagar:\n"
                    + "Subtotal:%s\nDescuento:%s\nTotal a pagar:%s\n"
                    , subtotal, descuento, total) ;
        }
    }

}
