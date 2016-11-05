package tw.designpattern.behavior.strategy;

/**
 * Created by chiachen on 2016/10/29.
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
