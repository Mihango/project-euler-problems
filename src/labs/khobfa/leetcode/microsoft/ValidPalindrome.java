package labs.khobfa.leetcode.microsoft;

public class ValidPalindrome {
    public static void main(String[] args) {
//        String input = "A man, a plan, a canal: Panama";
        String input = "abb"; // "race a car";
        boolean result = validPalindrome(input);
        System.out.println("Is palindrome >>> " + result);
    }

    public static boolean validPalindrome(String palindrome) {
        boolean isPalindrome = true;
        palindrome = palindrome
                .replaceAll("[^A-Za-z0-9]", "")
                .toLowerCase();

        char[] data = palindrome.toCharArray();
        int i = 0;
        int n = data.length;
        int mid = n / 2;

        if(n % 2 != 0 && n > 3) {
            mid -= 1;
        }

         while (i < mid) {
             if(data[i] != data[n-i-1]) {
                 isPalindrome = false;
                 break;
             }
             i++;
         }

        return isPalindrome;
    }
}
