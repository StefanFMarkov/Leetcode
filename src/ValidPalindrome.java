public class ValidPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        boolean palindrome = isPalindrome(input);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        if (n <= 1)
            return true;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            char first = s.charAt(i);
            char second = s.charAt(j);
            if (!Character.isLetterOrDigit(first)) {
                i++;
            } else if (!Character.isLetterOrDigit(second)) {
                j--;
            } else {
                if (Character.toLowerCase(first) != Character.toLowerCase(second)) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}
