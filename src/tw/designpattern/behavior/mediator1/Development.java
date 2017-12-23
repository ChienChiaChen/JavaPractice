package tw.designpattern.behavior.mediator1;

public class Development implements Department {

    private Mediator mMediator;

    public Development(Mediator mediator) {
        mMediator = mediator;
        mMediator.register(this.getClass().getSimpleName(), this);
    }

    @Override
    public void selfAction() {
        System.out.println("專心研究");
    }

    @Override
    public void outAction() {
        System.out.println("報告經理需要資金");
        mMediator.command(Finacial.class.getSimpleName());
    }
}
