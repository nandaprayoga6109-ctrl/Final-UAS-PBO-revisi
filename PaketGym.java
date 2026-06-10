public abstract class PaketGym implements Info {

    private String namaPaket;
    private int durasi;
    private double harga;

    public PaketGym(String namaPaket, int durasi, double harga) {
        this.namaPaket = namaPaket;
        this.durasi = durasi;
        this.harga = harga;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public int getDurasi() {
        return durasi;
    }

    public double getHarga() {
        return harga;
    }
}