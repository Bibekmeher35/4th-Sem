import java.util.Scanner;
public class SumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), sum = 0, temp, digits = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        temp = sum;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = sum;

        boolean isPrime = sum > 1, isArmstrong = false, isPerfect = false;
        for (int i = 2; i <= Math.sqrt(sum); i++) if (sum % i == 0) isPrime = false;

        int armSum = 0;
        while (temp > 0) {
            armSum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        isArmstrong = (armSum == sum);

        int perfSum = 0;
        for (int i = 1; i < sum; i++) if (sum % i == 0) perfSum += i;
        isPerfect = (perfSum == sum);

        System.out.println("Sum of digits: " + sum);
        System.out.println("Prime: " + (isPrime ? "Y" : "N"));
        System.out.println("Armstrong: " + (isArmstrong ? "Y" : "N"));
        System.out.println("Perfect: " + (isPerfect ? "Y" : "N"));
        sc.close();
    }
}
