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
public class PROBLEMA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double total;

        System.out.println("Ingrese el costo de la CPU ");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el costo del teclado ");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el costo de la pantalla ");
        pantalla = entrada.nextDouble();
        System.out.println("Ingrese el costo del ratón ");
        raton = entrada.nextDouble();

        total = cpu + teclado + pantalla + raton;

        System.out.printf("Costos de la computadora de escritorio:\n"
                + "CPU:%s\nTeclado:%s\nPantalla%s\nRatón%s\nTotal a pagar:%s\n", 
                cpu, teclado, pantalla, raton, total );
    }

}
