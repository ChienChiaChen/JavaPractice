package tw.designpattern.behavior.memento2;

public class Client {

    public static void main(String[] args) {
        CallOfDuty game = new CallOfDuty();
        game.play();

        CareTaker careTaker = new CareTaker();
        careTaker.archive(game.createMemento());

        game.quit();


        game = new CallOfDuty();

        game.restore(careTaker.getMemento());

        System.out.println(game.toString());

    }
}
