package tw.se.anonymouspractice1;

public class ClientEvent {
    private Client client;

    public ClientEvent(Client client) {
        this.client = client;
    }

    public String getName(){
        return this.client.getName();
    }

    public String getIp(){
        return this.client.getIP();
    }
}
