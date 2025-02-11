import java.util.Scanner;
class pattern_two{
    public static void main(String []args){
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        char A;
        for(i=1;i<=x;i++){
            for(j=i;j<=x;j++){
                System.out.print("* ");
                
            }
            System.out.println("");
        }


    }
}