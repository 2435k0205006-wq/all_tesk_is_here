import java.util.Scanner;
public class codding26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" how much soms do you have? ");
        float som = sc.nextFloat ();
        System.out.println("what type of valuta  ");
        String type = sc.nextLine();

         float dollar = som * 0.011f;
        float tenge = som * 5.99f;
        float yuan = som * 0.081f;
        float ruble  = som * 0.93f;

        System.out.println("your money(soms) in dollar " + dollar);
        System.out.println("your money(soms) in ruble " + ruble);
        System.out.println("your money(soms) in tenge " + tenge);
        System.out.println("your money(soms) in yuan " + yuan);
    }
}