
public class SavingAccount extends AbstractAccount {

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void takeMoney(double money) {
       if (balance-money >= 0) balance-=money;
        //else System.out.println("Not enough money in your account");
    }

    @Override
    public String toString() {
        return "SavingAccount"+" balance:"+balance;
    }
}
