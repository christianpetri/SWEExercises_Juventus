package object;

import java.util.Objects;

/**
 * @author : ${user}
 * @since: ${date}
 *
 */
public class Person {

    private String Person;
    private int age;

    public Person(String person, int age) {
        Person = person;
        this.age = age;
    }

    public String getPerson() {
        return Person;
    }

    public int getAge() {
        return age;
    }

    public void setPerson(String person) {
        Person = person;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Person='" + Person + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(Person, person.Person);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Person, age);
    }
}

