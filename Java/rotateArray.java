
import java.util.*;

public class rotateArray {

    public static void rotate(int[] nums, int k) {

        int[] copy = Arrays.copyOf(nums, nums.length);
        int[] firstPart = Arrays.copyOfRange(copy, copy.length - k, copy.length);
        int[] secondPart = Arrays.copyOfRange(copy, 0, copy.length - k);
        for (int i = 0; i < k; i++) {
            nums[i] = firstPart[i];
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = secondPart[i - k];
        }

    }

    public static void printList(int list[]) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + ", ");
    }

    public static void main(String args[]) {
        int[] x = { 1, 2, 3, 4, 5, 6, 7 };

        rotate(x, 3);
        printList(x);
    }
}