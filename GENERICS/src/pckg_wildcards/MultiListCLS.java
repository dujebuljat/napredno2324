package pckg_wildcards;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS <E> {

    private final List<E> lista;

    public MultiListCLS() {
        this.lista = new ArrayList<>();
    }

    public void listElements1() {
        this.lista.forEach(e -> {
            System.out.println(e);
        });
    }

    public void listElements2() {
        for (E element : lista) {
            System.out.println(element);
        }
    }

    public void compareListLength(List<?> anotherList) {
        int differ = this.lista.size() - anotherList.size();
        if (differ > 0) {
            System.out.println("field list is larger...");
        } else if(differ < 0) {
            System.out.println("another list is larger...");
        } else {
            System.out.println("same size...");
        }
    }

    public void addElement(E element) {
        if (this.lista.contains(element)) {
            System.out.println("Element " + element + " already exists in the list.");
        } else {
            this.lista.add(element);
            System.out.println("Element " + element + " added to the list.");
        }
    }
}
