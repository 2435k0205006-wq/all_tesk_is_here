

import java.util.Random;
import java.util.Scanner;

public class codding1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("What is your name?");
        String ans1 = scan.nextLine();

        System.out.println("Who are you?");
        String ans2 = scan.nextLine();

        int lovePercent = random.nextInt(101); // от 0 до 100 включительно

        System.out.println("Result: " + ans1 + " and " + ans2 + " are " + lovePercent + "% in love!");
    }
}
