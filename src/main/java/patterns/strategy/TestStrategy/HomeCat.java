package patterns.strategy.TestStrategy;

public class HomeCat extends Cat {


    HomeCat(RunStyle runStyle, JumpBehavior jumpBehavior, int moveDistance) {
        super(runStyle, jumpBehavior, moveDistance);
    }

    @Override
    public void display(){
        System.out.println("I'm home cat");
    }
}
