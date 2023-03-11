/**
 * @author nethmeeperera
 * @version 01/18/2023
 * CSC2720 Lab #21093
 * lab time : Wednesday 16:00-16:50
 * due on 01/22/2023
 */
import java.util.Scanner;
public class BinarySearch {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {11, 21, 33, 40, 50};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer to search: ");
        int a= in.nextInt();
        int check = binarySearch(arr,a);


                if (check == -1) {
                    System.out.println("Fail to find the input number.");

                                  }
                else {
                    System.out.println("The input number is found at index " + check + " after " + (check + 1) + " checks.");
                     }

            }

            public static int binarySearch(int[] arr, int a) {
                int left = 0;
                int right = arr.length - 1;
                int check = 0;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (arr[mid] == a) {
                        return check;
                    } else if (arr[mid] < a) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                    check++;}
                return -1;
    }
}
