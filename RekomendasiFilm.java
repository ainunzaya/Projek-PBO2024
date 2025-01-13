//(Enkapsulasi)
public class RekomendasiFilm {
    private Film[] daftarFilm;

    // Konstruktor
    public RekomendasiFilm(Film[] daftarFilm) {
        this.daftarFilm = daftarFilm;
    }

    // Method untuk memberikan rekomendasi film berdasarkan kategori (Polimorfisme)
    public void rekomendasikan(String kategori) {
        System.out.println("\n=================================================");
        System.out.println("       Rekomendasi Film Kategori: " + kategori);
        System.out.println("=================================================");
        boolean ditemukan = false;

        for (Film film : daftarFilm) {
            if (film.getKategori().equalsIgnoreCase(kategori)) {
                System.out.println(film);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, tidak ada film yang ditemukan dalam kategori ini.");
        }
    }

    // Method untuk menampilkan semua kategori film yang tersedia
    public void tampilkanSemuaKategori() {
        System.out.println("\nKategori yang tersedia:");
        System.out.println("1. Aksi");
        System.out.println("2. Komedi");
        System.out.println("3. Drama");
        System.out.println("================================================");

    }
}
