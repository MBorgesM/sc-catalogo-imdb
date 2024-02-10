public abstract class Person {
    private String name;
    private String birthDay;

    public Person(String nome, String dataNascimento) {
        this.name = nome;
        this.birthDay = dataNascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public abstract void printDatails();

}
