import java.util.Scanner;

public class Third {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int a = 50;
        boolean win = false;
        while (!win) {
            System.out.print("Is number greater than "+a+"?: ");
            int n = in.nextInt();
            if (n == 0) {
                System.out.print("Is number = "+a+"?: ");
                n = in.nextInt();
                if(n==0){
                    a = a/2;
                }
                if(n==1){
                    win = true;
                }
            }
            if (n == 1) {
                a = a*3/2;
            }
        }
        System.out.print("Win!Your number is"+ a);
    }
}
