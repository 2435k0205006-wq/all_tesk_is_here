import java.util.Scanner;

public class codding27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How much soms do you have? ");
        float som = sc.nextFloat();
        sc.nextLine(); // очищаем буфер

        System.out.print("What type of valuta do you want (dollar, ruble, tenge, yuan): ");
        String type = sc.nextLine().toLowerCase();

        // массив с названиями валют
        String[] currencies = {"dollar", "ruble", "tenge", "yuan"};
        // массив с курсами валют к сому (в том же порядке!)
        float[] rates = {0.011f, 0.93f, 5.99f, 0.081f};

        boolean found = false;

        // ищем валюту в массиве
        for (int i = 0; i < currencies.length; i++) {
            if (type.equals(currencies[i])) {
                float result = som * rates[i];
                System.out.println("Your money in " + currencies[i] + ": " + result);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Unknown currency type!");
        }

        sc.close();
    }
}
