package bajokylibrary;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;

/**
 *
 * @author Joe
 */
public class BajokyLibrary {
    public static void main(String[] args) {
        Admin adm = new Admin(1, "Rian", "Palapa", "081278061977", "rasyid123@gmail.com");

        AnggotaPerpustakaan agt1 = new AnggotaPerpustakaan(1, "Budi", "Kemiling", "0852526272", "helo@email.co",
                new Date(), new Date(), "Aktif");
        AnggotaPerpustakaan agt2 = new AnggotaPerpustakaan(2, "Andi", "Tulang Bawang", "08525323272", "hi@andi.co",
                new Date(), new Date(), "Aktif");
        adm.addAnggota(agt1);
        adm.addAnggota(agt2);
        adm.addAnggota(new AnggotaPerpustakaan(3, "Caroline", "Russia", "92182912", "hi@caroline.me",
                new Date(), new Date(), "Aktif"));

        Buku buku1 = new Buku(876543219, "Cek Toko Sebelah", "Ernest Prakasa", "Seni", DateFormat.getInstance().parse("2016-02-25"), 50, true);
        adm.addBuku(buku1);
        adm.addBuku(new Buku(765432199, "The Maze Runner", "West Ball", "Filsafat", DateFormat.getInstance().parse("2012-09-11"), 40, true));
        adm.addBuku(new Buku(322121249, "Turn On", "Vemmy Sagita", "Seni", DateFormat.getInstance().parse("2019-06-12"), 30, true));

        agt1.pinjamBuku(adm, buku1);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=========================================================================");
            System.out.println("Pilih Akses Sebagai");
            System.out.println("1. Admin\n2. Anggota\n0. Keluar");
            System.out.print("Masukian Input : ");
            int pilihanAwal = scanner.nextInt();
            scanner.nextLine();

            if (pilihanAwal == 0) {
                System.out.println("Terimakasih Sudah Mengunjungi BAJOKY");
                break;
            } else if (pilihanAwal == 1) {
                while (true) {
                    System.out.println("=========================================================================\n");
                    System.out.println("Pilih operasi:");
                    System.out.println("1. Tambah Anggota");
                    System.out.println("2. Hapus Anggota");
                    System.out.println("3. Tambah Buku");
                    System.out.println("4. Hapus Buku");
                    System.out.println("0. Kembali");
                    System.out.print("Masukian Input : ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("=========================================================================\n");

                    switch (choice) {
                        case 1:
                            System.out.print("Masukkan nomor Anggota : ");
                            int nomor = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Masukkan Nama Anggota : ");
                            String nama = scanner.nextLine();
                            System.out.print("Masukkan Alamat Anggota : ");
                            String alamat = scanner.nextLine();
                            System.out.print("Masukkan Nomor Telepon Anggota : ");
                            String nomor_telepon = scanner.nextLine();
                            System.out.print("Masukkan Email Anggota : ");
                            String email = scanner.nextLine();
                            System.out.print("Masukkan Tanggal Lahir Anggota (YYYY-MM-DD) : ");
                            String tanggal_lahir = scanner.nextLine();
                            System.out.print("Masukkan Tanggal Gabung Anggota (YYYY-MM-DD) : ");
                            String tanggal_gabung = scanner.nextLine();
                            System.out.print("Masukkan Status Anggota : ");
                            String status = scanner.nextLine();
                            adm.addAnggota(new AnggotaPerpustakaan(nomor, nama, alamat, nomor_telepon, email, DateFormat.getInstance().parse(tanggal_lahir), DateFormat.getInstance().parse(tanggal_gabung), status));
                            System.out.println("\nBerhasil Menambahkan Anggota BAJOKY..");
                            break;
                        case 2:
                            System.out.print("Masukkan Nomor Anggota Yang Akan Dihapus : ");
                            int nomorAnggota = scanner.nextInt();
                            scanner.nextLine();
                            AnggotaPerpustakaan anggotaPerpustakaan = adm.cariAnggota(nomorAnggota);
                            adm.removeAnggota(anggotaPerpustakaan);
                            System.out.println("\nBerhasil Menghapus Anggota BAJOKY..");
                            break;
                        case 3:
                            System.out.print("Masukkan ISBN Buku : ");
                            int ISBN = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Masukkan Judul Buku : ");
                            String judul = scanner.nextLine();
                            System.out.print("Masukkan Penulis Buku : ");
                            String pengarang = scanner.nextLine();
                            System.out.print("Masukkan Kategori Buku : ");
                            String kategori = scanner.nextLine();
                            System.out.print("Masukkan Tanggal Terbit Buku : ");
                            String tanggal_terbit = scanner.nextLine();
                            System.out.print("Masukkan Stok Buku : ");
                            int stok = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Masukkan Status Ketersediaan Buku : ");
                            boolean status2 = scanner.nextBoolean();
                            adm.addBuku(new Buku(ISBN, judul, pengarang, kategori, DateFormat.getInstance().parse(tanggal_terbit),stok, status2));
                            System.out.println("\nBerhasil Menambahkan Buku BAJOKY..");
                            break;
                        case 4:
                            System.out.print("Masukkan ISBN Buku Yang Akan Dihapus : ");
                            int ISBN2 = scanner.nextInt();
                            scanner.nextLine();
                            Buku buku = adm.cariBuku(ISBN2);
                            adm.removeBuku(buku);
                            System.out.println("Berhasil Menghapus " + buku.getJudul() + "\n");
                            break;
                        case 0:
                            System.out.println("");
                        default:
                            System.out.println("Operasi tidak valid. Silakan pilih kembali.");
                    }
                    if (choice == 0) {
                        break;
                    }

                }
            } else if (pilihanAwal == 2) {
                while (true) {
                    System.out.println("\n=========================================================================");
                    System.out.println("Pilih Pengguna.");
                    int index = 1;
                    for (AnggotaPerpustakaan value : adm.getDaftarAnggotaPerpustakaan()) {
                        System.out.println(index + ". " + value.getNama());
                        index++;
                    }
                    System.out.println("0. Keluar");
                    System.out.print("Masukan Input : ");
                    int pilihan = scanner.nextInt();
                    scanner.nextLine();

                    if (pilihan == 0) {
                        System.out.println("Terimakasih Sudah Mengunjungi BAJOKY");
                        break;

                    } else if (pilihan <= adm.getDaftarAnggotaPerpustakaan().size() && pilihan > 0) {
                        while (true) {
                            AnggotaPerpustakaan hasil = adm.getDaftarAnggotaPerpustakaan().get(pilihan - 1);

                            System.out.println(
                                    "=========================================================================\n");
                            System.out.println("Pilih operasi:");
                            System.out.println("1. Pinjam Buku");
                            System.out.println("2. Kembalikan Buku");
                            System.out.println("3. Cari Buku");
                            System.out.println("0. Keluar");
                            System.out.print("Masukian Input : ");
                            int choice = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println(
                                    "=========================================================================\n");

                            switch (choice) {
                                case 1:
                                    System.out.print("Masukkan ISBN buku yang ingin dipinjam: ");
                                    int ISBN3 = scanner.nextInt();
                                    scanner.nextLine();
                                    Buku buku = adm.cariBuku(ISBN3);
                                    hasil.pinjamBuku(adm, buku);
                                    System.out.println("Berhasil Meminjam Buku " + buku.getJudul());
                                    break;
                                case 2:
                                    System.out.print("Masukkan ISBN buku yang ingin dikembalikan: ");
                                    int ISBN4 = scanner.nextInt();
                                    scanner.nextLine();
                                    Buku buku2 = adm.cariBuku(ISBN4);
                                    System.out.print("Masukkan durasi peminjaman: ");
                                    hasil.balikinBuku(adm, buku2);
                                    System.out.println("Berhasil Mengembalikan Buku " + buku2.getJudul());
                                    break;
                                case 3:
                                    System.out.print("Masukan ISBN Yang Ingin Dicari : ");
                                    int ISBN5 = scanner.nextInt();
                                    scanner.nextLine();
                                    Buku buku3 = hasil.cariBuku(adm, ISBN5);
                                    if (buku3 != null) {
                                        System.out.println("Buku ditemukan dengan judul " + buku3.getJudul());
                                    } else {
                                        System.out.println("Maaf buku tidak ditemukan");
                                    }
                                    break;
                                case 0:
                                    System.out.println("Kembali ke Menu Utama");
                                default:
                                    System.out.println("Operasi tidak valid. Silakan pilih kembali.");
                            }
                            if (choice == 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
