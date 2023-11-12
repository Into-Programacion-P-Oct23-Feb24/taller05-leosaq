/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class PROBLEMA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double hijo1;
        double hijo2;
        double hijo3;
        double gastos;

        System.out.println("Ingrese los gastos del primer hijo:");
        hijo1 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del segundo hijo:");
        hijo2 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del tercer hijo:");
        hijo3 = entrada.nextDouble();

        gastos = hijo1 + hijo2 + hijo3;

        System.out.printf("El total en gastos de los hijos es:$%.2f\n ", gastos);

    }

}
