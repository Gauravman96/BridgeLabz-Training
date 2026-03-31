public class SearchWordInSentences {

  
    public static String searchSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a powerful language",
            "I love programming",
            "Data Structures and Algorithms are important",
            "Spring Boot is used for backend development"
        };

        String word = "algorithms";

        String result = searchSentence(sentences, word);

        System.out.println("Result: " + result);
    }
}
