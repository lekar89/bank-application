
public abstract class AbstractAccount {
    double balance;

    public AbstractAccount(double balance) {
        if (balance >= 0) this.balance = balance;


    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double money) {
        if (money >= 0) balance += money;
        //else System.out.println("Only positive numbers");
    }

    public abstract void takeMoney(double money);
}
