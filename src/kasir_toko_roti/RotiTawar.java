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
public class RotiTawar extends Produk{
    public RotiTawar(String kode, String nama, double harga) {
        super(kode, nama, harga);
    }
 
    // Beli 3 atau lebih diskon
    @Override
    public double hitungSubtotal(int jumlah) {
        double subtotal = getHarga() * jumlah;
        if (jumlah >= 3) {
            subtotal = subtotal * 0.9;
        }
        return subtotal;
    }
 
    @Override
    public String getJenis() {
        return "Roti Tawar";
    }
}
