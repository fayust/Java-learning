package DesignPatterns.Strategy.TestStrategy;

import java.text.Format;

public class QuickRun implements RunStyle {
    public void run(int length) {
        System.out.println(String.format("Quick run for %d metres", length));
    }

}
