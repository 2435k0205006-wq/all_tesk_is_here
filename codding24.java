import java.util.Scanner;

public class codding24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Who are you? ");
        String ans = sc.nextLine().trim(); // .trim() убирает пробелы

        if (ans.equalsIgnoreCase("Student")) {
            System.out.print("Сколько вы набрали на ара-сынове? ");
            double araResult = sc.nextDouble();

            System.out.print("Сколько вы набрали за домашние задания? ");
            double dzResult = sc.nextDouble();

            System.out.print("Сколько вы набрали на финальном экзамене? ");
            double finalResult = sc.nextDouble();

            double commonResult = (araResult * 0.3 + dzResult * 0.2 + finalResult * 0.5);

            if (commonResult >= 69) {
                System.out.println("Поздравляем! Вы прошли. Ваш балл: " + commonResult);
            } else {
                System.out.println("К сожалению, вы не прошли. Ваш балл: " + commonResult);
            }

        } else if (ans.equalsIgnoreCase("Teacher")) {
            System.out.println("Welcome, teacher!");
        } else {
            System.out.println("Error: Unknown role.");
        }

        sc.close();
    }
}
