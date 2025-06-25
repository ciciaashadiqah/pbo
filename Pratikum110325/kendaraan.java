/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum110325;

/**
 *
 * @author Asiah
 */
public class kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    public kendaraan(String j, String m, int t, String w){
             this.jenis=j;
             this.merk=m;
             this.tahun=t;
             this.warna=w;
    }
    public void InfoKendaraan(){
        System.out.println("Jenis Kendaraan ="+jenis);
        System.out.println("Jenis Kendaraan ="+merk);
        System.out.println("Jenis Kendaraan ="+warna);
        System.out.println("Jenis Kendaraan ="+tahun);
    }
    public void CekHarga(int harga){
        System.out.println("Harga sewa kendaraan Rp "+harga);
    }
       
    
}
