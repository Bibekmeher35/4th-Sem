import java.util.Scanner;
public class MoveZeros {
    public static void moveZerosToEnd(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        String input = scanner.next();
        scanner.close();
        
        int[] arr = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i) - '0';
        }
        moveZerosToEnd(arr);
        System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num);
        }
    }
}
