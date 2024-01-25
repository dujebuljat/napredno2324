package pckg_dry;

import java.util.ArrayList;
import java.util.List;

public class ProcessIntegers {

    private final List<Integer> integers;

    public ProcessIntegers() {
        this.integers = new ArrayList<>();
    }

    public void addInteger(int integer) {
        if(integers.contains(integer)) {
            System.out.println("Integer is already in this list!");
        } else {
            integers.add(integer);
            System.out.println("New integer added to the list!");
        }
    }

    public void removeInteger(int integer) {
        if(integers.contains(integer)) {
            integers.remove(integer);
            System.out.println("Integer is removed from the list!");
        } else {
            System.out.println("Unable to remove - integer is not in the list!");
        }
    }

    public void listAllFromList() {
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
