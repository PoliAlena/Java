import java.util.Scanner;

public class Fifth {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the cart suit: ");
        int m = in.nextInt();
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        String[]  MM = {"пики","трефы","бубны","червы"};
        String[] NN ={"шестерка","семерка","восьмерка","девятка","десятка","валет","дама","король","туз"};

        if((m<=4) && (m>= 1) && (n<=14) && (n>=6)){
            String strN = NN[n-6];
            String  strM = MM[m-1];
            System.out.print("Ваша карта: "+strN+"  "+strM+"\n");
        }
        else{
            System.out.print("Error!");
        }
    }
}
