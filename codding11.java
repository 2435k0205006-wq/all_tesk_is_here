public class codding11 {
    public static void main(String[] args) {movie myMovie = new movie();

        // Выводим все поля на экран
        System.out.println("Название: " + myMovie.name);
        System.out.println("Жанр: " + myMovie.genre);
        System.out.println("Год: " + myMovie.year);
        System.out.println("Рейтинг: " + myMovie.rating);


    }
}
class movie {
    String name = "Terminator ";
    String genre = "fantasy";
    int year = 2008;
    double rating = 9.9;
}