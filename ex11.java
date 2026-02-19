package week05;

public class ex11 {

    public static String swapWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {


            if (word.length() <= 1) {
                result.append(word);
            } else {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);

                result.append(last).append(middle).append(first);
            }

            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "This is PP2 Fall 2021";

        String result = swapWords(sentence);
        System.out.println(result);
    }
}
