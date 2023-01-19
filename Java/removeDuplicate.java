public class removeDuplicate {
    public static void printList(int list[]) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + ", ");
    }

    public static int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            while (r + 1 < nums.length && nums[r + 1] == nums[r])
                r++;
            nums[l] = nums[r];
            l++;
            r++;
        }

        return l;
    }

    public static void main(String args[]) {
        int[] x = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(x));
        printList(x);

    }
}