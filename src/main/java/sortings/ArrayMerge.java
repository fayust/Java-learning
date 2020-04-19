package sortings;


/*
Даны два отсортированных массив. Как без сортировки их объединить в третий массив?
Решение этой задачи сводится к последовательному сравнению элементов из левого и правого массива.
Если элемент меньше, то его помещают в новый массив, при этом сдвигают указатель.
Это решение является фазой слияния в сортировке слиянием.

*/

public class ArrayMerge {

    public int[] arrMerge(int[] first, int[] second) {

        int[] rezArr = new int[first.length + second.length];
        int rez = 0;
        int fst = 0;
        int sec = 0;
        while ((fst < first.length)  && (sec < second.length)) {
               rezArr[rez++] = (first[fst] < second[sec]) ? first[fst++] : second[sec++];
        }
        while (fst < first.length) {
            rezArr[rez++] = first[fst++];          //обрабатываем ситуации когда один массив
        }
        while (sec < second.length) {                 //закончился а второй нет
                rezArr[rez++] = second[sec++];
        }
        return rezArr;
    }
}

/*
    public int[] ArrayMerg(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int rslPoint = 0;
        while (leftPoint + rightPoint != rsl.length) {
            if (leftPoint != left.length && rightPoint != right.length) {
                rsl[rslPoint++] = left[leftPoint] < right[rightPoint] ? left[leftPoint++] : right[rightPoint++];
            } else if (leftPoint != left.length) {
                rsl[rslPoint++] = left[leftPoint++];
            } else {
                rsl[rslPoint++] = right[rightPoint++];
            }
        }
        return rsl;
    }
    */