import java.util.Scanner;

public class TableContents{
    public static void main(String[] args) {
        // создаём двумерный массив: [0] - название, [1] - описание
        String[][] projects = {
                {"codding1 ", "любовь и рандом  "},
                {"codding2", "матрица "},
                {"codding3", "рандомайзер привет  "},
                {"codding4", "логин "},
                {"codding5", "управление финансами "},
                {"codding6", " пранировщик дня "},
                {"codding7", "ctepen"},


        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите описание проекта для поиска:");
        String input = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < projects.length; i++) {
            if (projects[i][1].toLowerCase().contains(input.toLowerCase())) {
                System.out.println("Проект найден!");
                System.out.println("Название: " + projects[i][0]);
                System.out.println("Номер проекта: " + (i + 1));
                found = true;
                break; // если нужно найти только первый совпавший проект
            }
        }

        if (!found) {
            System.out.println("Проект с таким описанием не найден.");
        }

        scanner.close();
    }
}
