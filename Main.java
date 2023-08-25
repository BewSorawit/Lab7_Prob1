public class Main {
    public static void TestBall(Ball ball, double volume) {
        if (ball instanceof Ball) {
            System.out.println(ball.treadMark + " is a trademark of " + ball.getClass().getSimpleName());
        }
        // if (ball instanceof BallC) {
        // System.out.println(ball.treadMark + " is a trademark of BallC");
        // } else if (ball instanceof BallB) {
        // System.out.println(ball.treadMark + " is a trademark of BallB");
        // } else if (ball instanceof BallA) {
        // System.out.println(ball.treadMark + " is a trademark of BallA");
        // }
        if (ball instanceof Ball) {
            ball.inflate(volume);
        }
        if (ball instanceof RollAble) {
            ((BallA) ball).roll();
        }

    }

    public static void main(String[] args) {
        TestBall(new BallA("Zentia"), 1.0);
        TestBall(new BallB("Zapphire"), 1.1);
        TestBall(new BallC("Zenith"), 1.2);

    }
}
