package labs.khobfa.leetcode.microsoft;

public class PalindromeOptimized {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String s) {
        int i =0, j = s.length() - 1;

        while (i < j) {
            if(isAlphaNumeric(s.charAt(i))) {
                i++;
                continue;
            }

            if(isAlphaNumeric(s.charAt(j))) {
                j--;
                continue;
            }

            if(toLowerCase(s.charAt(i)) != toLowerCase(s.charAt(j)))
                return false;

            j--;
            i++;
        }

        return true;
    }

    private static char toLowerCase(char c) {
        if(c >= 'A' && c <= 'Z')
            c -= 'A' - 'a';
        return c;
    }

    private static boolean isAlphaNumeric(char c) {
        return (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9');
    }

    public static boolean isPalindromeLet(String s) {
        s = s.toLowerCase();
        int i=0, j=s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
