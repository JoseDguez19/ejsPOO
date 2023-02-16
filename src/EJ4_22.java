/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ap550
 */
public class EJ4_22 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("N\t10*N\t100*N\t1000*N");

        for (int i = 1; i <= n; i++) {
            int DiezN = 10 * i;
            int CienN = 100 * i;
            int MilN = 1000 * i;

            System.out.println(i + "\t" + DiezN + "\t" + CienN + "\t" + MilN);
        }
    }
}
