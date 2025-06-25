/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum220425;
import java.util.Scanner;
/**
 *
 * @author asiah
 */
public class classMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double rLingkaran = input.nextDouble();
        Lingkaran lingkaran = new Lingkaran(rLingkaran);

        System.out.println(lingkaran);
        System.out.println("Diameter: " + lingkaran.getDiameter());
        System.out.println("Keliling: " + lingkaran.getKeliling());
        System.out.println("Luas: " + lingkaran.getLuas());

        System.out.println("\n---");

        // Input untuk Kerucut
        System.out.print("Masukkan jari-jari kerucut: ");
        double rKerucut = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tKerucut = input.nextDouble();
        Kerucut kerucut = new Kerucut(rKerucut, tKerucut);

        System.out.println(kerucut);
        System.out.println("Volume: " + kerucut.hitungVolume());
        System.out.println("Luas Permukaan: " + kerucut.getLuas());

        System.out.println("\n---");

        // Input untuk Silinder
        System.out.print("Masukkan jari-jari silinder: ");
        double rSilinder = input.nextDouble();
        System.out.print("Masukkan tinggi silinder: ");
        double tSilinder = input.nextDouble();
        Silinder silinder = new Silinder(rSilinder, tSilinder);

        System.out.println(silinder);
        System.out.println("Volume: " + silinder.hitungVolume());
        System.out.println("Luas Permukaan: " + silinder.getLuas());

        input.close();
    }
}
        
    
    

