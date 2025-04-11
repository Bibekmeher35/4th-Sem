public class SwapWithoutThird {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}