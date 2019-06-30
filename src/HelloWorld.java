import Sortings.*;
import Collections.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
import java.util.List;
import java.util.Scanner;

//public class HelloWorld {  }
class TestProject
{
    public static void main(String [] args)
    {

        System.out.println((new Test2("name").getHello() instanceof String));

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
        System.out.println("Упражнение 5");
        Bird birdy = new Bird(45,"red");
        birdy.fly(" In the sky");
        System.out.println(birdy.FlyBack(21));

        //Упражнение 6 Пузырьковая сортировка через методы класса
        System.out.println("Упражнение 6 Пузырьковая сортировка через методы класса");
         SortingBubble srt = new SortingBubble(6);
         srt.insertToArr(45);
         srt.insertToArr(67);
         srt.insertToArr(34);
         srt.insertToArr(13);
         srt.insertToArr(87);
         srt.insertToArr(33);
         srt.printing();
         srt.Sorter();
         srt.printing();


        //Упражнение 7 Слияние Массивов
        System.out.println("Упражнение 7 Слияние Массивов");
        ArrayMerge process = new ArrayMerge();
        int[] rsl = process.ArrMerge(
                new int[] {1, 2, 15, 67},
                new int[] {3, 4, 6, 78, 79}
        );
        System.out.println(Arrays.toString(rsl));

        //Упражнение 8 Сортировка Слиянием
        System.out.println("Упражнение 8 Сортировка Слиянием");
        SortingMerge process1 = new SortingMerge();
        int[] arr = new int[] {5,-2, 9, 8, -16};
        int[] result = process1.SortMerge(arr);
        System.out.println(Arrays.toString(result));


        //Упражнение 9 Математические операции  и возврат нескольких значений через класс
        System.out.println("Упражнение 9 Математические операции");
        Figure Figa = new Figure("Circle");
        String fstName = Figa.gotName();
        double Area = Figa.CircleArea(7);

        System.out.printf("Сначала: %s, площадь%f \n",fstName, Area);


        //Упражнение  10  Считываем цифры с консоли и оперируем листом
        /*
        ListTask1 lt = new ListTask1();
        List<Integer> numList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            numList.add(sc.nextInt());
        }
       lt.ListOperation1(numList);
        */


        //Упражнение  11  Считываем с консоли и оперируем листом
 /*
        ListTask2 lt1 = new ListTask2();
        //считываем с консоли
        Scanner sc1 = new Scanner(System.in);
        //считать строку целиком.    .next() считать лишь одно слово
        String words = sc1.nextLine();
        lt1.ListOperation2(words);
*/


        //Упражнение  12
        deque1 dq = new deque1();
        dq.operate();

        //Упражнение  13
        //dq.operate13();

        //Упражнение  14
        //dq.operate14();

        //Упражнение  15
        //dq.operate15();


        //Упражнение 16 Сортировка Быстрая
        System.out.println("\n\n Упражнение 16 Сортировка Быстрая");
        int[] arr1 = new int[] {5,-2};
        SortingQuick.quickSort(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));
    }

    // Методы Упражнения 3

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

class OutString4 {
    public void OutputMethod() {
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
        System.out.println(a / b);

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

class Figure{
    private String name;
    private double ran = RandomNumber();


    public Figure(String name){
        this.name = name;
    }

    public String gotName(){
        return this.name;
    }



    public double CircleArea(double addy){
        double Area = Math.PI * Math.pow(this.ran, 2);
        Double LineArea = 2*Math.PI*this.ran+addy;
        return Area;
    }

    final static double RandomNumber(){
        return Math.random();
    }
}

class Test2 {

    private String name;

    private String hello;

    public Test2(String name) { this.name = name; }

    public String getHello() { return hello; }

}








