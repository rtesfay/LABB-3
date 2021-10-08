import java.util.Scanner;

public class AgeCal {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int bornYear,currentYear,age;
        System.out.println("Enter the year you were born");
        bornYear=keyboard.nextInt();
        System.out.println("Enter the current year");
 currentYear=keyboard.nextInt();
 age=currentYear-bornYear;
        System.out.println("You were born in "+bornYear+"  and will be "+age+" this year");
    }
}
