/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasuts1;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Random;

public class TugasUTS1 {

    public static void main(String[] args) {
        Random acak = new Random();
        
        int urutanBulan = acak.nextInt(12)+1;
        
        String namaBulan = "";
        switch (urutanBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                System.out.println("Nomor bulan tidak valid!");
        }

        
        System.out.println("Bulan ke-: " + urutanBulan);
        System.out.println("Nama Bulan: " + namaBulan);
    }
}
