package Model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Programmer> programmers;

    public DataBase() {
        this.programmers = new ArrayList<>();
    }

    public void addProgrammerToDB(Programmer programmer) {
        if (programmer != null && !programmers.contains(programmer)) {
            programmers.add(programmer);
            System.out.println("Programmer added to DB!");
        } else {
            System.out.println("Unable to add programmer to DB!");
        }
    }

    public List<Programmer> getProgrammersFromDB() {
        return programmers;
    }
}
