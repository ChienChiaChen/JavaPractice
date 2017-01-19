package tw.designpattern.Behavior.command2;

/**
 * Created by chiachen on 2017/1/19.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}