package tw.reflection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by chiachen on 2017/1/29.
 */
public class BankImpl implements Bank {
    private List<Account> accounts;

    @Override
    public Collection<Account> getAccounts() {
        return this.accounts;
    }

    @Override
    public void setAccounts(Collection<Account> accounts) {
        this.accounts = new ArrayList<>();
        for (Account account : accounts) {
            this.accounts.add(account);
        }
    }
}
