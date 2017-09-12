package tw.se.static_practice;


//https://stackoverflow.com/questions/10259644/do-we-have-to-make-new-on-static-class
public class NestedClassTip {
    private String name = "instance name";
    private static String staticName = "static name";

    public static void main(String args[]) {
        NestedClassTip nt = new NestedClassTip();

        NestedClassTip.NestedOne nco = nt.new NestedOne();
//
//        NestedClassTip.NestedTwo nct = new NestedClassTip.NestedTwo();
    }

    class NestedOne {
        NestedOne() {
            System.out.println(name);
            System.out.println(staticName);
        }
    }

    static class NestedTwo {
        NestedTwo() {
            System.out.println(staticName);
        }
    }
}
