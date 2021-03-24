package com.company.printer;

public class PrinterRequest implements Runnable{

    private String text;
    private int copies;
    private Thread waitFor;


    public PrinterRequest(String text, int copies, Thread waitFor) {
        this.text = text;
        this.copies = copies;
        this.waitFor = waitFor;
    }

    @Override
    public void run() {
        if(waitFor != null) {
            try {
                waitFor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Printer.printDocument(text, copies);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
