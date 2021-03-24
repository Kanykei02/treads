package com.company.printer;

public class PrinterRequest implements Runnable{

    private String text;
    private int copies;

    public PrinterRequest(){}

    public PrinterRequest(String text, int copies) {
        this.text = text;
        this.copies = copies;
    }

    @Override
    public void run() {
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
