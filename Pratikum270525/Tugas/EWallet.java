/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum270525.Tugas;

/**
 *
 * @author Asiah
 */
// Class Transfer
public class EWallet extends MetodePembayaran {
    private String namaAplikasi;

    public EWallet(String namaAplikasi) {
        super("E-Wallet");
        this.namaAplikasi = namaAplikasi;
    }

    @Override
    public void proses() {
        System.out.println("Metode: " + jenis);
        System.out.println("Pembayaran via E-Wallet: " + namaAplikasi);
    }
}