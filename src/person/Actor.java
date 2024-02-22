package person;

public class Actor extends Person {
    private String awards;

    public Actor(String name, String birthDay, String awards) {
        super(name, birthDay);
        this.awards = awards;
    }



    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Nome do ator: " + getName() + "\n" +
                "Data de Nascimento: " + getBirthDay() + "\n" +
                "Prêmios: " + getAwards();
    }
}
