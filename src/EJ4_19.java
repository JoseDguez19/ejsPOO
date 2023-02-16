/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ap550
 */
import java.util.Scanner;

public class EJ4_19 {

    public static void main(String[] args) {
        
        // Definir variables
        double valorTotalDeVentas = 0.0;
        double ingresosDelVendedor = 0.0;
        
        // Leer la cantidad de artículos vendidos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de articulos vendidos: ");
        int cantidadDeArticulos = scanner.nextInt();
        
        // Leer el valor de cada artículo y sumarlos
        for (int i = 1; i <= cantidadDeArticulos; i++) {
            System.out.print("Ingrese el valor del articulo " + i + ": ");
            double valorDelArticulo = scanner.nextDouble();
            valorTotalDeVentas += valorDelArticulo;
        }
        
        // Calcular los ingresos del vendedor
        ingresosDelVendedor = 200.0 + 0.09 * valorTotalDeVentas;
        
        // Mostrar los ingresos del vendedor
        System.out.println("Los ingresos del vendedor son: $" + ingresosDelVendedor);
    }

}
