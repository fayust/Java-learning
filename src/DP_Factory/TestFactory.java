package DP_Factory;

import java.util.Date;

public class TestFactory {
    public static void main(String[] args) {
        Factory factory = getFactoryByWatch("Rome");
        factory.createWatch1().showTime();
    }

    public static Factory getFactoryByWatch (String watch) {
        Factory factory;
        if ("Digital".equals(watch)) {
            return factory = new DigitalWatchLine();
        }else if ("Rome".equals(watch)) {
            return factory = new RomeWatchLine();
        }

        throw new RuntimeException("такой фАБРИКИ ЧАСОВ НЕТ" + watch);


    }

}

interface Watch1 {
    void showTime();
}

class DigitalWatch1 implements Watch1 {
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch1 implements Watch1 {
    public void showTime() {
        System.out.println(new Date());
    }
}

interface Factory {
    Watch1 createWatch1();

}

class  RomeWatchLine implements Factory {
    public Watch1 createWatch1() {
        return new RomeWatch1();
    }
}

class  DigitalWatchLine implements Factory {
    public Watch1 createWatch1() {
        return new DigitalWatch1();
    }
}






