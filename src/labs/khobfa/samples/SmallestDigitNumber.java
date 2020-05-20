package labs.khobfa.samples;

public class SmallestDigitNumber {

    public static void main(String[] args) {
        System.out.println("Find smallest >>> " + findSmallest(346));
        System.out.println("Find smallest >>> " + findSmallest(-36));
        System.out.println("Find smallest >>> " + findSmallest(-6));
    }

    public static int findSmallest(int num) {
        int length = String.valueOf(num).length();
        int result =  length > 1 ? (int)Math.pow(10, length-1) : 0;
        return result; //num > 0 ? result : -result;
    }
}
