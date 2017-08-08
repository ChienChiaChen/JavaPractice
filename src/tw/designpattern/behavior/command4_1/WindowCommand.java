package tw.designpattern.behavior.command4_1;

import tw.designpattern.behavior.command4_0.Window;

/**
 * Created by chiachen on 2017/8/7.
 */
public class WindowCommand implements Command {
    private Window _window;

    public void setWindow(Window _window) {
        this._window = _window;
    }

    @Override
    public Result execute() {
        if (null == _window) {
            return null;
        }

        Result result = new Result();
//        if (_window.isBroken()) {
//            result.setMessage("Window is broken");
//            result.setStatus(Result.WARNING);
//        } else
        if (_window.isOpen()) {
            result.setMessage("Window is open");
            result.setStatus(Result.OK);
        } else {
            result.setMessage("Window !!!!");
            result.setStatus(Result.CRITICAL);
        }
        return result;
    }
}
