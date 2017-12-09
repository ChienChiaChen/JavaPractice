package tw.designpattern.behavior.memento2;

public class CallOfDuty {
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鷹";

    public void play() {
        System.out.println("play game: " + String.format("第%d關", mCheckpoint) + " 奮戰中～");
        mLifeValue -= 10;
        System.out.println("Level up");
        mCheckpoint++;
        System.out.println("Arrived " + String.format("第%d關", mCheckpoint));
    }

    public void quit(){
        System.out.println("==============");
        System.out.println("退出遊戲前的攻擊屬性:" + this.toString());
        System.out.println("退出遊戲");
        System.out.println("==============");
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.mWeapon = mWeapon;
        memento.mLifeValue=mLifeValue;
        memento.mCheckpoint = mCheckpoint;

        return memento;
    }

    public void restore(Memento memento) {
        this.mCheckpoint = memento.mCheckpoint;
        this.mLifeValue = memento.mLifeValue;
        this.mWeapon = memento.mWeapon;
    }

    @Override
    public String toString() {
        return "CallOfDuty [ mCheckpoint= " + mCheckpoint + ", mLifeValue= " + mLifeValue + ", mWeapon= " + mWeapon + " ]";
    }


}
