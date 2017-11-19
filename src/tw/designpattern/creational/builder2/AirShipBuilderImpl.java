package tw.designpattern.creational.builder2;

public class AirShipBuilderImpl implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        System.out.println("build engine");
        return new Engine("Engine");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("build Orbital Module");
        return new OrbitalModule("Orbital Module");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("build Escape Tower");
        return new EscapeTower("Escape Tower");
    }
}
