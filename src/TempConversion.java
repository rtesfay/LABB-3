import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Enter temperature in degree celsius");
        celsius=keyboard.nextDouble();
        fahrenheit=1.8*celsius+32;
        System.out.println(fahrenheit);
    }
}
