package DPSingleton;

public class SingletonMultiThread {
    public static void main(String[] args) throws InterruptedException {

        //тест работы сингтона,что он только один и не может быть создан в разных потоках
        final int SIZE =1000;

        Thread t[] = new Thread[SIZE];
        for(int i = 0; i < SIZE; i++) {
            t[i] = new Thread(new R1());
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
class R1 implements Runnable {

    @Override
    public void run() {
        Singleton.getInstance();
    }
}

class Singleton1 {
    public static int counter = 0;
    //volatile решает проблему с кешем в многопроцессорых системах
    //его надо использовать, если мы работаем в многопоточном режиме с разделяемыми ресурсами,
    //но не внутри блока или метода synchronized
    private static volatile Singleton1 instance = null;
    private Singleton1() {
        counter++;
    }

    /**
     * многопоточный вариант, c ленивой инициализацией
     * ленивая инициализация - создание экземпляра не при загрузке класса, а уже при запуске
     * через метод getInstance
     * synchronized исключает что экземпляр будет каждый раз создаваться новым потоком
     *
     * за счет двойного if мы будем вызывать synchronized только несколько раз сначала, а не для каждого потока,
     * т.к это ресурсоемкая операция
     *
     * второй if будет работать на первых нескольких потоках, когда
     * @return
     */

   public static  Singleton1 getInstance() {
       if (instance == null) {                  //в первый момент времени несколько потоков с небольшим временным лагом будут лезть и
           synchronized(Singleton.class) {      //пытаться создать объект.  2 if не дадут им создать объект одновременно
               if (instance == null) {          //после нескольких потоков объект уже создан и instance не null
                   instance = new Singleton1();
               }
           }
       }
       return instance;
   }

}

