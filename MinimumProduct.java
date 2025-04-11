import java.util.Scanner;
import java.util.Arrays;

public class MinimumProduct {
    public static int findMinProduct(int[] arr) {
        Arrays.sort(arr);
        return arr[0] * arr[1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.next();
        scanner.close();
        
        int[] arr = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i) - '0';
        }
        int minProduct = findMinProduct(arr);
        System.out.println("Minimum Product: " + minProduct);
    }
}
