import java.util.*;

class Roli {
    private String title;
    private List<String> actors;

    public Roli(String title, List<String> actors) {
        this.title = title;
        this.actors = actors;
    }

    public String getTitle() { return title; }
    public List<String> getActors() { return actors; }
}

public class codding14 {
    public static void main(String[] args) {
        // Пример массива фильмов с реальными актёрами
        Roli[] roles = {
                new Roli("Top Gun", Arrays.asList("Tom Cruise", "Val Kilmer", "Kelly McGillis")),
                new Roli("Mission Impossible", Arrays.asList("Tom Cruise", "Ving Rhames", "Simon Pegg")),
                new Roli("The Mask", Arrays.asList("Jim Carrey", "Cameron Diaz")),
                new Roli("Bruce Almighty", Arrays.asList("Jim Carrey", "Morgan Freeman")),
                new Roli("Inception", Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page")),
                new Roli("The Wolf of Wall Street", Arrays.asList("Leonardo DiCaprio", "Jonah Hill", "Margot Robbie")),
                new Roli("Fight Club", Arrays.asList("Brad Pitt", "Edward Norton")),
                new Roli("Once Upon a Time in Hollywood", Arrays.asList("Leonardo DiCaprio", "Brad Pitt", "Margot Robbie")),
                new Roli("Jerry Maguire", Arrays.asList("Tom Cruise", "Renée Zellweger"))
        };

        // Считаем количество ролей каждого актера
        Map<String, Integer> actorCount = new HashMap<>();
        for (Roli role : roles) {
            for (String actor : role.getActors()) {
                actorCount.put(actor, actorCount.getOrDefault(actor, 0) + 1);
            }
        }

        // Находим актера с наибольшим количеством ролей
        String topActor = null;
        int maxRoles = 0;
        for (Map.Entry<String, Integer> entry : actorCount.entrySet()) {
            if (entry.getValue() > maxRoles) {
                maxRoles = entry.getValue();
                topActor = entry.getKey();
            }
        }

        System.out.println("Актёр с наибольшим количеством ролей: " + topActor + " (" + maxRoles + " ролей)");
    }
}
