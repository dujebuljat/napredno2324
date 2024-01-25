package pckg_diamond;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User {

    protected String name;
    protected int id;
    private final ArrayList<Integer> usrNumbers;
    private static int cntID = 100;

    public User(String name) {
        this.usrNumbers = new ArrayList<>();
        this.id = cntID++;
        this.name = name;
    }

    public void addNewListElement(Integer element) {
        if (usrNumbers.contains(element)) {
            System.out.println("Element " + element + " already exists in the list.");
        } else {
            usrNumbers.add(element);
            System.out.println("Element " + element + " added to the list.");
        }
    }

//    public void setNewList(ArrayList<Integer> newInts) {
//        this.usrNumbers = newInts;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", usrNumbers=" + usrNumbers +
                '}';
    }

    public void info(Set<String> stringSet) {
        System.out.println(stringSet);
    }

    public void info(List<Integer> listInteger) {
        System.out.println(listInteger);
    }

    public void performSomething() {
        System.out.println(getClass().getSimpleName() + " performing something fundamental");
    }
}
