import java.util.Scanner;

public class Fourth {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int m = in.nextInt();
        int s = 0;
        int p = 0;
        int b = 0;
        for(int l=1; l<=m; l++) {
            b=l;
            p=0;
            s=0;
            while (b!=0){
                int a = b % 10;
                b = b / 10;
                p++;
            }
            System.out.print(p);
            b=l;
            while (b!=0){
                int a = b % 10;
                b = b / 10;
                double aa = Math.pow(a, p);
                s += aa;
            }
            if (s == b) {
                System.out.print(s+"\n");
            }
        }
    }
}
