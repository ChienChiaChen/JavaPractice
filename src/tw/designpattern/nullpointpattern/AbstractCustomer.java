package tw.designpattern.nullpointpattern;

/**
 * Created by chiachen on 2017/1/7.
 */
public abstract class AbstractCustomer {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}