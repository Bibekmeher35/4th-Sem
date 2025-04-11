import java.util.Scanner;

public class Pattern_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int levels = sc.nextInt();

        // First pattern (letters)
        System.out.println("First Pattern:");
        for (int i = 1; i <= levels; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}