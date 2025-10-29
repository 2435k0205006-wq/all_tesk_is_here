import java.util.Random;

public class codding3{
    public static void main(String[] args) {
        String[] names = {"Bayel", "Nurislam", "Belel", "Gulbayra", "Shain", "Aynazik", "Zyyra", "Bektur", "Bilimbay", "Musa"};
        String[] greeting = {"merhaba", "hello", "kanday", "privet", "zdravstvuy", "nihayma", "hallo", "monjur", "assalamyaleykum", "konuchua"};

        Random random = new Random();

        for (String name : names) {

            String randomGreeting = greeting[random.nextInt(greeting.length)];
            System.out.println(name + " - " + randomGreeting);
        }
    }
}
