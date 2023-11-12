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
public class PROBLEMA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costoMinuto;
        double minutoConsumido;
        double total;

        System.out.println("Ingrese el costo por minutos ");
        costoMinuto = entrada.nextDouble();
        System.out.println("Ingrese el número de minutos consumidos en el mes ");
        minutoConsumido = entrada.nextDouble();
        
        total= minutoConsumido * costoMinuto ;
        
        System.out.printf("El valor de la planilla de teléfono es:%.2f\n", total);

    }

}
