package tw.se.static_practice;

public class _CD {
    static {
        System.out.println("_CD static black");
    }
    {
        System.out.println("_CD object black");
    }

    public static double PI = Math.PI;
    public int area = 0;

    public _CD() {
        System.out.println("_CD object constructor");
    }

    public int getArea() {
        return area;
    }

    public static void setPI(double PI) {
        _CD.PI = PI;
    }

    public static double getPI() {
        return PI;
    }

    public static double getDoublePI(){
        return getPI() * 2;
    }

}
