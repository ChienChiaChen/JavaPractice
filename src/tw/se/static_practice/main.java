package tw.se.static_practice;

public class main {
    static {
        System.out.println("Go First");
    }
    {
        System.out.println("Go ??");
    }
    public static void main(String[] args) {
        System.out.println("Go Second");
        _CD cd1 = new _CD();
        cd1.area=5;
        _CD cd2 = new _CD();
        cd2.area = 6;

        System.out.println(_CD.getDoublePI());
        System.out.println(cd1.getArea());


    }
}
