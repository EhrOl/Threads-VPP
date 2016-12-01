package threadingExample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumbersTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) 
            System.out.println(i);
        try {
            int randomDelay = (int) (Math.random() * 500+1);
            Thread.sleep(randomDelay);
        } catch (InterruptedException ex) {
            Logger.getLogger(NumbersTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Task " + Thread.currentThread().getName()  + " has finished");
    }
}
