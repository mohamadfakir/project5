package basiccoreprogram;

import java.util.Scanner;

public class Harmonicnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0.0;

        System.out.println("Please Enter the Value of n");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("please enter a Positive value");
        }
        for (int i = 1; i <= n; i++) {
            sum += (1 / (double) i);
        }
        System.out.println(" The final Value is : " + sum);
    }
}