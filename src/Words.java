public class Words {
    public static boolean doesContain(String string1, String string2) {
        if (string2.indexOf(string1) >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printReverse(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.substring(i, i + 1) + " ");
        }
    }
}
