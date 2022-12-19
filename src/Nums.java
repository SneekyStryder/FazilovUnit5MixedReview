public class Nums {
    private static int totalNums;
    private int int1;
    private int int2;

    public Nums(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
        totalNums++;
    }

    public int randBetween() {
        return (int) ((Math.random() * (int2 - int1 + 1)) + int1);
    }

    public static int getTotalNums() {
        return totalNums;
    }
}
