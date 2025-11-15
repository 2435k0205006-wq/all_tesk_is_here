import java.util.Scanner;

public class codding8 {
    public static void main(String[] args) {
        String[][] terminal = {
                {"Bayel", "Bayserkeev", "2007", "1234$"},
                {"Nuri", "Asanaliev", "3214", "1500$"},
                {"Islam", "Turdubekov", "0313", "2000$"},
                {"Aygerim", "Jolochieva", "6676", "1200$"},
                {"Dinara", "Bayserkeeva", "2006", "100000$"},
                {"Gulbayra", "Urmatova", "6789", "3576$"},
                {"Kubat", "Ozgorushew", "2009", "3679$"},
                {"Yuluz", "Matniazova", "2004", "4000$"},
                {"Bayel", "Bayserkeev", "2007", "1234$"},
                {"Bayel", "Bayserkeev", "2007", "1234$"},
        };

        Scanner scanner = new Scanner(System.in);
//------------------------------------------------------------------------------------------------------------
        while (true) {
            System.out.print("What is your name: ");
            String name = scanner.nextLine();
            System.out.print("What is your surname? ");
            String surname = scanner.nextLine();
            System.out.print("Password? ");
            String password = scanner.nextLine();

            // Проверка пользователя
            int userIndex = -1;
            for (int i = 0; i < terminal.length; i++) {
                if (terminal[i][0].equals(name) && terminal[i][1].equals(surname) && terminal[i][2].equals(password)) {
                    userIndex = i;
                    break;
                }
            }
//-------------------------------------------------------------------------------------------------------------
            if (userIndex == -1) {
                System.out.println(" Error ");
                continue;
            }

            // Пользователь найден, выводим состояние
            double balance = Double.parseDouble(terminal[userIndex][3].replace("$", ""));
            System.out.println("Your current balance: $" + balance);

            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Withdraw money");
                System.out.println("2. Deposit money");
                System.out.println("3. View account information");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера
//--------------------------------------------------------------------------------------------------------------
                switch (choice) {
                    case 1: // Снять деньги
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine(); // Очистка буфера
                        if (withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("You have withdrawn: $" + withdrawAmount);
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                        break;

                    case 2: // Положить деньги
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine(); // Очистка буфера
                        balance += depositAmount;
                        System.out.println("You have deposited: $" + depositAmount);
                        break;

                    case 3: // Информация о счете
                        System.out.println("Account Information:");
                        System.out.println("Name: " + terminal[userIndex][0] + " " + terminal[userIndex][1]);
                        System.out.println("Balance: $" + balance);
                        break;

                    case 4: // Выход
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
//---------------------------------------------------------------------------------------------------------