public abstract class KategoriFilm {
    public abstract String getKategori();

    public void tampilkanKategori() {
        System.out.println("Kategori film ini adalah: " + getKategori());
    }
}

class Aksi extends KategoriFilm {
    @Override
    public String getKategori() {
        return "Aksi";
    }
}

class Komedi extends KategoriFilm {
    @Override
    public String getKategori() {
        return "Komedi";
    }
}

class Drama extends KategoriFilm {
    @Override
    public String getKategori() {
        return "Drama";
    }
}
