class palindrome {
    public boolean isPalindrome(int x) {
        String numb = Integer.toString(x);

        for (int i = 0; i < numb.length() / 2; i++)
            if (numb.charAt(i) != numb.charAt(numb.length() - i - 1)) {
                return false;

            }

        return true;
    }
}