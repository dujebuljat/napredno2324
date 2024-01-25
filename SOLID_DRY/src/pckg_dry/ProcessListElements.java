package pckg_dry;

import java.util.ArrayList;
import java.util.List;

public class ProcessListElements <E>{

    private final List<E> listOfElements;

    public ProcessListElements() {
        this.listOfElements = new ArrayList<>();
    }

    public void addElement(E element) {
        if(listOfElements.contains(element)) {
            System.out.println("Element is already in this list!");
        } else {
            listOfElements.add(element);
            System.out.println("New element is added to the list!");
        }
    }

    public void removeElement(E element) {
        if(listOfElements.contains(element)) {
            listOfElements.remove(element);
            System.out.println("Element is removed from the list!");
        } else {
            System.out.println("Unable to remove - element is not in the list!");
        }
    }

    public void listAllElements() {
        for (E element : listOfElements) {
            System.out.println(element);
        }
    }
}
