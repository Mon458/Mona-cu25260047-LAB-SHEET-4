class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int count = words.length;

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Total Words: " + count);
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();

        String text = "Java is easy to learn";

        w.countWords(text);
    }
}
