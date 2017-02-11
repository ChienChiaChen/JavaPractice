package tw.designpattern.nullpointpattern;

/**
 * Created by chiachen on 2017/1/7.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
