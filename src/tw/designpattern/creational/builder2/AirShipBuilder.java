package tw.designpattern.creational.builder2;

public interface AirShipBuilder {
    Engine buildEngine();
    OrbitalModule buildOrbitalModule();
    EscapeTower buildEscapeTower();
}
