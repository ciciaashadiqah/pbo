/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum080425;
import java.util.Scanner;

/**
 *
 * @author asiah
 */
public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        char ulang = 0;

        // Nasabah yang sudah ada dari awal
        bank.tambahNasabah("Rahmat", "Budi", new Tabungan(0));
        bank.tambahNasabah("Siti", "Rini", new Tabungan(1000));

        do {
            System.out.println("=====Program Nasabah Bank=====");
            System.out.println("1. Menambah Nasabah");
            System.out.println("2. Menampilkan Nasabah dan jumlahnya");
            System.out.println("3. Deposito");
            System.out.println("4. Ambil Uang");
            System.out.println("5. Transfer");
            System.out.println("6. Mencari Nasabah(nama awal)");
            System.out.println("7. Mencari Indeks Nasabah");
            System.out.println("8. Exit");
            System.out.print("Program yang ingin dipilih: ");
            int program = scanner.nextInt();
            scanner.nextLine();

            switch (program) {
                case 1 -> {
                    // Menambah nasabah dengan input user
                    System.out.print("\nMasukkan nama awal nasabah: ");
                    String namaAwal = scanner.nextLine();
                    System.out.print("Masukkan nama akhir nasabah: ");
                    String namaAkhir = scanner.nextLine();
                    System.out.print("Masukkan saldo awal tabungan: ");
                    int saldoAwal = scanner.nextInt();
                    bank.tambahNasabah(namaAwal, namaAkhir, new Tabungan(saldoAwal));
                }
                case 2 -> {
                    // Menampilkan jumlah nasabah dan daftar nasabah
                    System.out.println("\nDaftar Nasabah:");
                    for (int i = 0; i < bank.getJumlahNasabah(); i++) {
                        System.out.println("Nama: " + bank.getNasabah(i).toString());
                        System.out.println("Nomor Indeks: " + i);
                    }
                    System.out.println("Jumlah Nasabah: " + bank.getJumlahNasabah());
                }
                case 3 -> {
                    // Deposit uang
                    System.out.print("\nMasukkan indeks nasabah untuk menyimpan uang: ");
                    int indeksNasabah = scanner.nextInt();
                    if (indeksNasabah < bank.getJumlahNasabah() && indeksNasabah >= 0) {
                        System.out.println(bank.getNasabah(indeksNasabah).toString());
                        System.out.println("Nomor Indeks: " + indeksNasabah);
                        System.out.print("Masukkan jumlah uang yang akan disimpan: ");
                        int jumlahSimpan = scanner.nextInt();
                        Tabungan tabunganNasabah = bank.getNasabah(indeksNasabah).getTabungan();
                        if (tabunganNasabah != null) {
                            tabunganNasabah.simpanUang(jumlahSimpan);
                            System.out.println(bank.getNasabah(indeksNasabah).toString());
                        } else {
                            System.out.println("Nasabah tidak memiliki tabungan.");
                        }
                    } else {
                        System.out.println("Nasabah tidak ditemukan");
                    }
                }
                case 4 -> {
                    // Ambil uang
                    System.out.print("\nMasukkan indeks nasabah untuk mengambil uang: ");
                    int indeksNasabah = scanner.nextInt();
                    if (indeksNasabah < bank.getJumlahNasabah() && indeksNasabah >= 0) {
                        System.out.println(bank.getNasabah(indeksNasabah).toString());
                        System.out.println("Nomor Indeks: " + indeksNasabah);
                        System.out.print("Masukkan jumlah uang yang akan diambil: ");
                        int jumlahAmbil = scanner.nextInt();
                        Tabungan tabunganNasabah = bank.getNasabah(indeksNasabah).getTabungan();
                        if (tabunganNasabah != null) {
                            tabunganNasabah.ambilUang(jumlahAmbil);
                            System.out.println(bank.getNasabah(indeksNasabah).toString());
                        } else {
                            System.out.println("Nasabah tidak memiliki tabungan.");
                        }
                    } else {
                        System.out.println("Nasabah tidak ditemukan");
                    }
                }
                case 5 -> {
                    // Transfer uang
                    System.out.print("\nMasukkan indeks nasabah pengirim: ");
                    int indeksPengirim = scanner.nextInt();
                    System.out.println(bank.getNasabah(indeksPengirim).toString());
                    System.out.println("Nomor Indeks: " + indeksPengirim);
                    System.out.print("Masukkan indeks nasabah penerima: ");
                    int indeksPenerima = scanner.nextInt();
                    System.out.println(bank.getNasabah(indeksPenerima).toString());
                    System.out.println("Nomor Indeks: " + indeksPenerima);

                    if (indeksPengirim < bank.getJumlahNasabah() && indeksPengirim >= 0 &&
                        indeksPenerima < bank.getJumlahNasabah() && indeksPenerima >= 0) {

                        Tabungan tabunganPengirim = bank.getNasabah(indeksPengirim).getTabungan();
                        Tabungan tabunganPenerima = bank.getNasabah(indeksPenerima).getTabungan();

                        if (tabunganPengirim != null) {
                            System.out.print("Masukkan jumlah uang yang akan ditransfer: ");
                            int jumlahTransfer = scanner.nextInt();

                            if (tabunganPengirim.transfer(tabunganPenerima, jumlahTransfer)) {
                                System.out.println("Transfer berhasil!");
                                System.out.println(bank.getNasabah(indeksPengirim).toString());
                                System.out.println("Nomor Indeks: " + indeksPengirim);
                                System.out.println(bank.getNasabah(indeksPenerima).toString());
                                System.out.println("Nomor Indeks: " + indeksPenerima);
                            } else {
                                System.out.println("Transfer gagal! Saldo tidak cukup.");
                            }
                        } else {
                            System.out.println("Salah satu nasabah tidak memiliki tabungan.");
                        }
                    } else {
                        System.out.println("Salah satu nasabah tidak ditemukan.");
                    }
                }
                case 6 -> {
                    // Mencari Nasabah dengan nama awal
                    System.out.print("\nMasukkan nama awal nasabah yang dicari: ");
                    String namaAwal = scanner.nextLine();
                    int[] hasil = bank.searchNasabah(namaAwal);
                    if (hasil.length > 0) {
                        System.out.println("Nasabah yang ditemukan:");
                        for (int indeks : hasil) {
                            System.out.println(bank.getNasabah(indeks).toString());
                            System.out.println("Nomor Indeks: " + indeks);
                        }
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                }
                case 7 -> {
                    // Mencari indeks nasabah
                    System.out.print("\nMasukkan nama nasabah yang dicari: ");
                    String namaAwal = scanner.nextLine();
                    String namaAkhir = scanner.nextLine();
                    int hasil = bank.searchNasabah(namaAwal, namaAkhir);
                    if(hasil >= 0) {
                        System.out.println("Indeks nasabah: " + hasil);
                    }else {
                        System.out.println("Nasabah tidak ditemukan");
                    }
                }
                case 8 -> {
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                }
            }
            
            if (program > 0 && program < 8) {
                System.out.print("\nApakah ingin mengulang program? (y/n) ");
                ulang = scanner.next().charAt(0);
                System.out.println("\n\n");
            } else {
                ulang = 'n';
                System.out.println("Terima kasih telah menggunakan layanan kami");
            }
        } while (ulang == 'y' || ulang == 'Y');
    }
}