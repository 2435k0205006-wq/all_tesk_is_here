import java.util.Stack;

public class staek {
    public static void main(String[] args) {

        // Двумерный массив
        String[][] apps = {
                {
                        "Instagram", "YouTube", "TikTok", "WhatsApp", "Telegram",
                        "Facebook", "Spotify", "Snapchat", "Twitter", "Gmail",
                        "Translater ", "Exsel", "Chrome", "Pinterest", "Powerpoint "
                },
                {
                        "1", "2", "3", "4", "5",
                        "6", "7", "8", "9", "10",
                        "11", "12", "13", "14", "15"
                }
        };

        Stack<String> stack = new Stack<>();


        stack.push("Пример 1");
        stack.push("Пример 2");


        for (int i = 0; i < 15; i++) {
            System.out.println(apps[0][i] + " — " + apps[1][i]);
        }

        System.out.println("\nСодержимое стека:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
