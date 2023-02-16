/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ap550
 */
import java.util.Scanner;

public class EJ4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] empleados = {"Empleado 1", "Empleado 2", "Empleado 3"};
        double[] horas = new double[3];
        double[] tarifas = new double[3];

        // Pedir información de los empleados
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese las horas trabajadas por " + empleados[i] + " la semana pasada: ");
            horas[i] = input.nextDouble();
            System.out.println("Ingrese la tarifa por horas de " + empleados[i] + ": ");
            tarifas[i] = input.nextDouble();
        }

        // Calcular el sueldo bruto de cada empleado
        for (int i = 0; i < empleados.length; i++) {
            double sueldo;
            if (horas[i] <= 40) {
                sueldo = horas[i] * tarifas[i];
            } else {
                sueldo = 40 * tarifas[i] + (horas[i] - 40) * tarifas[i] * 1.5;
            }
            System.out.println(empleados[i] + " tiene un sueldo de: $" + sueldo);
        }

        input.close();
    }
}

