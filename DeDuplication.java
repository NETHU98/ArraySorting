import java.util.Arrays;

import java.util.Scanner;

public class DeDuplication {
    static int removeDup(int arr[], int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];


        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{50, 11, 33, 21, 40, 50, 40, 40, 21};
        int length = arr.length;
        length = removeDup(arr, length);
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

            for (int k=0;k<arr.length-1;k++){
                if (arr[k] != arr[i+1]) {
                    arr[k]=arr[i];
                    k++;
                }
                arr[k]=arr[length-1];
            }


        }
        for (int a :arr) {
            System.out.print(a + " ");
                }
    }
}
