package tw.designpattern.behavior.command4_1;

import tw.designpattern.behavior.command4_0.Door;

/**
 * Created by chiachen on 2017/8/7.
 */
public class DoorCommand implements Command {
    private Door _door;

    public void setDoor(Door _door) {
        this._door = _door;
    }


    @Override
    public Result execute() {
        if (_door == null) {
            return null;
        }

        Result result = new Result();
        if (_door.getDoorStatus().equalsIgnoreCase("open")) {
            result.setMessage("Door is open");
            result.setStatus(Result.OK);

        } else {
            result.setMessage("Door is close");
            result.setStatus(Result.WARNING);
        }

        return result;
    }
}
