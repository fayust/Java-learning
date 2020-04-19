package patterns.strategy;

public class MallardDuck extends Duck {

    /* MallardDuck  использует  класс Quack для выполнения действия, при вызове performQuack()
    ответственость за выполнение возлагается на объект Quack()
    Переменные quackBehavior flyBehavior наследуются от DuckStrategy
     */
    public MallardDuck() {
        quackBehavior = new Quack();   // Определение конкретной реализайии quackBehavior
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Я дикая утка");
    }
}
