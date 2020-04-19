package javadetails.collections;
import java.util.List;
import java.util.Arrays;
/*
Given a sequence of strings separated by spaces. Read the sequence from the standard input and store all strings to the list.
Output the list to the standard output using System.out.println(yourList). The order of elements must be the same as in the input.
Sample Input:
Google Oracle JetBrains

Sample Output:
[Google, Oracle, JetBrains]
*/

public class ListTask2 {
    public void ListOperation2(String words) {
       /* List<String> StrList = new ArrayList<>();
        String[] singleWords = words.split(" ");
        for(int i=0; i <= singleWords.length-1; i++) {
            StrList.add(singleWords[i]);
        }*/
        /* Другой вариант*/
        List<String> StrList = Arrays.asList(words.split(" "));
        System.out.println(StrList);
    }
}
