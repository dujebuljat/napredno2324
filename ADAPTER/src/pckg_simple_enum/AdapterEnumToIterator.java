package pckg_simple_enum;

import java.util.Enumeration;
import java.util.Iterator;

public class AdapterEnumToIterator<E> implements Iterator<E> {

    private Enumeration<E> enumeration;

    public AdapterEnumToIterator(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("This operation is not supported with Enumeration!");
    }
}
