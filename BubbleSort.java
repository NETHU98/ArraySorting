
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{50, 11, 33, 21, 40, 50, 40, 40, 21};
        int n = arr.length;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
