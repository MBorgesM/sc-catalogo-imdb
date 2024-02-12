import utils.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        Menu.welcomeMessage();
        do {
            Menu.options();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    // Print Movies from Catalog
                    break;
                case 2:
                    // Print Manage Movie Options and get user input
                    break;
                case 3:
                    // Print Manage Persons Options and get user input
                    break;
                case 4:
                    // Get Movie title from user and execute movieCatalog.search(title)
                    break;
                case 5:
                    break;
                default:
                    Menu.invalidOptionMessage();
                    sc.nextLine();
                    break;
            }

            Menu.clearConsole();
        } while (option != 5);

        Menu.exitMessage();
        sc.close();
    }
}