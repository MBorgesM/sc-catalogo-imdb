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
    public void printDatails(){
        System.out.println("Nome do Diretor: " + getName());
        System.out.println("Data de Nascimento " + getBirthDay());
        System.out.println("Quantidade de Filmes Dirigidos: " + numberOfFilmsDirected);
    }
}
