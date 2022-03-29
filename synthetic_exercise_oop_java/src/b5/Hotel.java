package b5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> persons;

    public Hotel() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean delete(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return false;
        } else {
            this.persons.remove(person);
            return true;
        }
    }

    public int calculator(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        }
        return person.getRoom().getPrice() * person.getNumberRent();
    }

    public void show() {
        this.persons.forEach(p -> System.out.println(p.toString()));
    }
}
