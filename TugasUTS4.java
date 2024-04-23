/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasuts4;

/**
 *
 * @author dewipermatasuci
 */

class LimasSegiEmpat{
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;
    
    public LimasSegiEmpat(){
        this.luasAlas = 0.0;
        this.luasSelubungLimas = 0.0;
        this.tinggi = 0.0;
    }
    
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru){
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }
    
    public double getLuas(){
        return luasAlas + luasSelubungLimas;
    }
    
    public double getVolume(){
        return (1.0/3.0) * luasAlas * tinggi;
    }
    
    public void setLuasAlas(double luasAlasBaru){
        this.luasAlas = luasAlasBaru;
    }
    
    public void setLuasSelubungLimas(double luasSelubungLimasBaru){
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }
    
    public void setTinggi(double tinggiBaru){
        this.tinggi = tinggiBaru;
    }
}


public class TugasUTS4 {

    public static void main(String[] args) {
      LimasSegiEmpat LimasSegiEmpat1 = new LimasSegiEmpat(1.0,1.0,1.0);
              System.out.println("Luas : " +LimasSegiEmpat1.getLuas()+" Volume : "+LimasSegiEmpat1.getVolume());
      LimasSegiEmpat LimasSegiEmpat2 = new LimasSegiEmpat(30.0,40.0,50.0);
              System.out.println("Luas :" +LimasSegiEmpat2.getLuas()+" Volume : "+LimasSegiEmpat2.getVolume());
       LimasSegiEmpat LimasSegiEmpat3 = new LimasSegiEmpat(25.0,35.0,45.0);
              System.out.println("Luas :" +LimasSegiEmpat3.getLuas()+" Volume : "+LimasSegiEmpat3.getVolume());
    }
}
