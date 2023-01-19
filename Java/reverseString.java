public class reverseString {

    public static void reverseStr(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            int right = s.length - 1 - i;
            char temp = s[right];
            s[right] = s[i];
            s[i] = temp;

        }
    }

    public static void printList(char list[]) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + ", ");
    }

    public static void main(String[] args) {
        char[] x = { 'h', 'e', 'l', 'l', 'o' };
        reverseStr(x);
        printList(x);
    }
}