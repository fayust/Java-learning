package patterns.strategy.TestStrategy;

public class QuickRun implements RunStyle {
    public void run(int length) {
        System.out.println(String.format("Quick run for %d metres", length));
    }

}
