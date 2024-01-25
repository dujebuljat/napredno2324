package pckg_github_cls_noop3;

import java.util.ArrayList;

public class ArrayListLikeSequentalDataStructure<E> implements SeqDataStructureOperations<E>{

    private ArrayList<E> lst;

    public ArrayListLikeSequentalDataStructure(ArrayList<E> lst) {
        this.lst = lst;
    }

    public void setLst(ArrayList<E> lst) {
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
        return lst.get(position);
    }

    @Override
    public int sizeOfStructure() {
        return lst.size();
    }

    @Override
    public E removeFromPosition(int position) {
        return lst.remove(position);
    }

    @Override
    public void addNewElement(E element) {
        lst.add(element);
    }
}
