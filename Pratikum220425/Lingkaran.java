/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum220425;

/**
 *
 * @author asiah
 */
public class Lingkaran {
    private double jari_jari;

    public Lingkaran(double jariJari) {
        this.jari_jari = jariJari;
    }
    
     public void setJariJari(double jariJari) {
        this.jari_jari = jariJari;
    }

    public double getJariJari() {
        return jari_jari;
    }  

  public double getDiameter() {
        return 2 * jari_jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari_jari;
    }

    public double hitungLuas() {
        return Math.PI * jari_jari * jari_jari;
    }
     @Override
    public String toString() {
        return String.format("""
               Lingkaran:
               Jari-jari: %.2f
               Diameter: %.2f
               Luas: %.2f
               Keliling: %.2f
               """, jari_jari, getDiameter(), hitungLuas(), getKeliling());
    }

    String getLuas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}

    
    

