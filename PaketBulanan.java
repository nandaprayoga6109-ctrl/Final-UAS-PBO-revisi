public class PaketBulanan extends PaketGym {

    public PaketBulanan() {
        super("Paket Bulanan", 1, 150000);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Paket Bulanan");
        System.out.println("Harga  : Rp" + getHarga());
        System.out.println("Durasi : " + getDurasi() + " Bulan");
    }
}