package tw.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

/**
 * Created by chiachen on 2017/1/29.
 */
public class BankProxyHandler implements InvocationHandler {
    private Bank bank;

    public BankProxyHandler(Bank bank) {
        this.bank = bank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodname = method.getName();

        if ("getAccount".equalsIgnoreCase(methodname)) {
//            bank.setAccounts();
        } else {

        }
        return null;
    }

    protected Collection<Account> getAccountsFromFatabase(){
        return null;
    }
    protected void setAccountToDataBase(Collection<Account> accounts){

    }

}
