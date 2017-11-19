package tw.designpattern.creational.builder2;

public class AirShip {
    private EscapeTower mEscapeTower;
    private Engine mEngine;
    private OrbitalModule mOrbitalModule;

//    public AirShip(EscapeTower escapeTower, Engine engine, OrbitalModule orbitalModule) {
//        mEscapeTower = escapeTower;
//        mEngine = engine;
//        mOrbitalModule = orbitalModule;
//    }

    public EscapeTower getEscapeTower() {
        return mEscapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        mEscapeTower = escapeTower;
    }

    public Engine getEngine() {
        return mEngine;
    }

    public void setEngine(Engine engine) {
        mEngine = engine;
    }

    public OrbitalModule getOrbitalModule() {
        return mOrbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        mOrbitalModule = orbitalModule;
    }
}


class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class EscapeTower {
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}