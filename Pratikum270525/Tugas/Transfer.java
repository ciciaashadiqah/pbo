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
public class Transfer extends MetodePembayaran {
    private String namaBank;

    public Transfer(String namaBank) {
        super("Transfer Bank");
        this.namaBank = namaBank;
    }

    @Override
    public void proses() {
        System.out.println("Metode: " + jenis);
        System.out.println("Transfer ke Bank: " + namaBank);
    }
}