/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String marca;
        String origen ;
        double costo;
        double impuesto;
        double total;
        String Alemania;
        String Japón;
        String Italia;
        String USA;

        System.out.println("Ingrese la marca del automóvil");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automóvil");
        costo = entrada.nextDouble();

        switch (origen) {
            case "Alemania":
                impuesto = costo * 0.20;
                total = costo + impuesto;
                System.out.printf("El impuesto por pagar es:%.2f\n"
                        + "El precio de venta es:%.2f\n", impuesto, total);
                break;
            case "Japón":
                impuesto = costo * 0.30;
                total = costo + impuesto;
                System.out.printf("El impuesto por pagar es:%.2f\n"
                        + "El precio de venta es:%.2f\n", impuesto, total);
                break;
            case "Italia":
                impuesto = costo * 0.15;
                total = costo + impuesto;
                System.out.printf("El impuesto por pagar es:%.2f\n"
                        + "El precio de venta en total es:%.2f\n", impuesto, total);
                break;
            case "USA":
                impuesto = costo * 0.08;
                total = costo + impuesto;
                System.out.printf("El impuesto por pagar es:%.2f\n"
                        + "El precio de venta en total es:%.2f\n", impuesto, total);
                break;
            default:
                System.out.println("No hay datos para: "+origen) ;
        }

    }

}
