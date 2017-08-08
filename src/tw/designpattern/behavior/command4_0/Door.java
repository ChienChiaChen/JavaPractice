package tw.designpattern.behavior.command4_0;

/**
 * Created by chiachen on 2017/8/7.
 */
public class Door {
    private String status;
    public void setStatus(_Status status){
        this.status = status.toString();
    }
    public String getDoorStatus(){
        return status;
    }

    public enum _Status{
        open,close;
    }
}
