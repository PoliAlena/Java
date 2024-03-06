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
        String strN = null;
        String strM = null;

        if((m<=4) && (m>= 1) && (n<=14) && (n>=6)){
            if(m==1){ strM = MM[0];}
            if(m==2){ strM = MM[1];}
            if(m==3){ strM = MM[2];}
            if(m==4){ strM = MM[3];}

            if(n==6){ strN = NN[0];}
            if(n==7){ strN = NN[1];}
            if(n==8){ strN = NN[2];}
            if(n==9){ strN = NN[3];}
            if(n==10){ strN = NN[4];}
            if(n==11){ strN = NN[5];}
            if(n==12){ strN = NN[6];}
            if(n==13){ strN = NN[7];}
            if(n==14){ strN = NN[8];}

            System.out.print("Ваша карта: "+strN+"  "+strM+"\n");
        }
        else{
            System.out.print("Error!");
        }
    }
}
