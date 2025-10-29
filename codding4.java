import java.util.Scanner;

public class codding4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Who are you?");
        String ans = scan.nextLine();

        if (ans.equals("BB")) {
            System.out.println("Password?");
            String password = scan.nextLine();

            if (password.equals("12345")) {
                System.out.println("I love my baby");
            } else {
                System.out.println("Wrong password!");
            }
        } else {
            System.out.println("Who are you? Error!");
        }

    }
}
