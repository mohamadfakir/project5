package basiccoreprogram;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        Scanner scan = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter the letter to Check");

        char c = scan.next().charAt(0);

        for (int i = 0; i < 5; i++) {
            if (c == vowels[i]) {
                flag = 1;
            }
        }
        if (flag == 0)
            System.out.println("It is a consonant");
        else System.out.println(" It is a Vowel");
        scan.close();
    }
}
