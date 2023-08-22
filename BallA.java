public class BallA extends Ball implements RollAble {

    public BallA(String treadMark) {
        super(treadMark);
    }

    @Override
    public void roll() {
        System.out.println(treadMark+" rolls rather smoothly.");
    }

    @Override
    public void inflate(double volume) {
        System.out.println(treadMark + "'s ball is inflated " + volume + " cu.ft.");
    }

}
