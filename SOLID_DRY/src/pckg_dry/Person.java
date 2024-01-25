package pckg_dry;

public class Person {

    private String name;
    private int ID;
    private static int cntID = 100;

    public Person(String name) {
        this.name = name;
        this.ID = ++cntID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
