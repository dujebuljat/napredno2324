package pckg_github_cls_noop3;

public class ClientForSeqDataStructure<E> {

    private SeqDataStructureOperations<E> dataStructure;

    public ClientForSeqDataStructure(SeqDataStructureOperations<E> seq) {
        this.dataStructure = seq;
    }

    public void emptyStructure() {
        dataStructure.deleteAllElements();
    }

    public boolean elementInStructure (E element) {
        return dataStructure.containsElement(element);
    }

    public boolean isEmpty() {
        return dataStructure.structureisEmpty();
    }

    public E fetchElementFromPosition(int position) throws NullPointerException {
        E element = null;
        try {
            element = dataStructure.getElementFromPosition(position);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        }
        return element;
    }

    public int sizeOf() {
        return dataStructure.sizeOfStructure();
    }

    public E removeElementFromPosition(int position) {
        return dataStructure.removeFromPosition(position);
    }

    public void addElement(E element) {
        dataStructure.addNewElement(element);
    }
}
