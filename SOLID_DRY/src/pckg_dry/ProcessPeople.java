package pckg_dry;

import java.util.ArrayList;
import java.util.List;

public class ProcessPeople {

    private List<Person> people;

    public ProcessPeople(List<Person> people) {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (people.contains(person)) {
            System.out.println("Person is already in this list!!");
        } else {
            people.add(person);
            System.out.println("New person added to the list!");
        }
    }

    public void removePerson(Person person) {
        if(people.contains(person)) {
            people.remove(person);
            System.out.println("Person is removed from the list!");
        } else {
            System.out.println("Unable to remove - person is not in the list!");
        }
    }

    public void listAllFromList() {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
