import java.util.Scanner;

public class codding31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер памяти (количество страниц): ");
        int memorySize = scanner.nextInt();

        System.out.print("Введите количество запросов страниц: ");
        int requestsCount = scanner.nextInt();

        int[] memory = new int[memorySize];       // массив страниц в памяти
        boolean[] useBit = new boolean[memorySize]; // бит использования
        int pointer = 0; // стрелка часов

        for (int i = 0; i < memorySize; i++) memory[i] = -1; // пустая память

        System.out.println("Введите последовательность запросов страниц:");
        int[] requests = new int[requestsCount];
        for (int i = 0; i < requestsCount; i++) {
            requests[i] = scanner.nextInt();
        }

        int pageFaults = 0;

        for (int page : requests) {
            boolean hit = false;

            // Проверяем, есть ли страница в памяти
            for (int i = 0; i < memorySize; i++) {
                if (memory[i] == page) {
                    useBit[i] = true; // страница использована
                    hit = true;
                    break;
                }
            }

            if (!hit) {
                // Ищем страницу для замены
                while (useBit[pointer]) {
                    useBit[pointer] = false; // даём второй шанс
                    pointer = (pointer + 1) % memorySize;
                }

                // Заменяем страницу
                memory[pointer] = page;
                useBit[pointer] = true;
                pointer = (pointer + 1) % memorySize;
                pageFaults++;
            }

            // Вывод текущего состояния памяти
            System.out.print("Память: ");
            for (int m : memory) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println("Количество промахов страниц (page faults): " + pageFaults);
    }
}
