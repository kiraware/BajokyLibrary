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

public class TransaksiPeminjaman {
    private int id;
    private AnggotaPerpustakaan anggota_perpustakaan;
    private Buku buku;
    private Date tanggal_peminjaman;
    private Date tanggal_jatuh_tempo;

    public TransaksiPeminjaman(int id, AnggotaPerpustakaan anggota_perpustakaan, Buku buku, Date tanggal_peminjaman,
            Date tanggal_jatuh_tempo) {
        this.id = id;
        this.anggota_perpustakaan = anggota_perpustakaan;
        this.buku = buku;
        this.tanggal_peminjaman = tanggal_peminjaman;
        this.tanggal_jatuh_tempo = tanggal_jatuh_tempo;
    }

    public boolean equals(TransaksiPeminjaman other) {
        return id == other.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AnggotaPerpustakaan getAnggota_perpustakaan() {
        return anggota_perpustakaan;
    }

    public void setAnggota_perpustakaan(AnggotaPerpustakaan anggota_perpustakaan) {
        this.anggota_perpustakaan = anggota_perpustakaan;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Date getTanggal_peminjaman() {
        return tanggal_peminjaman;
    }

    public void setTanggal_peminjaman(Date tanggal_peminjaman) {
        this.tanggal_peminjaman = tanggal_peminjaman;
    }

    public Date getTanggal_jatuh_tempo() {
        return tanggal_jatuh_tempo;
    }

    public void setTanggal_jatuh_tempo(Date tanggal_jatuh_tempo) {
        this.tanggal_jatuh_tempo = tanggal_jatuh_tempo;
    }
}
