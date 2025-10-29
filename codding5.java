import java.util.Scanner;
public class codding5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your salary");
        double salary = sc.nextDouble();
        double savings = salary * 0.10;
        double food = salary * 0.50;
        double entertainment = salary * 0.30;
        double transport = salary * 0.10;

        // Вывод результата
        System.out.println("\nРекомендуемое распределение ваших расходов:");
        System.out.println("--------------------------------------------");
        System.out.printf("На черный день:      %.2f\n", savings);
        System.out.printf("На еду:              %.2f\n", food);
        System.out.printf("На развлечения:      %.2f\n", entertainment);
        System.out.printf("На транспорт:        %.2f\n", transport);
        System.out.println("--------------------------------------------");
        System.out.printf("Итого распределено:  %.2f\n", (savings + food + entertainment + transport));

        sc.close();


    }
}