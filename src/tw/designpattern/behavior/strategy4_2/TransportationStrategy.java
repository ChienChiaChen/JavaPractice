package tw.designpattern.behavior.strategy4_2;

public class TransportationStrategy {
    private CalculateStrategy mCalculateStrategy = km -> 0;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        mCalculateStrategy = calculateStrategy;
    }

    public int calculate(int km) {
        return mCalculateStrategy.calculatePrice(km);
    }
}
