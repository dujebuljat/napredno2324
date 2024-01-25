package pckg_github_cls_noop3;

import java.util.stream.Stream;

public class ArrayDataStructureOperator<E> implements SeqDataStructureOperations<E> {

    private E[] arrStructure;

    public ArrayDataStructureOperator(E[] arrStructure) {
        this.arrStructure = arrStructure;
    }

    @Override
    public void deleteAllElements() {
        Stream.of(arrStructure).forEach(element -> element = null);
    }

    @Override
    public boolean containsElement(E element) {
        Stream.of(arrStructure).anyMatch(el -> el == element );
        return false;
    }

    @Override
    public boolean structureisEmpty() {
        boolean empty = false;
        if (arrStructure.length == 0) {
            empty = true;
        } else if (Stream.of(arrStructure).allMatch(el -> el == null)) {
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }

    @Override
    public E getElementFromPosition(int position) throws IndexOutOfBoundsException {
        if (position < 0 || position > arrStructure.length-1) {
            throw new IndexOutOfBoundsException("Index out of bounds - max index for now is: " + (arrStructure.length-1));
        } else {
            return arrStructure[position];
        }
    }

    @Override
    public int sizeOfStructure() {
        return arrStructure.length;
    }

    @Override
    public E removeFromPosition(int position) {
        if (position < 0 || position > arrStructure.length-1) {
            throw new IndexOutOfBoundsException("Index out of bounds - max index for now is: " + (arrStructure.length-1));
        } else {
            E element = arrStructure[position];
            arrStructure[position] = null;
            return element;
        }
    }

    @Override
    public void addNewElement(E element) {

    }
}
