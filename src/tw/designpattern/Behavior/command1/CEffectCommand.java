package tw.designpattern.Behavior.command1;

/**
 * Created by chiachen on 2017/1/19.
 */
public class CEffectCommand implements Command {
    @Override
    public void execute(Drawing drawing) {
        System.out.println("do C");
        drawing.processOther();
        drawing.processSome();
        drawing.processAnother();
    }
}
