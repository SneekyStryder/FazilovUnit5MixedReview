public class WordsRunner {
    public static void main(String[] args) {
        System.out.println(Words.doesContain("ell", "hello"));
        System.out.println(Words.doesContain("ell", "hyper"));

        Words.printReverse("hello");
    }
}
