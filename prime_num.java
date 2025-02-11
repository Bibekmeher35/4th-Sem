import java.util.Scanner;
class prime_num {
    public static void main(String[] args) {
        int X,Y,N,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter X : ");
        X = sc.nextInt();
        if(X <= 0){
            System.out.print("Enter again. ");
        }
        System.out.print("Enter Y : "); 
        Y = sc.nextInt();
        if(Y <= 0){
            System.out.print("Enter again. ");
        }
        System.out.print("Enter N : ");
        N = sc.nextInt();
        if(N <= 0){
            System.out.print("Enter again. ");
        }
        int count=0;
        for(i=X;i<=Y;i++){
            for(j=2;j<=i;j++){
                if(i%j == 0){
                    break;
                }
            }
            if(i == j){
                System.out.println(j );
                count++;
            }
            if(count==N){
                break;
            }
        }
    }
}