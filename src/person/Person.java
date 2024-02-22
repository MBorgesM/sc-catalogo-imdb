package person;

public abstract class Person {
    private String name;
    private String birthDay;

    public Person(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }
}
