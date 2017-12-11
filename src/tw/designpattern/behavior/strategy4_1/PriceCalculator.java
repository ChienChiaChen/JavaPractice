package tw.designpattern.behavior.strategy4_1;

public class PriceCalculator {
    private static final int BUS = 1;
    private static final int SUBWAY = 2;

    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("16km bus: " + calculator.calculatePrice(16, BUS));
        System.out.println("16km subway: " + calculator.calculatePrice(16, SUBWAY));
    }

    public int calculatePrice(int km, int type) {
        if (BUS == type) {
            return busPrice(km);
        } else if (SUBWAY == type) {
            return subwayPrice(km);
        }
        return 0;
    }

    private int subwayPrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        return 7;
    }

    private int busPrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

}
