public class Main {
    public static void TestBall(Ball ball, double volume) {
        ball.inflate(volume);
        ((BallA) ball).roll();
    }

    public static void main(String[] args) {
        TestBall(new BallA("Zentia"), 1.0);
        TestBall(new BallB("Zapphire"), 1.1);
        TestBall(new BallC("Zenith"), 1.2);

    }
}
