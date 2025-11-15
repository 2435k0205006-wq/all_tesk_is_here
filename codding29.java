import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class codding29 {
    public static void main(String[] args) {

        // Двумерный массив: приложения и их последовательность
        String[][] apps = {
                {
                        "Instagram", "YouTube", "TikTok", "WhatsApp", "Telegram",
                        "Facebook", "Spotify", "Snapchat", "Twitter", "Gmail",
                        "Netflix", "Discord", "Chrome", "Pinterest", "Reddit"
                },
                {
                        "1", "2", "3", "4", "5",
                        "6", "7", "8", "9", "10",
                        "11", "12", "13", "14", "15"
                }
        };

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("Пример 1");
        stack.push("Пример 2");

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Элемент 1");
        queue.add("Элемент 2");

        // Вывод массива
        System.out.println("Массив приложений:");
        for (int i = 0; i < 15; i++) {
            System.out.println(apps[0][i] + " — " + apps[1][i]);
        }

        // Вывод стека
        System.out.println("\nСодержимое стека:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Вывод очереди
        System.out.println("\nСодержимое очереди:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
