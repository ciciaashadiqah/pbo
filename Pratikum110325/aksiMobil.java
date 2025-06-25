/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum110325;

/**
 *
 * @author Asiah
 */
public class aksiMobil {
     public static void main(String[] args){
        mobil mobilku=new mobil();
        mobilku.merk="Toyota";
        mobilku.plat="BA 1234 L";
        mobilku.tahun="2004";
        mobilku.warna="hitam";
        System.out.println("---------------");
        System.out.println("Data Mobil 1");
        System.out.println("Merk mobil = "+mobilku.merk);
        System.out.println("plat mobil ="+mobilku.plat);
        System.out.println("Tahun mobil ="+mobilku.tahun);
        System.out.println("Warna mobil ="+mobilku.warna);
        mobilku.MobilAktif();
        System.out.println(mobilku.SuaraMobil());
        
                
    }
}
