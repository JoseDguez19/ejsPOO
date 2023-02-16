/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ap550
 */
import java.util.Scanner;

public class EJ4_21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int mayor = 0;
        
        while (contador <= 10) {
            System.out.print("Introduzca un numero entero: ");
            int numero = entrada.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            contador++;
        }
        
        System.out.println("El numero mas grande es " + mayor);
    }

}
