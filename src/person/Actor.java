package person;

public class Actor extends Person {
    private String awards;

    public Actor(String name, String birthDay, String awards) {
        super(name, birthDay);
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Actor's Name: " + getName() + "\n" +
                "Date of Birth: " + getBirthDay() + "\n" +
                "Awards Won: " + awards;
    }
}
