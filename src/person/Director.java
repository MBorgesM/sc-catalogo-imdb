package person;

public class Director extends Person {
    private int numberOfFilmsDirected;

    public Director(String name, String birthDay, int numberOfFilmsDirected) {
        super(name, birthDay);
        this.numberOfFilmsDirected = numberOfFilmsDirected;
    }

    public int getNumberOfFilmsDirected() {
        return numberOfFilmsDirected;
    }

    public void setNumberOfFilmsDirected(int numberOfFilmsDirected) {
        this.numberOfFilmsDirected = numberOfFilmsDirected;
    }

    @Override
    public String toString() {
        return "Director Name: " + getName() + "\n" +
                "Date of Birth: " + getBirthDay() + "\n" +
                "Number of Movies Directed: " + numberOfFilmsDirected;
    }
}
