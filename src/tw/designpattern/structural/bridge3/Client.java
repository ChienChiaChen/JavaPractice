package tw.designpattern.structural.bridge3;

public class Client {
    public static void main(String[] args) {

        Computer asusLaptop = new Laptop(new Asus());
        asusLaptop.show();



        Computer lenovoDesktop = new Desktop(new Lenovo());
        lenovoDesktop.show();



    }
}
