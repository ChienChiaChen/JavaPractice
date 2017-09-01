package tw.designpattern.behavior.state1;

public class main {
    public static void main(String[] args) {

        Context context = new Context();

        StateStart stateStart = new StateStart();
        stateStart.doAction(context);
        System.out.println(context.getState().toString());
        System.out.println("=============================");

        StateStop stateStop = new StateStop();
        stateStop.doAction(context);
        System.out.println(context.getState().toString());
        System.out.println("=============================");


        StateEnd stateEnd = new StateEnd();
        stateEnd.doAction(context);
        System.out.println(context.getState().toString());
    }
}
