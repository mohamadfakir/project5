package basiccoreprogram;

import java.util.Scanner;

public class FlipCoin {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double coin;
    double tails = 0;
    double heads = 0;
    System.out.print("Number of times Coin to Flip:");
    int n = scan.nextInt();

    if (n < 0) {
        System.out.println("Enter Positive Number");
    }
    for (int i = 0; i < n; i++) {
        coin = Math.random();
        if (coin > 0.5) {
            System.out.println("We flipped to heads");
            heads++;
        } else {
            System.out.println("We flipped to tails");
            tails++;
        }

    }

    System.out.println("Percentage of heads(" + heads + ":" + (heads / n * 100));
    System.out.println("Percentage of tails(" + tails + ": " + (tails / n * 100));
}
}

