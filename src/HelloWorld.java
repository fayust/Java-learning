//public class HelloWorld {  }
class TestProject
{
    public static void main(String [] args)
    {
        //Упражнение1
        OutString1 str1 = new OutString1();
        str1.OutputMethod();

        //Упражнение2
        OutString2 str2 = new OutString2();
        str2.OutputMethod();


        // Упражнение 3
        //                //
        TestProject p = new TestProject();
        p.start();


        //Упражнение4
        OutString4 str4 = new OutString4();
        str4.OutputMethod();

        //Упражнение5
        Bird birdy = new Bird(45,"red");
        birdy.fly(" In the sky");
        System.out.println(birdy.FlyBack(21));

    }

    // Методы Упражнения 3
    //
    void start()
    {
        String s1 = "slip";
        String s2 = fix(s1);
        System.out.println(s1 + " " + s2);
    }

  //  Строки иммутабельны; их значение нельзя поменять после создания.
  //  s1 = s1 + "stream" в методе fix меняет лишь локальную переменную на стеке.
  //  Оригинальная строка, определённая в методе start, не меняется.
    String fix(String s1)
    {
        s1 = s1 + "stream";
        System.out.print(s1 + " ");
        return "stream";
    }
    //


}



class OutString1 {
    /*      Сделать выод таких строк:
            %java PoolPuzzleOne
            a noise
            annoysan
            oyster
             */
    private int x = 0;

    public void  OutputMethod()
    {
        while(x< 3) {
            if (x < 1) {
                System.out.println("%java PoolPuzzle");
            }
            if (x == 0) {
                System.out.println("a noise");
            }
            if (x == 1) {
                System.out.println("annoysan");
            }
            if (x > 1) {
                System.out.println("oyster");
            }

            //System.out.println(““);
            x++;
        }
    }
}



class OutString2
{
      /*  Объявить переменные типа int: a, b, c и d. После этого присвоить им значения в следующем порядке..
        a присвоить значение 3
        c присвоить значение 2
        b присвоить значение c
        d присвоить значение a
        a присвоить значение b
        c присвоить значение d
        Вывести на печать a, b, c и d. Проанализировать результат. */
    int a = 3;
    int c = 2;
    int b = c;
    int d = a;

    public void OutputMethod()
    {
        a = b;
        c = d;
        System.out.println(a + "" + b + "" + c + "" +d);
    }


}

class OutString4
{
    public void OutputMethod()
    {
        String resOne = "" + 2 + 3;    // 23  здесь первый аргумент строковый
// поэтому первая операция приводится автом. к строке,  и вторая тоже
        String resTwo = "" + (2 + 3);  // 5
        String resThree = 2 + 3 + "";   //5
        String resFour = 2 + "" + 3;    //23
        System.out.println(resOne);
        System.out.println(resTwo);
        System.out.println(resThree);
        System.out.println(resFour);


        //Объявить 2 числа типа double. Вывести на печать результат
        // деления двух чисел
        double a = 8;
        double b = 4.4;
        System.out.println(a/b);

        //Объявить переменную типа char и присвоить ей значение 100.
        // Вывести на печать эту переменную и проанализировать результат.
        char ch = 100;
        System.out.println(ch);

        //Выведите на печать строку 2 + 3 + " " + 2 + 3;
        //Посмотрите результат.
        //Сколько конкатенаций и сложений в этом выражении?
        System.out.println(2 + 3 + "" + 2 + 3);

    }
}





