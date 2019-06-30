public class DPSingleton {
    public static void main(String[] args) throws InterruptedException {

        //тест работы сингтона,что он только один и не может быть создан в разных потоках
        final int SIZE =1000;

        Thread t[] = new Thread[SIZE];
        for(int i = 0; i < SIZE; i++) {
            t[i] = new Thread(new R());
            //создаем потоки и тут же их стартуем
            t[i].start();
        }

        //подождать пока все потоки выполнятся
        for(int i = 0; i < SIZE; i++) {
            //подождать выполнения t[i] и присоединится к нему
            t[i].join();
        }

        System.out.println(Singleton.counter);
    }
}

/**
 * Класс будет вызывать синглтон в нескольких потоках одновременно
 */
class R implements Runnable {

    @Override
    public void run() {
        Singleton.getInstance();
    }
}

class Singleton {
    public static int counter = 0;
    //private static Singleton instance;

    //многопоточный вариант, но так не работает ленивая инициализация
    //ленивая инициализация - создание экземпляра не при загрузке класса, а уже при запуске
    //через метод getInstance
    private static Singleton instance = new Singleton();
    private Singleton() {
        counter++;
    }

    //многопоточный вариант
    public static Singleton getInstance() {
        return instance;
    }

   /* public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }*/

}
