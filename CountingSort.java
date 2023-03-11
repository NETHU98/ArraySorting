/**
 * @author nethmeeperera
 * @version 01/27/2023
 * CSC2720 Lab #21093
 * lab time : Wednesday 16:00-16:50
 * due on 01/29/2023
 */
import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = new int[]{50, 11, 33, 21, 40, 50, 40, 40, 21};

        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
        for (int a:arr){
            System.out.print(a+" ");
    }
 }
}
