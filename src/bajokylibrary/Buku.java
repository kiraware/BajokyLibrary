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

public class Buku {
    private int ISBN;
    private String judul;
    private String pengarang;
    private String kategori;
    private Date tanggal_terbit;
    private int stok;
    private boolean status;

    public Buku(int ISBN, String judul, String pengarang, String kategori, Date tanggal_terbit, int stok,
            boolean status) {
        this.ISBN = ISBN;
        this.judul = judul;
        this.pengarang = pengarang;
        this.kategori = kategori;
        this.tanggal_terbit = tanggal_terbit;
        this.stok = stok;
        this.status = status;
    }

    public boolean equals(Buku other) {
        return ISBN == other.ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Date getTanggal_terbit() {
        return tanggal_terbit;
    }

    public void setTanggal_terbit(Date tanggal_terbit) {
        this.tanggal_terbit = tanggal_terbit;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
