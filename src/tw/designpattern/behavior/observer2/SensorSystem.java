package tw.designpattern.behavior.observer2;

import java.util.Vector;

/**
 * Created by chiachen on 2017/3/4.
 */
public class SensorSystem {
    private Vector listeners = new Vector();

    public void register(AlarmListener alarmListener) {
        listeners.add(alarmListener);
    }

    public void soundTheAlarm(){
        for (Object listener : listeners) {
            ((AlarmListener)listener).alarm();
        }
    }

}
