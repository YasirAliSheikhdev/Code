/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

public class OddEvenThreads {

    
    static class NumberRange {
        private final int start;
        private final int end;

        public NumberRange(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }

   
    static class NumberPrinter extends Thread {
        private final NumberRange range;
        private final boolean printOdd;

        public NumberPrinter(NumberRange range, boolean printOdd) {
            this.range = range;
            this.printOdd = printOdd;
        }

        @Override
        public void run() {
            try {
                for (int i = range.getStart(); i <= range.getEnd(); i++) {
                    if (printOdd && i % 2 != 0) {
                        System.out.println(i + " (Odd)");
                    } else if (!printOdd && i % 2 == 0) {
                        System.out.println(i + " (Even)");
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    
