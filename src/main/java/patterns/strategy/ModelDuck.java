package patterns.strategy;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Quack();   // Определение конкретной реализайии quackBehavior

        // здесь, в конструкторе определен полет крыльями,
        // но дальше в main поведение полета изменено динамически
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.print("I'm a model duck");
    }
}
