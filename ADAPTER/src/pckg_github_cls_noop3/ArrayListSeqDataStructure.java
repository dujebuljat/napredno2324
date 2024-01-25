package pckg_github_cls_noop3;

import java.util.ArrayList;

public class ArrayListSeqDataStructure<E> implements SeqDataStructureOperations<E> {

    private ArrayList<E> lst;

//    public Arra

    public ArrayListSeqDataStructure(ArrayList<E> lst) {
        this.lst = lst;
    }

    @Override
    public void deleteAllElements() {

        lst.clear();

    }

    @Override
    public boolean containsElement(E element) {
        return lst.contains(element);
    }

    @Override
    public boolean structureisEmpty() {
        return lst.isEmpty();
    }

    @Override
    public E getElementFromPosition(int position) {
        if (position < 0 || position > lst.size()-1) {
            throw new IndexOutOfBoundsException("Index out of bounds - max index for now is: " + (lst.size()-1));
        } else {
            return lst.get(position);
        }
    }

    @Override
    public int sizeOfStructure() {
        return lst.size();
    }

    @Override
    public E removeFromPosition(int position) {
        if (position < 0 || position > lst.size()-1) {
            throw new IndexOutOfBoundsException("Index out of bounds - max index for now is: " + (lst.size()-1));
        } else {
            return lst.remove(position);
        }
    }

    @Override
    public void addNewElement(E element) {
        lst.add(element);
    }
}
