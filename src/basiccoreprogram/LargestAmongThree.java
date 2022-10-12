package basiccoreprogram;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Please enter the first number: ");
        int x = scan.nextInt();

        System.out.print(" Please enter the second number: ");
        int y = scan.nextInt();

        System.out.print(" Please enter the third number: ");
        int z = scan.nextInt();

        if (x >= y && x >= z)
            System.out.println("First Number :" +x + " is the largest number");
        else if (y >= x && y >= z)
            System.out.println("Second Number : "+y + " is the largest number");
        else System.out.println("Third Number :"+ z + " is the largest number");

        scan.close();
    }
}


