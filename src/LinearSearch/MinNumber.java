package LinearSearch;

public class MinNumber {
    static void main() {
        int[] arr = {12, 3, 10, 2, -1, 0};
        System.out.println(min(arr));
    }
    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
