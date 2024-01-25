package pckg_simple_enum;

import java.util.Iterator;

public class Client <E> {

    private Iterator<E> iterator;

    public void setIterator(Iterator<E> iter) {
        this.iterator = iter;
    }

    public void iterateWithIterator() {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removeWithIterator() {
        iterator.remove();
    }
}
