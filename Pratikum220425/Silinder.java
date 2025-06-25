/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum220425;

/**
 *
 * @author asiah
 */
public class Silinder {
    private double jariJari;
    private double tinggi;

    public Silinder(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
    
    public double getLuas() {
        return hitungLuasPermukaan();
    }

    @Override
    public String toString() {
        return "Silinder{" +
                "jariJari=" + jariJari +
                ", tinggi=" + tinggi +
                ", volume=" + hitungVolume() +
                ", luasPermukaan=" + hitungLuasPermukaan() +
                '}';
    }

  
}



    
