import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Created by Влад on 09.01.2017.
 */
public class BankReportServiceImpl implements BankReportService {
    @Override
    public int getNumberOfClients(Bank bank) {

        return bank.getClients().size();
    }

    @Override
    public int getNumberOfAccounts(Bank bank) {
        int res = 0;
        for (Client client : bank.getClients()) {
            res += client.getDeposits().size();
        }
        return res;

    }

    @Override
    public double getTotalAccountSum(Bank bank) {
        double res = 0;
        for (Client client : bank.getClients()) {
            res += client.getTotalBalance();
        }
        return res;
    }

    @Override
    public double getBankCreditSum(Bank bank) {
        double res = 0;
        for (Client client : bank.getClients()) {

            for (Account account : client.getDeposits()) {

                if (account instanceof CheckingAccount) res += ((CheckingAccount) account).overdraft;

            }

        }
        return res;
    }

    @Override
    public List<Client> getClientsSortedByName(Bank bank) {
       // List<Client> clientList = (List<Client>) bank.getClients().clone();

        List<Client> clientList = bank.getClients();

        clientList.sort(new Comparator<Client>() {
                            @Override
                            public int compare(Client o1, Client o2) {
                                return o1.getName().compareTo(o2.getName());
                            }
                        }
        );
        return clientList;
    }
}
