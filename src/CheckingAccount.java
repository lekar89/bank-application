
public class CheckingAccount extends Account {
    double overdraft;

    public CheckingAccount(double balance,double overdraft ) {
        super(balance);
        this.overdraft=overdraft;
    }

    @Override
    public void takeMoney(double money) {
       if (balance-money>0-overdraft)balance-=money;
        //else System.out.println("Not enough money in your account");
    }

    @Override
    public String toString() {
        return "CheckingAccount"+" balance:"+balance+" overdraft:"+overdraft+"; ";
    }
}
