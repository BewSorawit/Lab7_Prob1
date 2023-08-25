public class BallC extends BallA {

    public BallC(String treadMark) {
        super(treadMark);
    }

    @Override
    public void roll() {
        System.out.println(treadMark+" rolls very smoothly.");
    }
}
