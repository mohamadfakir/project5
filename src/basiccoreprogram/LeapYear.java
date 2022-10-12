package basiccoreprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year = scan.nextInt();

        if ((year > 1000) && (year < 9999)) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Year " + year + "  is a Leap year");
            else
                System.out.println("Year " + year + "  is a not Leap year");
        } else {
            System.out.println("Enter Valid four digit year");
        }
    }
}
