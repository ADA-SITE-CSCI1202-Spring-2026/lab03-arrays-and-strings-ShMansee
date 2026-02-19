package week05;

public class arrstr {

    public static String boom(String word) {
        StringBuilder boom = new StringBuilder();

        for (int i = 1; i <= word.length(); i++) {
            boom.append(word, 0, i);
        }

        return boom.toString();
    }

    public static void main(String[] args) {
        String word = "Baku";

        String result = boom(word);
        System.out.println(result);
    }
}
