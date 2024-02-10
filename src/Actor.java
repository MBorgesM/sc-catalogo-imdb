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
    public void printDatails() {
        System.out.println("Nome do ator: " + getName());
        System.out.println("Data de Nascimento: " + getBirthDay());
        System.out.println("Prêmios: " + getAwards());

    }
}
