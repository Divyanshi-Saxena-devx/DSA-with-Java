package Arrays_and_ArrayList;

import java.util.Arrays;
public class Swap {
    static void main() {
        int[] arr = {2, 18, 24, 30, 41};
        swap(arr, 0, 3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
