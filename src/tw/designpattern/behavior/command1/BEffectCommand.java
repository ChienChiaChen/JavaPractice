package tw.designpattern.behavior.command1;


public class BEffectCommand implements Command {
    @Override
    public void execute(Drawing drawing) {
        System.out.println("do B");
        drawing.processOther();
        drawing.processAnother();
    }
}
