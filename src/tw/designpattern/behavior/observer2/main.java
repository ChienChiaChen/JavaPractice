package tw.designpattern.behavior.observer2;

/**
 * Created by chiachen on 2017/3/4.
 */
public class main {
    public static void main(String[] args) {
        SensorSystem ss = new SensorSystem();
        ss.register( new Gates()        );
        ss.register( new Lighting()     );
        ss.register( new Surveillance() );
        ss.soundTheAlarm();
    }
}
