import java.util.Scanner;
/**
 * @author nethmeeperera
 * @version 02/20/2023
 * CSC2720 HW  #21093
 * due on 02/21/2023
 */
public class ReverseArray {

    public static void main(String[] args) {


          Scanner in = new Scanner(System.in);

            //create array
            System.out.println("enter the size of the array: ");
            int size = in.nextInt();
            //test case if size is 0 or lower
            if(size < 0){
                System.out.print("please enter size grater then 0: ");
                size = in.nextInt();
            }
            int[] array = new int[size];

            //input array data
            System.out.println("enter numbers in the array: ");
            for (int i = 0; i < size; i++){
                array[i] = in.nextInt();
            }

            reverseArr(array);

            System.out.println("reversed array: ");
            printArr(array);

        }

        public static void reverseArr(int array[]){
            //swapping elements
            int mid = (array.length)/2;
            int end = array.length;

            for(int i = 0; i < mid; i++){
                end--;
                int temp = array[i];
                array[i] = array[end];
                array[end] = temp;

            }
        }
    //print reverse array
        public static void printArr(int arrayPrint[]){
            int n = arrayPrint.length;

            for (int i = 0; i < n; ++i){
                System.out.print(arrayPrint[i] + " ");
            }
    }
}
/*
Test Cases
1. null input
2.enter already reversed array
3. enter arrays with same number
4. array with duplicates
5. array with negative numbers

 */
