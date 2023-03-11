import java.util.Scanner;
public class SelectionSort {
    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
    }
    static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("size of the array: ");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.println("elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }


        sort(array);

        System.out.println("The sorted array: ");
        printArr(array);
    }
}
