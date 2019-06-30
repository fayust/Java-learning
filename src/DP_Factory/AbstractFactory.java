package DP_Factory;

/**
 * Абстрактная фабрика содержит разные продукты-объекты, и разные фабричные методы, В отличие от простой фабрики
 */
public class AbstractFactory {
    public static void main(String[] args) {

        //Если надо добавить новую страну - клиентский код, т.е содержащийся в main меняться не будет
        //Мы просто добавим новую производственную линию и новые товары этой страны
        DeviceFactory factory = getFactoryByCountry("Ru");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();

        m.click();
        k.print();

    }

    public static DeviceFactory getFactoryByCountry(String lang) {
        if (lang.equals("En")) {
            return new EnDeviceFactory();
        }else if (lang.equals("Ru")) {
            return new RuDeviceFactory();
        }

        throw new RuntimeException("Не поддерживаемая страна:" + lang);
    }

}

/**
 * 2 продукта, что будем производить и методы, что они делают
 */
interface Mouse {
    void click();
    void scroll(int direction);
}
interface Keyboard {
    void print();
    void println();
}

/**
 * Реализации продуктов на разных языках, т.е. 2 производственные линии Ru En
 */
class RuKeyboard implements  Keyboard {
    @Override
    public void print() {
        System.out.print("Строка");
    }
    public void println() {
        System.out.println("Строка c переводом");
    }
}

class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Щелчок");

    }
    @Override
    public void scroll(int direction) {
        System.out.println("Скролим" + direction);
    }
}

class EnKeyboard implements  Keyboard {
    @Override
    public void print() {
        System.out.print("String");
    }
    public void println() {
        System.out.println("String with break");
    }
}

class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Click");

    }
    @Override
    public void scroll(int direction) {
        System.out.println("Scroll" + direction);
    }
}


/**
 * Фабрика продуктов
 */
interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
}

/**
 * Абстрактная фабрика использует несколько производственных линий(En Ru) и фабричных методов
 */
class EnDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }
}

class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }
}







