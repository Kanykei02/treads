package com.company.printer;

public class Printer {
    public static synchronized void printDocument(String text, int copies){
        for (int i = 0; i < copies; i++){
            System.out.println(text);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
