import java.util.Scanner;

public class CaloriesPerDay {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        double bodyWeight, caloriesPerDay;
        System.out.println("Enter your weight");
        bodyWeight=keyboard.nextDouble();
        caloriesPerDay=19*bodyWeight;
        System.out.println(caloriesPerDay);
    }
}
