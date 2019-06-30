package DesignPatterns.Strategy;

/**
 * В стратегии есть объект и есть его поведение. Типы поведения описаны интерфейсами.
 * Каждый из них реализован в нескольких классах. Для QuackBehavior Quack и MuteQuack.
 * Каждый из этих классов имеет метод, реализующий это поведение.
 * Абстрактный класс объекта содержит
 * Переменные Типа Интерфейса Поведения
 * Методы, вызывающие методы интерфейса поведения.
 * Сеттеры, принимающие параметры типа поведения и устанавливающие в ПТИП это поведение.
 * Другие методы, описывающие абстрактный объект, например display()
 *
 * Абстрактный класс наследуют несколько классов.  В каждом из них в конструкторе в ПТИП
 * присваивается new класс реализующий поведение.
 * также есть методы, реализующие особенность
 */
public abstract class Duck {

    FlyBehavior flyBehavior;            // переменная с типом интерфейса поведения
    QuackBehavior quackBehavior;

    public Duck() {   }

    public abstract void display();

    /**
     * // делегирование операции классам поведения
     */
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    //C помощью этих методов можно изменять поведение утки динамически
    //set - методом подкласса вместо создания экземпляра в конструкторе

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}





