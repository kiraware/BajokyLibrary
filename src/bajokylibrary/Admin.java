/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bajokylibrary;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author User
 */
public class Admin {
    private int id;
    private String nama;
    private String alamat;
    private String nomor_telepon;
    private String email;
    private ArrayList<AnggotaPerpustakaan> daftarAnggotaPerpustakaan = new ArrayList<AnggotaPerpustakaan>();
    private ArrayList<Buku> daftarBuku = new ArrayList<Buku>();
    private ArrayList<TransaksiPeminjaman> daftarTransaksiPeminjaman = new ArrayList<TransaksiPeminjaman>();
    private ArrayList<TransaksiPengembalian> daftarTransaksiPengembalian = new ArrayList<TransaksiPengembalian>();
    private ArrayList<Notifikasi> daftarNotifikasi = new ArrayList<Notifikasi>();

    public Admin(int id, String nama, String alamat, String nomor_telepon, String email) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_telepon = nomor_telepon;
        this.email = email;
    }

    public void addAnggota(AnggotaPerpustakaan anggotaPerpustakaan) {
        daftarAnggotaPerpustakaan.add(anggotaPerpustakaan);
    }

    public void removeAnggota(AnggotaPerpustakaan anggotaPerpustakaan) {
        daftarAnggotaPerpustakaan.remove(daftarAnggotaPerpustakaan.indexOf(anggotaPerpustakaan));
    }
    
    public AnggotaPerpustakaan cariAnggota(int nomorAnggota) {
        for (AnggotaPerpustakaan anggotaPerpustakaan : daftarAnggotaPerpustakaan) {
            if (anggotaPerpustakaan.getNomorAnggota() == nomorAnggota) {
                return anggotaPerpustakaan;
            }
        }
        
        return null;
    }

    public void addBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void removeBuku(Buku buku) {
        daftarBuku.remove(daftarBuku.indexOf(buku));
    }

    public void pinjamBuku(AnggotaPerpustakaan anggotaPerpustakaan, Buku buku) {
        Random rand = new Random();
        Date today = new Date();
        Date expire = new Date(today.getTime() + (7 * 24 * 60 * 60 * 1000));

        int id = rand.nextInt();
        daftarTransaksiPeminjaman.add(new TransaksiPeminjaman(id, anggotaPerpustakaan, buku, today, expire));
    }

    public TransaksiPeminjaman cariTransaksiPeminjaman(AnggotaPerpustakaan anggotaPerpustakaan, Buku buku) {
        for (TransaksiPeminjaman transaksiPeminjaman : daftarTransaksiPeminjaman) {
            if (transaksiPeminjaman.getAnggota_perpustakaan() == anggotaPerpustakaan
                    && transaksiPeminjaman.getBuku() == buku) {
                return transaksiPeminjaman;
            }
        }

        return null;
    }

    public void balikinBuku(AnggotaPerpustakaan anggotaPerpustakaan, Buku buku) {
        TransaksiPeminjaman transaksiPeminjaman = cariTransaksiPeminjaman(anggotaPerpustakaan, buku);

        if (transaksiPeminjaman != null) {
            Random rand = new Random();
            Date today = new Date();

            int denda = 0;
            if (today.getTime() > transaksiPeminjaman.getTanggal_jatuh_tempo().getTime()) {
                denda = 10;
            }

            int id = rand.nextInt();
            daftarTransaksiPengembalian.add(new TransaksiPengembalian(id, transaksiPeminjaman, today, denda));
        }
    }

    public Buku cariBuku(int ISBN) {
        for (Buku buku : daftarBuku) {
            if (buku.getISBN() == ISBN) {
                return buku;
            }
        }

        return null;
    }

    public void notifPengguna(AnggotaPerpustakaan anggotaPerpustakaan, String jenis, String pesan) {
        Date today = new Date();
        Random rand = new Random();
        int id = rand.nextInt();
        daftarNotifikasi.add(new Notifikasi(id, jenis, today, pesan, anggotaPerpustakaan));
    }

    public ArrayList<AnggotaPerpustakaan> getDaftarAnggotaPerpustakaan() {
        return daftarAnggotaPerpustakaan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}