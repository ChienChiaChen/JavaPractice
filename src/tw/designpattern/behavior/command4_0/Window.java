package tw.designpattern.behavior.command4_0;

/**
 * Created by chiachen on 2017/8/7.
 */
public class Window {

    public boolean isBroken;
    public boolean isOpen;


    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
