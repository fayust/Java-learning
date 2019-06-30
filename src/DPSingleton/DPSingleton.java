package DPSingleton;

public class DPSingleton {
    public static void main(String[] args) throws InterruptedException {

        //тест работы сингтона,что он только один
        final int SIZE =1000;

        Singleton s[] = new Singleton[SIZE];
        for(int i = 0; i < SIZE; i++) {
            s[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.counter);
    }
}



class Singleton {
    public static int counter = 0;
    private static Singleton instance;
    private Singleton() {
        counter++;
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
