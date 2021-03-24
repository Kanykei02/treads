package com.company.printer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("1");
//        SomeThread someThread = new SomeThread();
//        someThread.start();
//
//        Thread secondThread = new Thread(new SecondThread());
//        secondThread.start();
//
//        while (true){
//            System.out.println("2");
//        }
        PrinterRequest printerRequest = new PrinterRequest("123", 4);
        PrinterRequest printerRequest1 = new PrinterRequest("abc", 4);
        PrinterRequest printerRequest2 = new PrinterRequest("ююююююю", 4);

        Thread t1 = new Thread(printerRequest);
        Thread t2 = new Thread(printerRequest1);
        Thread t3 = new Thread(printerRequest2);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}
