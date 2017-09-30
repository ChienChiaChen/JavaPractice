package tw.se.anonymouspractice1;

public class Client {
    private String mIP;
    private String mName;

    public Client(String mIP, String mName) {
        this.mIP = mIP;
        this.mName = mName;
    }

    public String getIP() {
        return mIP;
    }

    public void setIP(String mIP) {
        this.mIP = mIP;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }
}
