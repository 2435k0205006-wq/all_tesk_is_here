import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Movie {
    private String title;
    private String genre;
    private int year;

    public Movie(String title, String genre, int year) {
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

public class codding13 {
    private static List<Movie> movies = new ArrayList<>();
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
                case 1 -> addMovie();
                case 2 -> showMovies();
                case 3 -> updateMovie();
                case 4 -> deleteMovie();
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

    private static void addMovie() {
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
        movies.add(new Movie(title, genre, year));
        System.out.println("Фильм добавлен!");
    }

    private static void showMovies() {
        if (movies.isEmpty()) {
            System.out.println("Фильмы отсутствуют.");
            return;
        }
        System.out.println("\nСписок фильмов:");
        movies.forEach(System.out::println);
    }

    private static void updateMovie() {
        System.out.print("Введите название фильма для обновления: ");
        String title = scanner.nextLine();
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Новое название: ");
                movie.setTitle(scanner.nextLine());
                System.out.print("Новый жанр: ");
                movie.setGenre(scanner.nextLine());
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
                movie.setYear(year);
                System.out.println("Фильм обновлен!");
                return;
            }
        }
        System.out.println("Фильм не найден!");
    }

    private static void deleteMovie() {
        System.out.print("Введите название фильма для удаления: ");
        String title = scanner.nextLine();
        boolean removed = movies.removeIf(movie -> movie.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Фильм удален.");
        } else {
            System.out.println("Фильм не найден!");
        }
    }

    private static void sortByYear() {
        movies.sort(Comparator.comparingInt(Movie::getYear));
        System.out.println("Фильмы отсортированы по году:");
        showMovies();
    }

    private static void searchByGenre() {
        System.out.print("Введите жанр для поиска: ");
        String genre = scanner.nextLine();
        List<Movie> result = movies.stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .toList();
        if (result.isEmpty()) {
            System.out.println("Фильмы с таким жанром не найдены.");
        } else {
            System.out.println("Найденные фильмы:");
            result.forEach(System.out::println);
        }
    }
}
