package tw.designpattern.behavior.command4_0;

/**
 * Created by chiachen on 2017/8/7.
 */
public class Main {
    public static void main(String[] args) {
        Door d1 = new Door();
        d1.setStatus(Door._Status.open);

        Thermal t1 = new Thermal();
        t1.setOverheat(true);

        Window w1 = new Window();
        w1.setBroken(true);
        w1.setOpen(true);

        Server server = new Server();
        server.addDoor(d1);
        server.addThermal(t1);
        server.addWindow(w1);

        server.monitor();
    }
}
