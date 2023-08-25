public abstract class Ball {
    protected String treadMark;

    public Ball(String treadMark) {
        this.treadMark = treadMark;
        // System.out.println(treadMark + " is a trademark of " + this.getClass().getSimpleName());
    }

    public abstract void inflate(double volume);
}
