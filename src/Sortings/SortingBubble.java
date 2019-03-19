package Sortings;

public class SortingBubble
{
   private int[] ar;
   private int elems; //кол-во элементов в массиве

   public SortingBubble(int max) //конструктор класса получаем max
   {
      ar = new int[max];
      elems = 0;
   }

   public void insertToArr(int value)
   {
      ar[elems] = value;
      elems++;
   }

   public void printing()
   {
      for (int i=0;i<elems;i++)
      {
         System.out.println(ar[i]);
      }
      System.out.println("Окончание массива");
   }

   private void changePlace(int fst, int sec)
   //private потому что не вызываем извне класса, только из Sorter
   {
      int tmp = ar[fst];
      ar[fst] = ar[sec];
      ar[sec] = tmp;
   }

   public void Sorter(){     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
      for (int k = elems - 1; k >= 1; k--){  //обратный порядок чтоб поставить i<k во второй цикл
         for (int i = 0; i < k; i++){       //можно сделать прямой порядок, тогда во втором i < (elems -k)
            if(ar[i] > ar[i + 1])
               changePlace(i, i + 1);
         }
      }
   }

}

  // лгоритм пузырьковой сортировки является одним из самых медленных. Если массив состоит из N элементов,
// то на первом проходе будет выполнено N-1 сравнений, на втором N-2, далее N-3 и т.д.
// То есть всего будет произведено проходов: (N-1) + (N-2) + (N-3) + … + 1 = N x (N-1)/2
// Таким образом, при сортировке алгоритм выполняет около 0.5х(N^2) сравнений.
// Для N = 5 , количество сравнений будет примерно 10, для N = 10 количество сравнений вырастит до 45.
// Таким образом, с увеличением количества элементов сложность сортировки значительно увеличивается: