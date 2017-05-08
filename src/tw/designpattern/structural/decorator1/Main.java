package tw.designpattern.structural.decorator1;

import java.util.ArrayList;

/**
 * Created by Jason_Chien on 2017/5/3.
 */
public class Main {
    public static void main(String[] args) {
        SideDish sideDish = new SideDishOne(new Humberger());
        SideDish sideDish1 = new SideDishTwo(new Chicken());

        ArrayList<SideDish> arrayList = new ArrayList<>();
        arrayList.add(sideDish);
        arrayList.add(sideDish1);
        arrayList.forEach(p->{
            System.out.println(p.getContent());
            System.out.println(p.getPrice());
        });


    }
}
interface Meal{
    int getPrice();
    String getContent();
}

class Humberger implements Meal{

    @Override
    public int getPrice() {
        return 150;
    }

    @Override
    public String getContent() {
        return "Cheese burger";
    }
}

class Chicken implements Meal{

    @Override
    public int getPrice() {
        return 120;
    }

    @Override
    public String getContent() {
        return "Fried chicken";
    }
}

abstract class SideDish implements Meal {
    protected Meal meal;
    public SideDish(Meal meal) {
        this.meal = meal;
    }
}

class SideDishOne extends SideDish {
    public SideDishOne(Meal meal) {
        super(meal);
    }

    @Override
    public int getPrice() {
        return this.meal.getPrice()+80;
    }

    @Override
    public String getContent() {
        return this.meal.getContent()+", Coke and Fries";
    }
}

class SideDishTwo extends SideDish {
    public SideDishTwo(Meal meal) {
        super(meal);
    }

    @Override
    public int getPrice() {
        return this.meal.getPrice()+50;
    }

    @Override
    public String getContent() {
        return this.meal.getContent()+"  and milkshake";
    }
}