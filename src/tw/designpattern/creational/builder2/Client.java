package tw.designpattern.creational.builder2;

//https://www.youtube.com/watch?v=03ly8k1FkVc
public class Client {
    public static void main(String[] args) {

        AirShipDirector airShipDirector = new AirShipDirectorImpl();
        airShipDirector.createAirShip().getEngine().getName();
        airShipDirector.lunch();



    }
}
