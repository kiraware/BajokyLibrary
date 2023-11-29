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

public class Notifikasi {
    private int id;
    private String jenis;
    private Date tanggal;
    private String pesan;
    private AnggotaPerpustakaan anggota_perpustakaan;

    public Notifikasi(int id, String jenis, Date tanggal, String pesan, AnggotaPerpustakaan anggota_perpustakaan) {
        this.id = id;
        this.jenis = jenis;
        this.tanggal = tanggal;
        this.pesan = pesan;
        this.anggota_perpustakaan = anggota_perpustakaan;
    }

    public boolean equals(Notifikasi other) {
        return id == other.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public AnggotaPerpustakaan getAnggota_perpustakaan() {
        return anggota_perpustakaan;
    }

    public void setAnggota_perpustakaan(AnggotaPerpustakaan anggota_perpustakaan) {
        this.anggota_perpustakaan = anggota_perpustakaan;
    }
}
