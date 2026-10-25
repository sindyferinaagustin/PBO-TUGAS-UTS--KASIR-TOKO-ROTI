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
public class ItemTransaksi {
    private Produk produk;
    private int jumlah;
 
    public ItemTransaksi(Produk produk, int jumlah) {
        this.produk = produk;
        setJumlah(jumlah);
    }
 
    public Produk getProduk() {
        return produk;
    }
 
    public int getJumlah() {
        return jumlah;
    }
 
    public void setJumlah(int jumlah) {
        if (jumlah < 1) {
            throw new IllegalArgumentException("Jumlah minimal 1");
        }
        this.jumlah = jumlah;
    }

    public double getSubtotal() {
        return produk.hitungSubtotal(jumlah);
    }
}
