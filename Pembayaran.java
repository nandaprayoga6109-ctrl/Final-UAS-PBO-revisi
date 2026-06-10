public class Pembayaran {

    private Pemesanan pemesanan;
    private boolean status;

    public static final String BANK = "BCA";
    public static final String NOMOR_REKENING = "12345678";

    public Pembayaran(Pemesanan pemesanan) {
        this.pemesanan = pemesanan;
        this.status = false;
    }

    public void bayar(String rekening, int nominal)
            throws InvalidPaymentException {

        double hargaPaket = pemesanan.getPaket().getHarga();

        if (!rekening.equals(NOMOR_REKENING)) {
            throw new InvalidPaymentException(
                    "Harap memasukkan nomor rekening yang benar!");
        }

        if (nominal < hargaPaket) {
            throw new InvalidPaymentException(
                    "Nominal pembayaran kurang.");
        }

        status = true;
    }

    public boolean isStatus() {
        return status;
    }

    public Pemesanan getPemesanan() {
        return pemesanan;
    }
}