public class notifikasi implements Runnable {

    @Override
    public void run () {

        System.out.println("Mengirim notifikasi hasil pembayaran...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
