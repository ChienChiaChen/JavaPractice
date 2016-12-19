package tw.designpattern.creational.Builder;

import java.util.ArrayList;

/**
 * Created by chiachen on 2016/11/24.
 */
public class Meal  {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost=0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showTime(){
        System.out.println("==========");
        for (Item item : items) {
            System.out.println(item.name()+"\n");
            System.out.println(item.packing().pack()+"\n");
            System.out.println(item.price()+"\n");

        }
        System.out.println("==========");


    }
}
