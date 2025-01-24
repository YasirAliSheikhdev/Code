
package javaapplication1;

import javaapplication1.OddEvenThreads.NumberPrinter;
import javaapplication1.OddEvenThreads.NumberRange;


public class JavaApplication1 {

    public static void main(String[] args) {
        try {
            NumberRange range = new NumberRange(1, 20);  

          
            Thread oddThread = new NumberPrinter(range, true);
            Thread evenThread = new NumberPrinter(range, false);

           
            oddThread.start();
            evenThread.start();

           
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
    }
}
