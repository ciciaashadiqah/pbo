/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum110325;
import java.util.Scanner;
/**
 *
 * @author Asiah
 */
public class KendaraanMain {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String jenis;
        String merk;
        String warna;
        int tahun;
        int harga;
        
        System.out.print("Masukkan jenis Kendaraan =");
        jenis=in.nextLine();
        System.out.print("Masukkan merk Kendaraan =");
        merk=in.nextLine();
        System.out.print("Tahun keluaran =");
        tahun=in.nextInt();
        in.nextLine();
        System.out.print("Warna kendaraan =");
        warna=in.nextLine();
        System.out.print("harga sewa Kendaraan =");
        harga=in.nextInt();
        
        kendaraan kend = new kendaraan(jenis, merk, tahun, warna);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        
    }
}
