import java.util.Scanner;

public class codding10  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the field (meters): ");
        double fieldLength = sc.nextDouble();

        System.out.print("Enter the width of the field (meters): ");
        double fieldWidth = sc.nextDouble();

        double fieldArea = fieldLength * fieldWidth;

        System.out.print("Enter the length occupied by one plant (meters): ");
        double plantLength = sc.nextDouble();

        System.out.print("Enter the width occupied by one plant (meters): ");
        double plantWidth = sc.nextDouble();

        double plantArea = plantLength * plantWidth;
        double totalPlants = fieldArea / plantArea;

        System.out.println("You can plant approximately " + (int) totalPlants + " plants on your field.");

        sc.close();
    }
}
