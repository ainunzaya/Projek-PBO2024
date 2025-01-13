import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Film[] daftarFilm = {
                new Film("Mad Max: Fury Road", "Aksi", 20215, 8.1),
                new Film("The Hangover", "Komedi", 2009, 7.7),
                new Film("Bila Esok Ibu Tiada", "Drama", 2024, 9.5),
                new Film("Knight and Day", "Aksi", 2010, 8.2),
                new Film("Little Women", "Drama", 2019, 6.5),
                new Film("Srimulat: Hidup Memang Komedi", "Komedi", 2023, 8.9),
        };

        //objek rekomendasi film
        RekomendasiFilm rekomendasiFilm = new RekomendasiFilm(daftarFilm);

        //objek kategori menggunakan pewarisan
        KategoriFilm aksi = new Aksi();
        KategoriFilm komedi = new Komedi();
        KategoriFilm drama = new Drama();

        //tampilan utama sistem
        System.out.println("================================================");
        System.out.println("       Selamat Datang Di Rekoemdasi Film");
        System.out.println("================================================");

        //menampilkan semua kategori
        rekomendasiFilm.tampilkanSemuaKategori();

        //menampilkan informasi kategori menggunakan polimorfisme
        System.out.println("\nInformasi kategori:");
        aksi.tampilkanKategori();
        komedi.tampilkanKategori();
        drama.tampilkanKategori();

        //meminta input kategori dari pengguna
        System.out.println("\nMasukkan kategori yang ingin direkomendasikan: ");
        String inputKategori = scanner.nextLine();
        rekomendasiFilm.rekomendasikan(inputKategori);

        //pesan akhir
        System.out.println("\nTerima kasih telah menggunakan sistem rekomendasi film! Selamat menikmati!");

    }
}