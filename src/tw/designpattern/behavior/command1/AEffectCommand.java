package tw.designpattern.behavior.command1;


public class AEffectCommand implements Command {
    @Override
    public void execute(Drawing drawing) {
        System.out.println("do A");
        drawing.processSome();
        drawing.processOther();
    }

}
