package tw.designpattern.behavior.mediator1;

public class Market implements Department {

    private Mediator mMediator;

    public Market(Mediator mediator) {
        mMediator = mediator;
        mMediator.register(this.getClass().getSimpleName(), this);
    }

    @Override
    public void selfAction() {
        System.out.println("報告計畫 需要錢");
        mMediator.command(Finacial.class.getSimpleName());
    }

    @Override
    public void outAction() {
        System.out.println("報告經理計畫");
    }
}
