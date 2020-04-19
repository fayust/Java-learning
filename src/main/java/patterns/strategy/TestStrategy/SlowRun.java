package patterns.strategy.TestStrategy;

public class SlowRun implements RunStyle {
    public void run(int length) {
        System.out.println(String.format("Slow run for %d metres", length));
    }
}
