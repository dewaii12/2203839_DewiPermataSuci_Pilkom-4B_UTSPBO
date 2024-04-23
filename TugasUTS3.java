/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasuts3;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;
        
public class TugasUTS3 {
    public static int sumDigits(long n) {
        int jumlah = 0;
        
        while(n != 0){
            int digit = (int)(n % 10);
            jumlah += digit;
            n /= 10;
        }
        return jumlah;
    }
    
    public static void main(String[] args) {
      Scanner digit = new Scanner (System.in);
      
        System.out.println("Masukkan Bilangan :");
        long bilangan = digit.nextLong();
        
        int jumlah = sumDigits(bilangan);
        System.out.println("Jumlah digit dalam bilangan :" + jumlah);
    }
}
