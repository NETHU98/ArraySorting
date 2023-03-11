/**
 * @author nethmeeperera
 * @version 02/18/2023
 * CSC2720 Lab #21093
 * lab time : Wednesday 16:00-16:50
 * due on 02/19/2023
 */
//part 01
public class QuickSort {


    public static void swap(int[] arr, int a, int b) {
        //swap elements method
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static int lastelement_change(int[] arr, int low, int high) {
        //make the last index is the highest element
        int last_element = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < last_element) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int l = lastelement_change(arr, low, high);
            quickSort(arr, low, l - 1);
            quickSort(arr, l + 1, high);
        }
    }

    //removing duplicate elements

    static int deduplication(int[] arr, int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }

    static void printArr(int[] arr, int size) {
        //print the array
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

    }


    public static void main(String[] args) {
        // write your code here
        int[] arr = {50, 11, 33, 21, 40, 50, 40, 40, 21};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        n = deduplication(arr, n);
        System.out.print(" ARRAY [] = "+"[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

    }
}
//part 02
/* 1. use single element array ex: arr[]={1};
   2. null input
   3. use an already sorted array
   4. use reversed array
*  */