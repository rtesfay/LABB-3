import java.util.Scanner;

public class MathOperatorQ1c {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int X,Y;
        System.out.println("Enter X");
        X=keyboard.nextInt();
        System.out.println("Enter Y");
        Y=keyboard.nextInt();
        System.out.println(Math.cbrt(X*Y));
    }

}

