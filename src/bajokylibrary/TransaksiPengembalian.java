/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bajokylibrary;

/**
 *
 * @author User
 */
import java.util.Date;

public class TransaksiPengembalian {
    private int id;
    private TransaksiPeminjaman transaksi_peminjaman;
    private Date tanggal_pengembalian;
    private int denda;

    public TransaksiPengembalian(int id, TransaksiPeminjaman transaksi_peminjaman, Date tanggal_pengembalian, int denda) {
        this.id = id;
        this.transaksi_peminjaman = transaksi_peminjaman;
        this.tanggal_pengembalian = tanggal_pengembalian;
        this.denda = denda;
    }
    
    public boolean equals(TransaksiPengembalian other) {
        return id == other.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TransaksiPeminjaman getTransaksi_peminjaman() {
        return transaksi_peminjaman;
    }

    public void setTransaksi_peminjaman(TransaksiPeminjaman transaksi_peminjaman) {
        this.transaksi_peminjaman = transaksi_peminjaman;
    }

    public Date getTanggal_pengembalian() {
        return tanggal_pengembalian;
    }

    public void setTanggal_pengembalian(Date tanggal_pengembalian) {
        this.tanggal_pengembalian = tanggal_pengembalian;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
}
