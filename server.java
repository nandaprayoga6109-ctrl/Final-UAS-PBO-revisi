public class server implements Runnable {
    
    @Override
    public void run() {

        System.out.println("Menghubungkan ke server pembayaran...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
