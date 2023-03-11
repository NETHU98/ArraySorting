import java.util.Arrays;
public class MergeSort {

    //removing duplicates
        static int removeDuplicates(int[] arr, int n) {
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
// merge sort
        public static void mergeSort(int[] arr) {
            if (arr == null || arr.length < 2) {
                return;
            }
            int n = removeDuplicates(arr, arr.length);
            mergeSort(arr, 0, n - 1);
        }

        private static void mergeSort(int[] arr, int left, int right) {
            if (left >= right) {
                return;
            }
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

        private static void merge(int[] arr, int left, int mid, int right) {
            int[] temp = new int[right - left + 1];
            int i = left, j = mid + 1, h = 0;
            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j]) {
                    temp[h++] = arr[i++];
                } else {
                    temp[h++] = arr[j++];
                }
            }
            while (i <= mid) {
                temp[h++] = arr[i++];
            }
            while (j <= right) {
                temp[h++] = arr[j++];
            }
            for (int m = 0; m < temp.length; m++) {
                arr[left + m] = temp[m];
            }
        }

        public static void main(String[] args) {
            int[] arr = {50, 11, 33, 21, 40, 50, 40, 40, 21};

            int n = arr.length;
            mergeSort(arr, 0, n - 1);

// printing out
            n = removeDuplicates(arr, n);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
}
