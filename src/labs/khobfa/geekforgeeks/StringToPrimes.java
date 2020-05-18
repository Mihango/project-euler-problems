package labs.khobfa.geekforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToPrimes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertToPrimes("13499315")));
    }

    public static Object[] convertToPrimes(String value) {

        // check if string has any non numeric characters
        List<Integer> data = new ArrayList<>();

        int unIndexed = value.length() - 1;

        for (int i = value.length() - 1; i > 0; i--) {
            int subString = i == unIndexed? Integer.parseInt(String.valueOf(value.charAt(i))) : Integer.parseInt(value.substring(i, unIndexed));
            boolean isPrime = true;

            if(subString < 2) {
                continue;
            }

            for(int j =2; j < Math.sqrt(j); j++) {
                if(subString % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                unIndexed = i -1;
                data.add(subString);
            }
        }

        return data.toArray();
    }
}
