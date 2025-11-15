// Главный класс
public class codding11 {
    public static void main(String[] args) {
        // Создаем объект фильма с конкретной информацией
        Movie myMovie = new Movie();

        // Выводим информацию о фильме
        System.out.println("Название: " + myMovie.name);
        System.out.println("Жанр: " + myMovie.genre);
        System.out.println("Дата выпуска: " + myMovie.year);
        System.out.println("Рейтинг: " + myMovie.rating);
    }
}

// Класс Movie хранит информацию о фильме
class Movie {
    String name = "Titanic";      // Название фильма
    String genre = "Historical";  // Жанр
    int year = 2012;              // Дата выпуска
    double rating = 8.9;          // Рейтинг
}
