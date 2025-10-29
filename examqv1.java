import java.util.ArrayList;
import java.util.List;

public class examqv1 {
    public static void main(String[] args) {
       Movie movie1 = new Movie("inception", 2010, "Sci-fi",8.8 );
       Movie movie2 = new Movie("Titanik", 2019, "drama ",7.9 );
       Movie movie3 = new Movie("the revenant ", 2015, "Adventure ",8.8 );
       Movie movie4 = new Movie("Django", 2012, "western",8.4);
        Actor actor1 = new Actor("Leonardo DiCaprio");
        actor1.addMovie(movie1);
        actor1.addMovie(movie2);
        actor1.addMovie(movie3);
        actor1.addMovie(movie4);

        Actor actor2 = new Actor("Tom Hardy");
        actor2.addMovie(movie1);
        actor2.addMovie(movie3);

        Actor actor3 = new Actor("Kate Winslet");
        actor3.addMovie(movie2);

        // Список актёров
        List<Actor> actors = List.of(actor1, actor2, actor3);

        // Находим актёра, который снялся в наибольшем количестве фильмов
        Actor mostActive = findMostActiveActor(actors);

        // Вывод результатов
        System.out.println("=== Список актёров ===");
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " — фильмов: " + actor.getMovieCount());
        }

        System.out.println("\nАктёр с наибольшим количеством фильмов:");
        System.out.println(mostActive.getName() + " (" + mostActive.getMovieCount() + " фильмов)");
    }

    // ======== Метод для поиска самого активного актёра ========
    public static Actor findMostActiveActor(List<Actor> actors) {
        Actor best = null;
        int maxMovies = 0;

        for (Actor actor : actors) {
            if (actor.getMovieCount() > maxMovies) {
                maxMovies = actor.getMovieCount();
                best = actor;
            }
        }

        return best;
    }
}

class Movie {
    private String title;
    private int year;
    private String genre;
    private double rating;

    public Movie  (String title, int year, String genre, double rating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getGenre() {
        return genre;
    }
    public double getRating() {
        return rating;

    }
    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", year=" + year + ", genre=" + genre + ", rating=" + rating + '}';
    }
}

class Actor {
    private String name;
    private List<Movie> movies ;

    public Actor(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    public String getName() {
        return name;
    }
    public List<Movie> getMovies() {
        return movies;
    }
    public int getMovieCount() {
        return movies.size();
    }
    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", movies=" + movies + '}';
    }

}