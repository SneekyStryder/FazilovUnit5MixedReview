public class NumsRunner {
    public static void main(String[] args) {
        Nums myNum1 = new Nums(5, 10);
        System.out.println(myNum1.randBetween());
        Nums myNum2 = new Nums(8, 20);
        System.out.println(myNum2.randBetween());
        System.out.println(Nums.getTotalNums());

    }
}
