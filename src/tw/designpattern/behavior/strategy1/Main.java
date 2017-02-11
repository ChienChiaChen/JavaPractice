package tw.designpattern.behavior.strategy1;

/**
 * Created by chiachen on 2016/10/29.
 */
public class Main {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println("1 + 1 ===>  "+context.executeStrategy(1,1));

        context = new Context(new OperationSubstract());
        System.out.println("2 - 1 ===>  " + context.executeStrategy(2, 1));


        context = new Context(new OperationMultiply());
        System.out.println("1 * 2 ===>  "+context.executeStrategy(1,2));


    }
}
