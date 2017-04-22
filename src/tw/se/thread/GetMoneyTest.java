package tw.se.thread;

/**
 * Created by chiachen on 2017/2/12.
 */
public class GetMoneyTest {
    public static void main(String[] args) {
        Account account = new Account(5000);
        GetMoneyRun run = new GetMoneyRun(account);
        new Thread(run,"AAA").start();
        new Thread(run,"BBB").start();
    }

}
class Account {
    private int money;

    public Account(int money) {
        super();
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}

class GetMoneyRun implements Runnable {
    private Account account;

    public GetMoneyRun(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (account) {
            if (account.getMoney() > 3000) {
                System.out.println(Thread.currentThread().getName() + "  帳戶有..  " + account.getMoney()+"  元");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int lastMoney = account.getMoney() - 3000;
                account.setMoney(lastMoney);
                System.out.println( Thread.currentThread().getName()+"已取出 3000\n" + Thread.currentThread().getName() + " 剩 " + account.getMoney());
            }else {
                System.out.println("不夠3000");
            }
        }
    }
}
