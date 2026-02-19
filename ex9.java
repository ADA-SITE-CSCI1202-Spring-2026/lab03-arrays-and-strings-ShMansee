package week05;


import java.util.Arrays;

public class ex9 {
    public static String sortLetters(String word) {
        char[] let = word.toCharArray();   
        Arrays.sort(let);
        return new String(let);
    }

    public static void main(String[] args) {
        String word = "baku";

        String result = sortLetters(word);
        System.out.println(result);
    }
}
