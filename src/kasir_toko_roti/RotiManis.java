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
public class RotiManis extends Produk{
    public RotiManis(String kode, String nama, double harga) {
        super(kode, nama, harga);
    }
 
    @Override
    public double hitungSubtotal(int jumlah) {
        return getHarga() * jumlah;
    }
 
    @Override
    public String getJenis() {
        return "Roti Manis";
    }
}
