/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class PROBLEMA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double descuento;
        double total;
        int edad ;

        System.out.println("Ingrese el precio mensual de Netflix ");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual de Youtube Premium ");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual de Dropbox ");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual de Spotify ");
        spotify = entrada.nextDouble();
        System.out.println("Ingrese su edad ");
        edad = entrada.nextInt();

        total = netflix + youtube + dropbox + spotify;

        if (edad < 30) {
            descuento = total * 0.20;
            total = total - descuento;
            System.out.printf("Su valor mensual total a pagar es:%.2f\n", total);
        } else {
            System.out.printf("Su valor mensual total a pagar es:%.2f\n", total);
        }
    }

}
