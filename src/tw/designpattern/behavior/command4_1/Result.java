package tw.designpattern.behavior.command4_1;

/**
 * Created by chiachen on 2017/8/7.
 */
public class Result {
    public final static int OK = 1;
    public final static int WARNING = 2;
    public final static int CRITICAL = 3;
    private int status = OK;
    private String message = "";


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
