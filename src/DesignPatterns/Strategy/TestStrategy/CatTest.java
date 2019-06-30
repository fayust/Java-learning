package DesignPatterns.Strategy.TestStrategy;

public class CatTest {
    public static void main(String[] args) {
        Cat roger = new WildCat(new QuickRun(), new JumpOnTable(), 450);
        roger.running();
        roger.jumping();
        roger.display();

        Cat tom = new HomeCat(new SlowRun(), new JumpOnChair(), 15);
        tom.display();
        tom.running();

        tom.setJumpBehavior(new JumpOnChair());
        tom.setMoveDistance(200);
        tom.running();
        tom.jumping();
    }
}
