public class BallB extends BallA {

    public BallB(String treadMark) {
        super(treadMark);
    }
    @Override
    public void roll() {
        System.out.println(treadMark+" rolls smoothly.");
    }

}