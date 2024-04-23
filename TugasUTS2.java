/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasuts2;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;
        
public class TugasUTS2 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        
        int totalPositif = 0;
        int totalNegatif = 0;
        int jumlahInput = 0;
        int totalInput = 0;
        
        System.out.print("Masukkan bilangan (0 untuk berhenti): ");
        int bilangan = angka.nextInt();

        while (bilangan != 0) {
            if (bilangan > 0) {
                totalPositif++;
            } else if (bilangan < 0) {
                totalNegatif++;
            }

            totalInput += bilangan;
            jumlahInput++;
            bilangan = angka.nextInt();
        }

        double rataRata = (jumlahInput > 0) ? ((double) totalInput / jumlahInput) : 0;

        System.out.println("Jumlah bilangan positif: " + totalPositif);
        System.out.println("Jumlah bilangan negatif: " + totalNegatif);
        System.out.println("Total nilai input (tidak termasuk nol): " + totalInput);
        System.out.printf("Rata-rata nilai input (tidak termasuk nol): %.2f", rataRata);

    }
}
