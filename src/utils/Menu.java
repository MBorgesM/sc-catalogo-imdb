package utils;

public class Menu {
    public static void welcomeMessage() {
        System.out.println("Welcome to the Movie Catalog System!");
    }

    public static void invalidOptionMessage() {
        System.out.println("Invalid Option. Press Enter to continue.");
    }

    public static void exitMessage() {
        System.out.println("Thanks for using our system!");
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void options() {
        System.out.println("""
                Options:
                1 - View Registered Movies
                2 - Manage Movies
                3 - Manage Persons
                4 - Search Movie by Title
                5 - Exit
                """);
    }

    public static void manageMovieOptions() {
        System.out.println("""
                1 - Create Movie
                2 - Delete Movie
                3 - Associate Director with Movie
                4 - Add Actor to Movie Casting
                """);
    }

    public static void managePersonOptions() {
        System.out.println("""
                1 - Create Actor
                2 - Create Director
                3 - View Person
                4 - Delete Person
                """);
    }
}
