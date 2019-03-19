package Sortings;

public class SortingBubble1 {

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(read.readLine());
    int b = Integer.parseInt(read.readLine());
    int c = Integer.parseInt(read.readLine());
    int d = Integer.parseInt(read.readLine());
    int e = Integer.parseInt(read.readLine());

    int arr[] = {a, b, c, d, e};
    bubbleSort(arr);
}

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
}
