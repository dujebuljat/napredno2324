package pckg_github_cls_noop3;

public class OperationOnStructureCLS <E> {

    private SeqDataStructureOperations<E> seqDataStructureOperations;

    public OperationOnStructureCLS(SeqDataStructureOperations<E> seqDataStructureOperations) {
        this.seqDataStructureOperations = seqDataStructureOperations;
    }

    public void performClearAllOperation() {
        seqDataStructureOperations.deleteAllElements();
    }

    public boolean elementInStructure(E element) {
        return seqDataStructureOperations.containsElement(element);
    }

    public E getElementFromPosition(int indxPos) {
        return seqDataStructureOperations.getElementFromPosition(indxPos);
    }

    public int getSize() {
        return seqDataStructureOperations.sizeOfStructure();
    }

    public E removeElement(int indxPos) {
        return (E) seqDataStructureOperations.removeFromPosition(indxPos);
    }
}
