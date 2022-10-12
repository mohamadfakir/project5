package basiccoreprogram;

import java.util.Scanner;

public class SwapToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int x = scan.nextInt();

        System.out.println("Enter the First Number : ");
        int y = scan.nextInt();

        System.out.println(" The two numbers are: " + x + "  " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println(" The two numbers are: " + x + "  " + y);

    }
}
