/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum220425;

/**
 *
 * @author asiah
 */
public class Kerucut {
 
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
     public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
     
     public double getTinggi() {
        return tinggi;
    }

     public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
     
    public double getJariJari() {
        return jariJari;
    }

    public double hitungGarisPelukis() {
        return Math.sqrt((jariJari * jariJari) + (tinggi * tinggi));
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }

    public double hitungLuasPermukaan() {
        double s = hitungGarisPelukis();
        return Math.PI * jariJari * (jariJari + s);
    }

    public double getLuas() {
        return hitungLuasPermukaan();
    }

    @Override
    public String toString() {
        return String.format("""
                             Kerucut:
                             Jari-jari: %.2f
                             Tinggi: %.2f
                             Garis Pelukis: %.2f
                             Volume: %.2f
                             Luas Permukaan: %.2f""",
                             jariJari, tinggi, hitungGarisPelukis(),
                             hitungVolume(), hitungLuasPermukaan());
    }

    
}



    

