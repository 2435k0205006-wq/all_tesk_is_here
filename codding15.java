import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Film {
    private String title;
    private String genre;
    private int year;

    public Film(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Название: " + title + ", Жанр: " + genre + ", Год: " + year;
    }
}

public class codding15 {
    private static List<Film> films = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Меню CinemaBase ---");
            System.out.println("1. Добавить фильм");
            System.out.println("2. Показать все фильмы");
            System.out.println("3. Обновить фильм");
            System.out.println("4. Удалить фильм");
            System.out.println("5. Сортировать по году");
            System.out.println("6. Поиск по жанру");
            System.out.println("0. Выйти");
            System.out.print("Выберите действие: ");

            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Введите число от 0 до 6!");
                continue;
            }

            switch (choice) {
                case 1 -> addFilm();
                case 2 -> showFilms();
                case 3 -> updateFilm();
                case 4 -> deleteFilm();
                case 5 -> sortByYear();
                case 6 -> searchByGenre();
                case 0 -> {
                    System.out.println("Выход...");
                    return;
                }
                default -> System.out.println("Неверный выбор!");
            }
        }
    }

    private static void addFilm() {
        System.out.print("Введите название: ");
        String title = scanner.nextLine();
        System.out.print("Введите жанр: ");
        String genre = scanner.nextLine();
        int year;
        while (true) {
            System.out.print("Введите год: ");
            try {
                year = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число для года!");
            }
        }
        films.add(new Film(title, genre, year));
        System.out.println("Фильм добавлен!");
    }

    private static void showFilms() {
        if (films.isEmpty()) {
            System.out.println("Фильмы отсутствуют.");
            return;
        }
        System.out.println("\nСписок фильмов:");
        films.forEach(System.out::println);
    }

    private static void updateFilm() {
        System.out.print("Введите название фильма для обновления: ");
        String title = scanner.nextLine();
        for (Film film : films) {
            if (film.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Новое название: ");
                film.setTitle(scanner.nextLine());
                System.out.print("Новый жанр: ");
                film.setGenre(scanner.nextLine());
                int year;
                while (true) {
                    System.out.print("Новый год: ");
                    try {
                        year = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Введите корректное число для года!");
                    }
                }
                film.setYear(year);
                System.out.println("Фильм обновлен!");
                return;
            }
        }
        System.out.println("Фильм не найден!");
    }

    private static void deleteFilm() {
        System.out.print("Введите название фильма для удаления: ");
        String title = scanner.nextLine();
        boolean removed = films.removeIf(film -> film.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Фильм удален.");
        } else {
            System.out.println("Фильм не найден!");
        }
    }

    private static void sortByYear() {
        films.sort(Comparator.comparingInt(Film::getYear));
        System.out.println("Фильмы отсортированы по году:");
        showFilms();
    }

    private static void searchByGenre() {
        System.out.print("Введите жанр для поиска: ");
        String genre = scanner.nextLine();
        List<Film> result = films.stream()
                .filter(film -> film.getGenre().equalsIgnoreCase(genre))
                .toList();
        if (result.isEmpty()) {
            System.out.println("Фильмы с таким жанром не найдены.");
        } else {
            System.out.println("Найденные фильмы:");
            result.forEach(System.out::println);
        }
    }
}
