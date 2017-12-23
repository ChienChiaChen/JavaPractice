package tw.designpattern.behavior.mediator1;

public class Finacial implements Department {
    private Mediator mMediator;

    public Finacial(Mediator mediator) {
        mMediator = mediator;
        mMediator.register(this.getClass().getSimpleName(),this);
    }

    @Override
    public void selfAction() {
        System.out.println("數錢");
    }

    @Override
    public void outAction() {
        System.out.println("報告經理有多少錢");
    }
}
