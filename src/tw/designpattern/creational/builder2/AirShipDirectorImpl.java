package tw.designpattern.creational.builder2;

public class AirShipDirectorImpl implements AirShipDirector {

    private AirShipBuilder mAirShipBuilder;

    @Override
    public AirShip createAirShip() {
        mAirShipBuilder = new AirShipBuilderImpl();
        AirShip airShip = new AirShip();
        airShip.setEngine(mAirShipBuilder.buildEngine());
        airShip.setEscapeTower(mAirShipBuilder.buildEscapeTower());
        airShip.setOrbitalModule(mAirShipBuilder.buildOrbitalModule());
        return airShip;
    }

    @Override
    public void lunch() {
        System.out.println("it's time to lunch");
    }
}
