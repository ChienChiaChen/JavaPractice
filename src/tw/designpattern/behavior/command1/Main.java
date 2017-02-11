package tw.designpattern.behavior.command1;


public class Main {
    public static void main(String[] args) {
        ImageService service = new ImageService();
        service.addCommand("AEffect", new AEffectCommand());
        service.addCommand("BEffect", new BEffectCommand());
        service.addCommand("CEffect", new CEffectCommand());


        service.doEffect("AEffect");
        service.doEffect("BEffect");
        service.doEffect("CEffect");
    }
}
