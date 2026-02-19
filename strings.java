package week05;

public class strings {

    public static String reverse(String text) {
        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String word = "hello";

        String result = reverse(word);
        System.out.println(result);
    }
}
