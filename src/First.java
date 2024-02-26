import java.util.Scanner;

public class First {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if (n > 0){
            int s=0;
            for( int i=0; i<=n; i++){
                int a = n%10;
                n = n/10;
                s += a;
            }
            System.out.print("Sum = "+s);
        }
        else{
            System.out.print("error");
        }
    }
}
