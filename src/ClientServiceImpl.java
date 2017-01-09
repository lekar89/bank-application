import java.util.List;

/**
 * Created by Влад on 09.01.2017.
 */
public class ClientServiceImpl implements ClientService {

    @Override
    public Client findClientByName(Bank bank, String name) {
        for (Client client : bank.getClients()) {
            if (client.getName().equals(name)) return client;

        }
        return null;
    }

    @Override
    public List<Client> findAllClients(Bank bank) {

        return bank.getClients();
    }

    @Override
    public Client saveClient(Bank bank, Client client) {
        return bank.addClient(client);
    }

    @Override
    public void deleteClient(Bank bank, Client client) {
        bank.deleteClient(client);
    }
}
