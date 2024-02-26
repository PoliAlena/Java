import java.util.Random;
import java.util.Scanner;
public class Second {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        Random rn = new Random();
        int a = rn.nextInt(9) + 1;
        while (n != a){
            if (n>a){
                System.out.print("The number less than your \n"+"Enter the number: ");
                n = in.nextInt();
            }
            if(n<a){
                System.out.print("The number greater than your\n"+"Enter the number: ");
                n = in.nextInt();
            }
            if(n==0){
                System.exit(0);
            }
        }
        System.out.print("You win!!!");
    }
}
