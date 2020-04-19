package patterns.strategy.TestStrategy;

public abstract class Cat {
    private RunStyle runStyle;
    private JumpBehavior jumpBehavior;
    private int moveDistance;

    Cat(RunStyle runStyle, JumpBehavior jumpBehavior, int moveDistance) {
        this.runStyle = runStyle;
        this.jumpBehavior = jumpBehavior;
        this.moveDistance = moveDistance;
    }

    public void running() {
        runStyle.run(moveDistance);
    }

    public void jumping() {
        jumpBehavior.jump();
    }

    public abstract void display();

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public void setRunStyle(RunStyle runStyle) {
        this.runStyle = runStyle;
    }

    public void setMoveDistance(int moveDistance) {
        this.moveDistance = moveDistance;
    }
}
