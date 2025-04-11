import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("Non-Recursive Fibonacci:");
        nonRecursiveFibonacci(n);

        System.out.println("Recursive Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(recursiveFibonacci(i) + " ");
        }
        sc.close();
    }
    static void nonRecursiveFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    static int recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}