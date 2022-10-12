package basiccoreprogram;

import java.util.Scanner;

public class EvenorOdd { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //int i = 0;
    System.out.println("Enter the Number X :");
    int i = scan.nextInt();
    if (i % 2 == 0)
        System.out.println("Given number is Even");

    else if (i % 2 != 0)
        System.out.println("Given Number is Odd");

    else
        System.out.println("Enter Valid Number");
}

}
