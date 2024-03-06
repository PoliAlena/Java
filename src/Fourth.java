import java.util.Scanner;

public class Fourth {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int m = in.nextInt();
        for(int l=1; l<=m; l++) {
            int s = 0;
            int p = 0;
            int b = l;
            while (b!=0){
                int a = b % 10;
                b = b / 10;
                p++;
            }
            b=l;
            while (b!=0){
                int a = b % 10;
                b = b / 10;
                double aa = Math.pow(a, p);
                s += aa;
            }
            if (s == l) {
                System.out.print(l+"\n");
            }
        }
    }
}
