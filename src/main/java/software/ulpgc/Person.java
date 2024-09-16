package software.ulpgc;

import java.time.LocalDate;

public class Person {
    public static final int DaysPerYear = 365;
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge(){
        return toYears(birthDate.toEpochDay()-LocalDate.now().toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/ DaysPerYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + getAge() +
                '}';
    }
}
