/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author laptop
 */
public class Sepeda extends Kendaraan {
    // Atribut khusus untuk Sepeda
    private String jmlSadel;
    private int jmlGir;

    // Setter untuk jmlSadel
    public void setjmlSadel(String jmlSadel) {
        this.jmlSadel = jmlSadel;
    }

    // Getter untuk jmlSadel
    public String getjmlSadel() {
        return this.jmlSadel;
    }

    // Setter untuk jmlGir
    public void setjmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }

    // Getter untuk jmlGir
    public int getjmlGir() {
        return this.jmlGir;
    }

    public void setJmlRoda(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setWarna(String biru) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getJmlRoda() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getWarna() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}