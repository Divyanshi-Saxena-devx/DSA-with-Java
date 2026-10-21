package LinearSearch;
import java.util.Arrays;

public class SearchIn2DArray {
    static void main() {
        int[][] arr = {
                {34, 9, 61},
                {12, 20, 1, 16, 23},
                {18, 29, 78, 99, 3},
                {56, 5},
        };
        int target = 3;
        int[] ans = search(arr, target); //format of return value {row,col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) { // for(int ints : arr) {
            for (int col = 0; col < arr[row].length; col++) { // for(element : ints) {
                if(arr[row][col] > max){ // if(element > max) {
                    max = arr[row][col]; // max = element;
                }
            }
        }
        return max;
    }
}
