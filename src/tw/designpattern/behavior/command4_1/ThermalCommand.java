package tw.designpattern.behavior.command4_1;

import tw.designpattern.behavior.command4_0.Thermal;

/**
 * Created by chiachen on 2017/8/7.
 */
public class ThermalCommand implements Command {
    private Thermal thermal;

    public void setThermal(Thermal thermal) {
        this.thermal = thermal;
    }

    @Override
    public Result execute() {
        if (thermal == null) {
            return null;
        }

        Result result = new Result();
        if (thermal.isOverheat()) {
            result.setStatus(Result.CRITICAL);
            result.setMessage("Thermal is overheat");
        } else {
            result.setStatus(Result.OK);
            result.setMessage("Thermal is not overheat");
        }
        return result;
    }
}
