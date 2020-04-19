package javadetails.collections;
import java.util.List;




/*
Write a program that reads the list of integer number separated by spaces from the standard input
 and then remove all numbers with even indexes (0, 2, 4, and so on).
  After, the program should output the result sequence in the reverse order.

Sample Input:
1 2 3 4 5 6 7

Sample Output:
6 4 2
*/
public class ListTask1 {

    public void ListOperation1(List<Integer> numList) {


        for(int i=numList.size()-1; i>=0; i--) {
            if (i % 2 == 1) {
                numList.remove(i);
            }else{
                System.out.printf(" "+numList.get(i));

            }
        }

    }
}
