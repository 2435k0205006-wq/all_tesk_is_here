
import java.util.Scanner;

public class codding22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What figure do you want to know?");
        String figure = input.nextLine().trim().toLowerCase();

        if (figure.equals("treyg")) {
            System.out.println("What is the side?");
            double side = input.nextDouble();
            System.out.println("What is the height?");
            double height = input.nextDouble();
            System.out.println("s = " + (0.5 * side * height));
            System.out.println("P = " + side + height );
        } else if (figure.equals("primog")) {
            System.out.println("Write first side of primog:");
            double side1 = input.nextDouble();
            System.out.println("Write second side of primog:");
            double side2 = input.nextDouble();

            System.out.println("s = " + (side1 * side2));
        } else if (figure.equals("cycle")) {
            System.out.println("Write radius of cycle:");
            double radius = input.nextDouble();
            System.out.println("s = " + (Math.PI * radius * radius));
        } else if (figure.equals("kvadrat")) {
            System.out.println("Write side of kvadrat:");
            double side = input.nextDouble();
            System.out.println("s = " + (side * side));
        } else if (figure.equals("romb")) {
            System.out.println("Write diameter1 of romb:");
            double d1 = input.nextDouble();
            System.out.println("Write diameter2 of romb:");
            double d2 = input.nextDouble();
            System.out.println("s = " + (d1 * d2 / 2.0));
        } else {
            System.out.println("Error: unknown figure");
        }

        input.close();
    }
}
