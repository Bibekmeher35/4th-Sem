import java.util.Scanner;
class pattern_one{
    public static void main(String []args){
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        for(i=1;i<=x;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
                
            }
            //a++;
            System.out.println("");
        }


    }
}