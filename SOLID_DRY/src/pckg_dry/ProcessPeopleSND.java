package pckg_dry;

public class ProcessPeopleSND {

    private final ProcessListElements<Person> processorPeople;

    public ProcessPeopleSND() {
        this.processorPeople = new ProcessListElements<>();
    }

    public void addNewPerson(Person person) {
        processorPeople.addElement(person);
    }

    public void removePerson(Person person) {
        processorPeople.removeElement(person);
    }

    public void listAllPeople() {
        processorPeople.listAllElements();
    }
}
