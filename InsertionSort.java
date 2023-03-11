import java.util.Scanner;

public class InsertionSort {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int m = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > m) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = m;
        }
    }

    static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the.. ");
        System.out.print("size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        sort(arr);

        System.out.println("The sorted array: ");
        printArr(arr);
    }
}
