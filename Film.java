import java.util.Scanner;

public class Film {
    private String judul;
    private String kategori;
    private int tahun;
    private double rating;

    // Konstruktor
    public Film(String judul, String kategori, int tahun, double rating) {
        this.judul = judul;
        this.kategori = kategori;
        this.tahun = tahun;
        this.rating = rating;
    }

    // Getter untuk atribut Film
    public String getJudul() {
        return judul;
    }

    public String getKategori() {
        return kategori;
    }

    public int getTahun() {
        return tahun;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + " | Kategori: " + kategori + " | Tahun: " + tahun + " | Rating: " + rating;
    }
}
