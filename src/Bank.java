import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {
    private ArrayList<Client> clients;
    private List<ClientRegistrationListener> listeners;

    public   Client addClient(Client newClient) {
        if (clients == null) clients = new ArrayList<>();
        {
            clients.add(newClient);
            clientAdded(newClient);
        }
        return newClient;
    }

    public void clientAdded(Client client) {
        if (listeners != null || !listeners.isEmpty()) {

            for (ClientRegistrationListener listener : listeners) {
                listener.onClientAdded(client);
            }
        }

    }


    public ArrayList<Client> getClients() {
        return clients;
        //return  Collections.unmodifiableCollection(clients);
    }

    public String getClientInf(String name) {

        for (Client client : clients) {
            if (client.getName().equals(name)) return client.toString();
        }
        return "no matches";
    }


    public void addListener(ClientRegistrationListener listener) {
        if (listeners == null) {
            listeners = new ArrayList<>();
        }
        listeners.add(listener);
    }

    public boolean deleteClient(Client deletedClient) {
        if (clients != null || !clients.isEmpty()) {
            for (Client client : clients) {
                if (client.equals(deletedClient)) {
                    clients.remove(client);
                    return true;
                }

            }
        }
        return false;
    }


}
