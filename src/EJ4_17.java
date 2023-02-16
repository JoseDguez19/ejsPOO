/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ap550
 */
import java.util.Scanner;

public class EJ4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kmConducidos = 0;
        int litrosUsados = 0;
        float kmPorLitro = 0.0f;
        float kmPorLitroTotal = 0.0f;
        int numReabastecimientos = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese los kilometros conducidos (-1 para salir): ");
            kmConducidos = input.nextInt();

            if (kmConducidos == -1) {
                continuar = false;
                continue;
            }

            System.out.print("Ingrese los litros usados: ");
            litrosUsados = input.nextInt();

            kmPorLitro = (float) kmConducidos / litrosUsados;
            System.out.printf("Kilometros por litro en este reabastecimiento: %.2f%n", kmPorLitro);

            kmPorLitroTotal = (kmPorLitroTotal * numReabastecimientos + kmPorLitro) / (numReabastecimientos + 1);
            numReabastecimientos++;
            System.out.printf("Kilometros por litro total hasta este punto: %.2f%n", kmPorLitroTotal);
        }
    }
}
