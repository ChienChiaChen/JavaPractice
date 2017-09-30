package tw.se.anonymouspractice1;

public interface ClientListener {
    void clientAdded(ClientEvent clientEvent);
    void clientRemoved(ClientEvent clientEvent);
}
