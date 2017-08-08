package tw.designpattern.behavior.command4_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chiachen on 2017/8/7.
 */
public class Server_1 {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void removeCommand(Command command) {
        commandList.remove(command);
    }

    public void monitor(){
        Result result;
        for (Command command : commandList) {
            result = command.execute();
            System.out.println("Message: " + result.getMessage() + " Status: " + result.getStatus());
        }
    }
}
