package tw.designpattern.behavior.memento2;

public class Memento {
    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memento [ mCheckpoint= " + mCheckpoint + ", mLifeValue= " + mLifeValue + ", mWeapon= " + mWeapon + " ]";
    }
}
