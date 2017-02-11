package tw.designpattern.behavior.command1;


public class CEffectCommand implements Command {
    @Override
    public void execute(Drawing drawing) {
        System.out.println("do C");
        drawing.processOther();
        drawing.processSome();
        drawing.processAnother();
    }
}
