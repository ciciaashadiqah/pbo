/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author laptop
 */
    public class Mobil extends Kendaraan {
    // Atribut tambahan khusus Mobil
    private String bahanBakar;
    private int kapasitasMesin;

    // Setter untuk bahanBakar
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    // Getter untuk bahanBakar
    public String getBahanBakar() {
        return this.bahanBakar;
    }

    // Setter untuk kapasitasMesin
    public void setkapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    // Getter untuk kapasitasMesin
    public int getkapasitasMesin() {
        return this.kapasitasMesin;
    }

    public void setJmlRoda(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setWarna(String merah) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getJmlRoda() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getWarna() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
