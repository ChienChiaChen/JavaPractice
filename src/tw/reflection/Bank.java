package tw.reflection;

import java.util.Collection;

/**
 * Created by chiachen on 2017/1/29.
 */
public interface Bank {
    Collection<Account> getAccounts();
    void setAccounts(Collection<Account> accounts);

}
