package week05;

import java.util.Arrays;
import java.util.Scanner;

public class ex10 {

    public static boolean isAnag(String a, String b) {


        a = a.toLowerCase();
        b = b.toLowerCase();


        if (a.length() != b.length()) {
            return false;
        }


        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();


        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String s1 = input.nextLine();


        String s2 = input.nextLine();

        boolean result = isAnag(s1, s2);

        System.out.println(result);

        input.close();
    }
}
