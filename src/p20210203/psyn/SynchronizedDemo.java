package p20210203.psyn;

public class SynchronizedDemo implements Runnable {
    public static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SynchronizedDemo());
            thread.start();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("result: " + SynchronizedDemo.count);
    }

    //public static synchronized void addCount()
    public static void addCount() {
        for (int i = 0; i < 1000000; i++)
            SynchronizedDemo.count++;
    }

    @Override
    public void run() {
        SynchronizedDemo.addCount();
    }
}
