import java.util.ArrayList;
import java.util.Collections;

public class Bank {
    private ArrayList<Client> clients;

     void addClient(Client newClient ) {
        if (clients == null) clients = new ArrayList<>();
        clients.add(newClient);
    }

    public ArrayList<Client> getClients() {
        return clients;
       //return  Collections.unmodifiableCollection(clients);
    }

     String getClientInf(String name) {

        for (Client client : clients) {
            if (client.getName().equals(name)) return client.toString();
        }
        return "no matches";
    }

}
