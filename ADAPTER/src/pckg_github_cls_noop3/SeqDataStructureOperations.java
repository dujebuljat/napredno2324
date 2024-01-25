package pckg_github_cls_noop3;

public interface SeqDataStructureOperations<E> {

    void deleteAllElements();
    boolean containsElement(E element);
    boolean structureisEmpty();
    E getElementFromPosition(int position) throws IndexOutOfBoundsException;
    int sizeOfStructure();
    E removeFromPosition(int position);

    void addNewElement(E element);
//    E fetchElementFromPosition(int);
}
