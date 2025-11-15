 import java.util.Scanner;
public class codding9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many bal did you take on the ara test?");
        int ara = sc.nextInt();
        System.out.println("How many food did you take on the dz");
        int dz = sc.nextInt();
        System.out.println("How many transport did you take on final ?");
        int fnl = sc.nextInt();

        double r1 = ara * 0.30;
        double r2 = dz * 0.20;
        double r3 = fnl * 0.50;

        System.out.println(" Result: " + (r1 + r2 + r3));

    }
}
