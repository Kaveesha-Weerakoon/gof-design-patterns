package Adapter;

public class AdpterPatternDemo {

    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        Printer printer = new PrinterAdapter(oldPrinter);

        printer.print("Hello using Adapter!");
    }
}
