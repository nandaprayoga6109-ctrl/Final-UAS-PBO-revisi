public class PaketTahunan extends PaketGym {

    public PaketTahunan() {
        super("Paket Tahunan", 12, 1200000);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Paket Tahunan");
        System.out.println("Harga  : Rp" + getHarga());
        System.out.println("Durasi : " + getDurasi() + " Bulan");
    }
}