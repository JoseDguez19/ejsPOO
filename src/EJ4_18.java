/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ap550
 */
import java.util.Scanner;

public class EJ4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el saldo al inicio del mes: ");
        int saldoInicial = scanner.nextInt();

        System.out.print("Ingrese el total de los cargos del mes: ");
        int cargos = scanner.nextInt();

        System.out.print("Ingrese el total de los creditos del mes: ");
        int creditos = scanner.nextInt();

        System.out.print("Ingrese el limite de credito permitido: ");
        int limiteCredito = scanner.nextInt();

        int nuevoSaldo = saldoInicial + cargos - creditos;
        System.out.printf("Nuevo saldo: %d%n", nuevoSaldo);

        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excedio el limite de su credito");
        }
    }
}
