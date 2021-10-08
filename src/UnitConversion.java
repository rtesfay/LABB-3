import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int number;
        System.out.println("Enter a number in centimeters");
        number=keyboard.nextInt();
        System.out.println("Number in inches is "+number*0.3937);
        System.out.println("Number in foot is "+number*0.0328);
    }
}
