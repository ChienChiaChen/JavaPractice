package tw.designpattern.structural.proxy3;

//http://twmht.github.io/blog/posts/design-pattern/proxy.html

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "tw.designpattern.structural.proxy3.Printer");
        System.out.println("現在的名稱是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("現在的名稱是" + p.getPrinterName() + "。");
        p.print("Hello, world.");
    }
}
