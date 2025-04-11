import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of levels: ");
        int levels = sc.nextInt();

        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= levels - i; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }

        sc.close();
    }
}
