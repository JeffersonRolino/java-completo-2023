package chapter_18.lesson_234.application;

import chapter_18.lesson_234.devices.ComboDevice;
import chapter_18.lesson_234.devices.ConcretePrinter;
import chapter_18.lesson_234.devices.ConcreteScanner;

public class Main {
    public static void main(String[] args) {
        ConcretePrinter printer = new ConcretePrinter("1080");
        printer.processDoc("My Letter");
        printer.print("My Letter");

        System.out.println("\n**********************************************************");

        ConcreteScanner scanner = new ConcreteScanner("2003");
        scanner.processDoc("My Email");
        System.out.println("Scan result: " + scanner.scan());

        System.out.println("\n**********************************************************");

        ComboDevice comboDevice = new ComboDevice("4232");
        comboDevice.processDoc("My dissertation");
        comboDevice.print("My dissertation");
        System.out.printf("Combo result: " + comboDevice.scan());
    }
}
