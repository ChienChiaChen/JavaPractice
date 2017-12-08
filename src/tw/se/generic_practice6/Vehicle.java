package tw.se.generic_practice6;

import java.text.*;
import java.util.Locale;

public class Vehicle {
}


class Car extends Vehicle {
}
class Motorcycle extends Vehicle {
    public static void main(String[] args) {
        String input = NumberFormat.getNumberInstance(Locale.FRENCH).format(123456);
        System.out.println("String after conversion in locale "+input);

        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.FRENCH);
        DecimalFormatSymbols symbols = df.getDecimalFormatSymbols();
        char thousandSep = symbols.getGroupingSeparator();

        input = input.replace(thousandSep, '.');
        System.out.println("After replace space with dot\t"+input);
    }
}

class SuperVehicle<V extends Vehicle> {

    public static void main(String[] args) {
        String mString = "11222,22";
        DecimalFormat mDecimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.FRENCH);

        try {
            System.out.println(mDecimalFormat.parse(mString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}

class SubVehicle<V extends Vehicle> extends SuperVehicle<V> {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.FRENCH);
        String s = "1234567,89";
        try {
            System.out.println(nf.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Long bd = 11122L;
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();

        formatter.setDecimalFormatSymbols(symbols);
        System.out.println(formatter.format(bd.longValue()));
    }
}