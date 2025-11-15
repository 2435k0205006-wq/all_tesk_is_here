import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class codding30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();

        System.out.println("Введите 3 числа для дека:");

        // Вводим 3 числа и кладём в конец дека
        for (int i = 0; i < 3; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            int num = scanner.nextInt();
            deque.addLast(num); // кладём в конец
        }

        System.out.println("\nДек после ввода чисел: " + deque);

        // Добавим число в начало дека
        System.out.print("\nВведите число, чтобы добавить его в начало дека: ");
        int numStart = scanner.nextInt();
        deque.addFirst(numStart);

        System.out.println("Дек после добавления числа в начало: " + deque);

        // Убираем элементы с начала и конца
        int first = deque.removeFirst();
        System.out.println("\nУбрали с начала: " + first);

        int last = deque.removeLast();
        System.out.println("Убрали с конца: " + last);

        System.out.println("\nДек после удаления элементов: " + deque);
    }
}
