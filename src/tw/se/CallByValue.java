package tw.se;

//https://openhome.cc/Gossip/Java/PassByValue.html

public class CallByValue {
    public static void main(String[] args) {
        Customer c1 = new Customer("Justin");
        some(c1);
        System.out.println(c1.name);//justin

        Customer c2 = new Customer("Justin");
        other(c2);
        System.out.println(c2.name);//bill

        CallByValue.doService();
    }

    static void some(Customer c) {//c= new Customer("Justin")
        c.name = "John";
    }

    static void other(Customer c) { //c=
        c = new Customer("Bill");
    }

    public static void doService() {
        Customer customer = create("Irene");
        System.out.println(customer.name);
    }

    public static Customer create (String name) {
        Customer c = new Customer(name);
        return c;
    }
}

class Customer {
    String name;
    Customer(String name) {
        this.name = name;
    }
}
