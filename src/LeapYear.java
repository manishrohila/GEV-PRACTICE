import java.util.Scanner;

public class LeapYear {
    public void leapYearCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        boolean isLeapYear=false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true; // Divisible by 400
                }
            } else {
                isLeapYear = true; // Divisible by 4 but not by 100
            }
        }
        if(isLeapYear){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }

    }
}
