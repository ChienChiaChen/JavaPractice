package tw.designpattern.Behavior.command1;

/**
 * Created by chiachen on 2017/1/19.
 */
public class AEffectCommand implements Command {
    @Override
    public void execute(Drawing drawing) {
        System.out.println("do A");
        drawing.processSome();
        drawing.processOther();
    }

}
