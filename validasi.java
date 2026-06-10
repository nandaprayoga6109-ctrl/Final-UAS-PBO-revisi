public class validasi implements Runnable {

    @Override
    public void run() {

        System.out.println("memvalidasi data...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
} 
