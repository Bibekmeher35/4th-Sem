import java.util.Scanner;
class five {
    public static void main(String[] args) {
        int N,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter X : ");
        N = sc.nextInt();
        double x = 0.00;
        for(i=0;i<N;i++){
            x = x + 1/(Math.pow(2, i));

            System.out.print(1/(Math.pow(2, i))+"+");
        }
        System.out.println(" ");
        System.out.print("Sum = "+x);

    }
}