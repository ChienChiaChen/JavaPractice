package tw.designpattern.behavior.command4_1;

import tw.designpattern.behavior.command4_0.Door;
import tw.designpattern.behavior.command4_0.Thermal;
import tw.designpattern.behavior.command4_0.Window;

/**
 * Created by chiachen on 2017/8/7.
 */
public class Main {
    public static void main(String[] args) {
        Door d1 = new Door();
        Window w1 = new Window();
        Thermal t1 = new Thermal();

        d1.setStatus(Door._Status.open);
        w1.setOpen(true);
        t1.setOverheat(false);



        DoorCommand doorCommand = new DoorCommand();
        doorCommand.setDoor(d1);
        WindowCommand windowCommand = new WindowCommand();
        windowCommand.setWindow(w1);
        ThermalCommand thermalCommand = new ThermalCommand();
        thermalCommand.setThermal(t1);

        Server_1 server_1 = new Server_1();
        server_1.addCommand(doorCommand);
        server_1.addCommand(windowCommand);
        server_1.addCommand(thermalCommand);





        server_1.monitor();
    }
}
