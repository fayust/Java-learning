package Sortings;
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
    Сортируемый массив разбивается на две части примерно одинакового размера.
    Каждая из получившихся частей сортируется отдельно.
    Два получившихся упорядоченных массива соединяются в один. При этом наименьший из первых элементов двух массивов
    записывается в результирующий массив, и эта операция повторяется, пока не закончатся элементы в этих двух массивах.

Сортировка слиянием требует времени O(nlog n) для всех случаев. на половины, на каждом уровне рекурсии получаем log n.
Затем, для слияния подмассивов нужно всего n сравнений.


    Быстрый. Примерно O(n log n) операций.
    Можно использовать на связанных списках.
    Можно сделать реализацию, использующую параллельные потоки.
    Сохраняет порядок равных элементов (устойчивая)
Недостатки:
    На почти отсортированных массивах работает также, как и на неотсортированных.
    Нужна дополнительная память для буфера.

 */

public class SortingMerge {

    //рекурсивная функция сортировки частей массива
    //разбиваем масс на 2 части и вызываем рекурс. метод для каждой,
    // пока не масс не будет разбит на атомарные эл, массивы по одному эл.
    //только тогда алгоритм идет на Метод слияния, собирая рекурсивную матрешку

 /*
    Алгоритм программы

    1. Программа состоит из метода дробления массива на 2 части и метода слияния
    2. В методе дробления берем середину, деля длину на 2, объявляем 2 новых массива
            и через Arrays.copyOfRange разбиваем масс на 2
    3. Вызываем метод слияния, подавая на вход 2 массива
    4.В методе слияния каждый массив имеет свой счетчик, когда мы кладем эл-ты в рез. массив,
        счетчики рез. и того, откуда взяли - увеличиваются на 1

*/

    public int[] SortMerge(int[] arr) {

        if (arr.length < 2) return arr;

        //Делим на 2 части
        int middle = arr.length / 2;    // 3/2=1;  1/2=0
        int[] arrLeft = Arrays.copyOfRange(arr, 0, middle);
        int[] arrRight = Arrays.copyOfRange(arr, middle, arr.length);

        return Merging(SortMerge(arrLeft), SortMerge(arrRight));
    }




    //делаем слияние, этот метод сливает 2 отсортированных массива в 1 отсортированный

    public int[] Merging(int[] arrLeft, int[] arrRight) {

        int[] rezArr = new int[arrLeft.length + arrRight.length];
        int arrLeftInd = 0;
        int arrRightInd = 0;
        int rezArrInd = 0;

        while ((arrLeftInd < arrLeft.length) && (arrRightInd < arrRight.length)) {
            rezArr[rezArrInd++] = arrLeft[arrLeftInd] < arrRight[arrRightInd] ? arrLeft[arrLeftInd++] : arrRight[arrRightInd++];
        }

        while (arrLeftInd < arrLeft.length) {
            rezArr[rezArrInd++] = arrLeft[arrLeftInd++];        //эти два варианта добирают остатки большего  массива, если массивы не равны
        }

        while (arrRightInd < arrRight.length) {
            rezArr[rezArrInd++] = arrRight[arrRightInd++];
        }

        return rezArr;
    }

}

/*
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(read.readLine());
    int b = Integer.parseInt(read.readLine());

    */