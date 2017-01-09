/**
 * Created by Влад on 09.01.2017.
 */
public class AccountServiceImpl implements  AccountService  {
    @Override
    public void deposit(Account account, double amount) {
        account.addMoney(amount);
    }

    @Override
    public void withdraw(Account account, double amount) {
        account.takeMoney(amount);
    }

    @Override
    public void transfer(Account fromAccount, Account toAccount, double amount) {
fromAccount.takeMoney(amount);
toAccount.addMoney(amount);
    }
}
