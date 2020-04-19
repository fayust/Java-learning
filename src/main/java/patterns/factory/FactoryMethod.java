package patterns.factory;

import java.util.Date;

public class FactoryMethod {
    public static void main(String[] args) {

        //получаем фабрику-производителя часов
        WatchMaker maker = getMakerByName("Rome");
        //WatchMaker maker = new RomeWatchMaker();


        //удобство в том что этот код будет неизменен, нам нужна только
        // ссылка на интерфейс часов и ссылка на производителя часов
        Watch watch = maker.createwatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
        if (maker.equals("Digital")) {
            return new DigitalWatchMaker();
        }else if (maker.equals("Rome")) {
            return new RomeWatchMaker();
        }

        throw new RuntimeException("Не поддерживаемая производственная линия часов:" + maker);
    }
}

interface Watch {
    void showTime();
}


class DigitalWatch implements Watch {
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {
    public void showTime() {
        System.out.println("XXXX");
    }
}

/**
 * Интерфейс реализующий экземпляры часов, Фабрика
 * Под каждую реализацию часов нужно создать своего производителя часов
 * и фабричный метод
 */

interface WatchMaker {
    /**
     * это фабричный метод.  Он будет возвращать нужный экземпляр часов в зависимости от типа производителя
     * @return
     */
    Watch createwatch();
}

class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createwatch() {
        return new DigitalWatch();
    }
}

class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createwatch() {
        return new RomeWatch();
    }
}
