import java.util.Scanner;

public class codding25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("write first number: ");
        int a = sc.nextInt();
        System.out.println("write second number: ");
        int b = sc.nextInt();

        sc.nextLine(); // очистка буфера

        System.out.println("write action (+, -, *, /): ");
        String res = sc.nextLine();

        int result;

        switch (res) {
            case "+":
                result = a + b;
                System.out.println("Answer is: " + result);
                break;
            case "-":
                result = a - b;
                System.out.println("Answer is: " + result);
                break;
            case "*":
                result = a * b;
                System.out.println("Answer is: " + result);
                break;
            case "/":
                result = a / b;
                System.out.println("Answer is: " + result);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
