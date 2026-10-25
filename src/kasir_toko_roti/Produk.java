/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir_toko_roti;

/**
 *
 * @author ASUS
 */
public abstract class Produk {
    private String kode;
    private String nama;
    private double harga;
 
    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        setHarga(harga);
    }
 
    public String getKode() {
        return kode;
    }
 
    public String getNama() {
        return nama;
    }
 
    public double getHarga() {
        return harga;
    }
 
    public void setHarga(double harga) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.harga = harga;
    }
 
    // Method abstract
    public abstract double hitungSubtotal(int jumlah);
 
    public abstract String getJenis();
}
