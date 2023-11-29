package bajokylibrary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class BajokyLibrary {

    public static void main(String[] args) {
        
        ArrayList<AnggotaPerpustakaan> daftarAnggota = new ArrayList<>();
        Admin adm = new Admin(1, "Rian");
        TransaksiPeminjaman T1 = new TransaksiPeminjaman();

        AnggotaPerpustakaan agt1 = new AnggotaPerpustakaan(adm, 234567, "Joe", "Pesawaran", "085270592534", "joeriansinuraya@gmail.com", "2004-02-25", "2023-01-21", "Aktif");
        AnggotaPerpustakaan agt2 = new AnggotaPerpustakaan(adm, 576123, "Erling Haaland" ,"Canberra", "081377247264", "briansky13@gmail.com", "2005-02-21", "2023-10-12", "Aktif" );
        daftarAnggota.add(agt1);
        daftarAnggota.add(agt2);
        
        adm.addAnggota(123456, "Febri", "Pringsewu", "082263236909", "magiclif33@gmail.com", "2009-25-02", "2023-09-21", "Aktif");
        adm.addBuku("Cek Toko Sebelah", "Ernest Prakasa", 876543219, true);
        adm.addBuku(" The Maze Runner", "West Ball", 765432199,true);
        adm.addBuku("Turn On", "Vemmy Sagita", 322121249, true);
        //agt1.pinjamBuku("Turn On");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("=========================================================================");
            int index = 1;
            System.out.println("Pilih Akses Sebagai");
            System.out.println("1. Admin\n2. Anggota\n0. Keluar");
            System.out.print("Masukian Input : ");
            int pilihanAwal = scanner.nextInt();
            scanner.nextLine();
            
            if(pilihanAwal == 0){
                System.out.println("Terimakasih Sudah Mengunjungi BAJOKY");
                break;
            }
            else if(pilihanAwal == 1){
                while(true){
                    System.out.println("=========================================================================\n");
                    System.out.println("Pilih operasi:");
                    System.out.println("1. Tambah Anggota");
                    System.out.println("2. Hapus Anggota");
                    System.out.println("3. Tambah Buku");
                    System.out.println("4. Hapus Buku");
                    System.out.println("5. Tampilkan Anggota");
                    System.out.println("6. Rekap Denda");
                    System.out.println("7. Aktivitas");
                    System.out.println("0. Kembali");
                    System.out.print("Masukian Input : ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("=========================================================================\n");
                    
                    switch (choice) {
                            case 1:
                                System.out.print("Masukkan Nama Anggota : ");
                                String nama = scanner.nextLine();
                                System.out.print("Masukkan nomor Anggota : ");
                                int nomor = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Masukkan Alamat Anggota : ");
                                String alamat = scanner.nextLine();
                                System.out.print("Masukkan Riwayat Peminjaman Anggota : ");
                                String riwayat = scanner.nextLine();
                                System.out.print("Masukkan Riwayat denda Anggota : ");
                                int denda = scanner.nextInt();
                                adm.addAnggota(nama, nomor, alamat, riwayat, denda);
                                System.out.println("\nBerhasil Menambahkan Anggota BAJOKY..");
                                break;
                            case 2:
                                System.out.print("Masukkan Nomor Anggota Yang Akan Dihapus : ");
                                String namaAnggota = scanner.nextLine();
                                adm.removeAnggota(namaAnggota);
                                break;
                            case 3:
                                System.out.print("Masukkan Judul Buku : ");
                                String judul = scanner.nextLine();
                                System.out.print("Masukkan Penulis Buku : ");
                                String pengarang = scanner.nextLine();
                                System.out.print("Masukkan No ISBN Buku : ");
                                int ISBN = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Masukkan Status Ketersediaan Buku : ");
                                boolean status = scanner.nextBoolean();
                                adm.addBuku(judul, pengarang, ISBN, status);
                                System.out.println("\nBerhasil Menambahkan Buku BAJOKY..");
                                break;
                            case 4:
                                System.out.print("Masukkan Judul Buku Yang Akan Dihapus : ");
                                String judulBuku = scanner.nextLine();
                                adm.removeBuku(judulBuku);
                                System.out.println("Berhasil Menghapus " + judulBuku + "\n");
                                break;
                            case 5:
                                adm.tampilkanAnggota();
                                scanner.nextLine();
                                break;
                            case 6:
                                adm.rekapDenda();
                                scanner.nextLine();
                                break;
                            case 7:
                                adm.aktivitas();
                                scanner.nextLine();
                                break;
                            case 0:
                                System.out.println("");
                            default:
                                System.out.println("Operasi tidak valid. Silakan pilih kembali.");
                    }
                    if(choice == 0){
                        break;
                    }
                    
                }                
            }
                else if(pilihanAwal == 2){
                    while (true){
                        System.out.println("\n=========================================================================");
                        System.out.println("Pilih Pengguna.");
                        for(AnggotaPerpustakaan value : daftarAnggota){
                            System.out.println(index + ". "+value.getNama());
                            index++;
                        }
                        System.out.println("0. Keluar");
                        System.out.print("Masukan Input : ");
                        int pilihan = scanner.nextInt();
                        scanner.nextLine();

                        if(pilihan == 0){
                            System.out.println("Terimakasih Sudah Mengunjungi BAJOKY");
                            break;

                        }else if(pilihan <= daftarAnggota.size() && pilihan > 0){
                            while(true){
                                AnggotaPerpustakaan hasil = daftarAnggota.get(pilihan - 1);

                                System.out.println("=========================================================================\n");
                                System.out.println("Pilih operasi:");
                                System.out.println("1. Pinjam Buku");
                                System.out.println("2. Kembalikan Buku");
                                System.out.println("3. Tampilkan Transaksi");
                                System.out.println("4. Tampilkan Buku");
                                System.out.println("5. Cari Buku");
                                System.out.println("0. Keluar");
                                System.out.print("Masukian Input : ");
                                int choice = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("=========================================================================\n");

                                switch (choice) {
                                    case 1:
                                        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                                        String judulPinjam = scanner.nextLine();
                                        if(hasil.getTotalPinjaman() < 3){
                                                hasil.pinjamBuku(judulPinjam);
                                                System.out.println("Berhasil Meminjam Buku " + judulPinjam);
                                                scanner.nextLine();
                                            }else if(hasil.getTotalPinjaman() == 3){
                                                System.out.println("Maaf Batas Peminjaman Buku Anda Sudah Penuh\n");
                                            }
                                        break;
                                    case 2:
                                        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                                        String judulKembali = scanner.nextLine();
                                        System.out.print("Masukkan durasi peminjaman: ");
                                        int durasiPengembalian = scanner.nextInt();
                                        hasil.mengembalikanBuku(judulKembali, durasiPengembalian);
                                        scanner.nextLine();
                                        break;
                                    case 3:
                                        hasil.tampilkanTransaksi();
                                        break;
                                    case 4:
                                        hasil.melihatBuku();

                                        while(true){
                                          System.out.print("Ingin Meminjam Buku? y/n : ");
                                            String jawab = scanner.nextLine();
                                            if(jawab.contains("y") && hasil.getTotalPinjaman() < 3){
                                                System.out.print("Masukan Judul Buku Yang Ingin Dipinjam : ");
                                                String judulInginPinjam = scanner.nextLine();
                                                hasil.pinjamBuku(judulInginPinjam);
                                                scanner.nextLine();
                                                System.out.println("Berhasil Meminjam Buku " + judulInginPinjam);
                                            }else if(jawab.contains("y") && hasil.getTotalPinjaman() >= 3){
                                                System.out.println("Maaf Batas Peminjaman Buku Anda Sudah Penuh\n");
                                            }else if(jawab.contains("n")){
                                                break;
                                            }
                                        }
                                        break;

                                    case 5 :
                                        System.out.print("Masukan Judul Yang Ingin Dicari : ");
                                        String cari = scanner.nextLine();
                                        hasil.cariBuku(cari);
                                        scanner.nextLine();
                                        break;
                                    case 0:
                                        System.out.println("Kembali ke Menu Utama");
                                    default:
                                        System.out.println("Operasi tidak valid. Silakan pilih kembali.");
                                } 
                                if(choice == 0 ){
                                        break;
                                    }
                            }  
                        }
                    }
            }   
        }
    }
}

