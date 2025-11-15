import java.util.Scanner;

public class codding7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод числа
        System.out.print("Введите число: ");
        double base = input.nextDouble();

        // Ввод степени
        System.out.print("Введите степень: ");
        double exponent = input.nextDouble();

        // Возведение в степень
        double result = Math.pow(base, exponent);

        // Вывод результата
        System.out.println(base + " в степени " + exponent + " = " + result);
    }
}
