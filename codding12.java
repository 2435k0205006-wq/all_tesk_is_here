import java.util.ArrayList;

public class codding12 {
    public static void main(String[] args) {
        // Создаём список фильмов
        ArrayList<String> movies = new ArrayList<>();

        // Добавляем фильмы
        movies.add("Эйс Вентура: Розыск домашних животных");
        movies.add("Маска");
        movies.add("Тупой и ещё тупее");
        movies.add("Вечное сияние чистого разума");
        movies.add("Шоу Трумана");
        movies.add("Брюс Всемогущий");
        movies.add("Лжец, лжец");
        movies.add("Серьезно, сэр?");
        movies.add("Человек на Луне");
        movies.add("Доктор Дулиттл");

        // Выводим список фильмов
        System.out.println("Фильмы с Джимом Керри:");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }
    }
}
