import java.util.Scanner;
public class NumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Binary: " + toBinary(num));
        System.out.println("Hexadecimal: " + toHexadecimal(num));
        sc.close();
    }
    static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.append(num % 2);
            num /= 2;
        }
        return binary.reverse().toString();
    }
    static String toHexadecimal(int num) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
         '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            hex.append(hexChars[num % 16]);
            num /= 16;
        }
        return hex.reverse().toString();
    }
}
