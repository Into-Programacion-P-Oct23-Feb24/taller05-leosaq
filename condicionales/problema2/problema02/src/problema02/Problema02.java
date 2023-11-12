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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String descripcion ;
        int unidades ;
        double precioUnidad ;
        double descuento ;
        double total ;
        
        System.out.println("Ingrese la descripción del artículo");
        descripcion = entrada.nextLine();
        System.out.println("Ingrese la cantidad de artículos");
        unidades = entrada.nextInt();
        System.out.println("Ingrese el precio unitario");
        precioUnidad = entrada.nextDouble();
        total = (unidades * precioUnidad);
        
        if (unidades >50) {
            descuento = total * 0.15 ;
            total= total - descuento ;
            System.out.printf("El valor total a pagar de:\n\n"
                    + "Descripcion:%s\nCantidad:%s\nPrecio de Unidad:%s\n"
                    + "Total:%.2f\n",descripcion, unidades, precioUnidad, total);
        } else {
            System.out.printf("El valor total a pagar de:\n\n"
                    + "Descripcion:%s\nCantidad:%s\nPrecio de Unidad:%s\n"
                    + "Total:%.2f\n",descripcion, unidades, precioUnidad, total);
        }
       
        
    }
    
}
