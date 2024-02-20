import Catalog.MovieCatalog;
import Catalog.PeopleCatalog;
import movie.Movie;
import utils.Menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        MovieCatalog movieCatalog = new MovieCatalog();
        PeopleCatalog peopleCatalog = new PeopleCatalog();

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
                    manageMovie(sc, movieCatalog, peopleCatalog);
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

    public static void manageMovie(Scanner sc, MovieCatalog movieCatalog, PeopleCatalog peopleCatalog) {
        int option = 0;

        Menu.clearConsole();
        do {
            Menu.manageMovieOptions();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    try {
                        Movie newMovie = createMovie(sc);
                        movieCatalog.addItem(newMovie);
                        Menu.movieCreatedSuccessfully();
                    } catch (ParseException e) {
                        System.err.println("Date format incorrect. The movie creation was interrupted");
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                default:
                    Menu.invalidOptionMessage();
                    sc.nextLine();
                    break;
            }
        } while (option != 5);
    }

    public static Movie createMovie(Scanner sc) throws ParseException {
        Menu.clearConsole();

        System.out.print("Insert the title: ");
        String title = sc.nextLine();

        System.out.print("\nInsert the release date in the format dd/MM/yyyy: ");
        String releaseDateString = sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(releaseDateString);

        System.out.print("\nInsert the budget: ");
        double budget = sc.nextDouble();
        sc.nextLine();

        System.out.print("\nInsert the country: ");
        String country = sc.nextLine();

        System.out.print("\nInsert the genre: ");
        String genre = sc.nextLine();

        return new Movie(title, date, budget, country, genre);
    }
}