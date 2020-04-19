package patterns.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        /* Вызов метода performQuack(), унаследованного от Duck()
           Метод вызывает quack() через унаследованную переменную quackBehavior()
         */
        mallard.performQuack();
        mallard.performFly();


        Duck model = new ModelDuck();
        //первый вызов передается реализации поведения, заданной в конструкторе ModelDuck, т.е. FlyWithWings
        model.performFly();

        //вызываем set метод, унаследованный классом ModelDuck и меняем реализацию поведения полета
        model.setFlyBehavior((new FlyNoWay()));
        model.performFly();
    }
}

/*
    Каждая утка СОДЕРЖИТ экземпляры FlyBehavior и Quack-
        Behavior, которым делегируются выполнение соответ-
        ствующих операций.


      Интерфейсы поведения и классы, их реализующие инкапсулированы

         Паттерн Стратегия определяет семейство ал-
        горитмов, инкапсулирует каждый из них и обе-
        спечивает их взаимозаменяемость. Он позво-
        ляет модифицировать алгоритмы независимо
        от их использования на стороне клиента.


*/
