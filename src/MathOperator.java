import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        int A,B,C,X,Y,R;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter A");
        A=keyboard.nextInt();
        System.out.println("Enter B");
        B=keyboard.nextInt();
        System.out.println("Enter C");
        C=keyboard.nextInt();
        System.out.println(Math.sqrt((Math.pow(B,2))+4*A*C));   //Question1-a
    }
}
