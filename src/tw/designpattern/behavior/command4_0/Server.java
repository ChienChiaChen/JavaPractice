package tw.designpattern.behavior.command4_0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chiachen on 2017/8/7.
 */
public class Server {

    List<Door> doors = new ArrayList<>();
    List<Thermal> thermals = new ArrayList<>();
    List<Window> windows = new ArrayList<>();

    public void addDoor(Door door){
        doors.add(door);
    }

    public void addWindow(Window window){
        windows.add(window);
    }
    public void addThermal(Thermal thermal){
        thermals.add(thermal);
    }

    public void monitor() {
        for(Door door:doors){
            if("open".equals(door.getDoorStatus()))
                System.out.println("門被打開: "+door.toString());
        }
        
        for(Window window:windows){
            if(window.isOpen())
                System.out.println("窗戶被開啟: "+window.toString());
            if(window.isBroken())
                System.out.println("窗戶被打破: "+window.toString());
        }
        
        for(Thermal thermal:thermals){
            if(thermal.isOverheat())
                System.out.println("溫度過熱: "+thermal.toString());
        }
    }
    
    
}
