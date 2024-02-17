import Catalog.MovieCatalog;
import movie.Movie;
import person.Director;
import person.Person;
import utils.Menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        List<Movie> movies = new ArrayList<>();
        int option = 0;

        Menu.welcomeMessage();
        do {
            Menu.options();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    // Print Movies from Catalog
                    Movie movie1 = new Movie("t", LocalDate.now(), 4, "e", "terror", new Director("teste", "16/02", 5));
                    Movie movie2 = new Movie("t", LocalDate.now(), 4, "e", "terror", new Director("teste", "16/02", 5));
                    movies.add(movie1);
                    movies.add(movie2);
                    printMoviesFromCatalog(movies);
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

    private static void printMoviesFromCatalog(List<Movie> movies) {
        MovieCatalog movieCatalog = new MovieCatalog(movies);
        List<Movie> resultList = movieCatalog.list();
        for (Movie movie: resultList){
            System.out.println(movie.toString());
        }
    }
}