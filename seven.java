import java.util.Scanner;
public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum=0;
        int a = number;
        while (a != 0) {
            int digit = a % 10;
            sum += digit;
            a /= 10;

        }
        //System.out.println("sum of digits: "+sum);
        //System.out.println("sum of digits: "+number);
        if(number%sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scanner.close();
    }
}