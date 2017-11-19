package tw.designpattern.creational.builder2;

public interface AirShipDirector {
    /**
     * create object of air ship
     * @return
     */
    AirShip createAirShip();

    void lunch();
}
