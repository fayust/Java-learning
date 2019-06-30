package DesignPatterns.Strategy.TestStrategy;

public class WildCat extends Cat{

    WildCat(RunStyle runStyle, JumpBehavior jumpBehavior, int moveDistance) {
        super(runStyle, jumpBehavior, moveDistance);
    }


    @Override
    public void display(){
        System.out.println("I'm wild cat");
    }
}

