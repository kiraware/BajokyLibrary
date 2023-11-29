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

public class AnggotaPerpustakaan {
    private int nomorAnggota;
    private String nama;
    private String alamat;
    private String nomor_telepon;
    private String email;
    private Date tanggal_lahir;
    private Date tanggal_gabung;
    private String status;

    public AnggotaPerpustakaan(int nomorAnggota, String nama, String alamat, String nomor_telepon, String email, Date tanggal_lahir, Date tanggal_gabung, String status) {
        this.nomorAnggota = nomorAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.email = email;
        this.tanggal_lahir = tanggal_lahir;
        this.tanggal_gabung = tanggal_gabung;
        this.status = status;
    }

    public void pinjamBuku(Admin admin, Buku buku) {
        admin.pinjamBuku(this, buku);
    }

    public Buku cariBuku(Admin admin, int ISBN) {
        return admin.cariBuku(ISBN);
    }

    public boolean equals(AnggotaPerpustakaan other) {
        return nomorAnggota == other.nomorAnggota;
    }

    public int getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(int nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public Date getTanggal_gabung() {
        return tanggal_gabung;
    }

    public void setTanggal_gabung(Date tanggal_gabung) {
        this.tanggal_gabung = tanggal_gabung;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
