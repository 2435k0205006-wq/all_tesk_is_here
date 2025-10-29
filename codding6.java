import java.util.Scanner;
public class codding6{
    public static void main(String[] args) {
        int [] time = {6,7,8,9,12,16,17,18,22,23};
        String [] actions = {
                "wake up",
                "read namaz ",
                "have a shower and start to read ",
                "preaper yourself and go to univer",
                "leaf the lesson ",
                "go to programming courss",
                "finish the programmming course ",
                "go to work(library)",
                "finish your work",
                "last one is go to bed ",
        };

        Scanner sc = new Scanner(System.in);
        System.out.println(" what time is it ?");
        int inputHour = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < time.length; i++) {
            if (time[i] == inputHour) {
                System.out.println("В " + inputHour + ":00 - " + actions[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Для этого часа действие не задано.");
        }

        }
    }
