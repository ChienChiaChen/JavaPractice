package tw.se.anonymouspractice1;

import java.util.ArrayList;

public class ClientQueue {


    private ArrayList<Client> mClients = new ArrayList<>();
    private ClientListener mClientListener;

    public void addClientListener(ClientListener clientListener) {
        mClientListener = clientListener;
    }

    public void add(Client client){
        mClients.add(client);
        mClientListener.clientAdded(new ClientEvent(client));
    }

    public void remove(Client client){
        mClients.remove(client);
        mClientListener.clientRemoved(new ClientEvent(client));
    }

}
