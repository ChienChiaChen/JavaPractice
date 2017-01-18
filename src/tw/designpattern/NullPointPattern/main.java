package tw.designpattern.NullPointPattern;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chiachen on 2017/1/6.
 */
public class main {
    public static void main(String[] args) {
//        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
//        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
//        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
//        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
//
//        System.out.println("Customers");
//        System.out.println(customer1.getName());
//        System.out.println(customer2.getName());
//        System.out.println(customer3.getName());
//        System.out.println(customer4.getName());
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello world !");
//            }
//        }).start();
//        new Thread(() -> System.out.println("Hello world !")).start();
//

        String[] atp = {
                "Rafael Nadal",
                "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer",
                "Roger Federer",
                "Andy Murray",
                "Tomas Berdych",
                "Juan Martin Del Potro"
        };
        List<String> players =  Arrays.asList(atp);
//        for (String player : players) {
//            System.out.print(player + "; ");
//        }
        players.forEach((player) -> System.out.println("rrrr"));
//        Runnable runnable = () -> System.out.println("");
//        new Button().setOnClickListener(()-> System.out.println(""));
//        new Button().setOnClickListener(new ClickListener() {
//            @Override
//            public void onclick() {
//
//            }
//        });
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));


    }
}
interface ClickListener{
     void onclick();
}
 class Button{
     public void setOnClickListener(ClickListener v){
     };
}