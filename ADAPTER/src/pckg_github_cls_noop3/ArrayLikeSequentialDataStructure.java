package pckg_github_cls_noop3;

public class ArrayLikeSequentialDataStructure<E> implements SeqDataStructureOperations<E>{

    private E[] array;

    public ArrayLikeSequentialDataStructure(E[] array) {
        this.array = array;
    }

    @Override
    public void deleteAllElements() {

    }

    @Override
    public boolean containsElement(E element) {
        return false;
    }

    @Override
    public boolean structureisEmpty() {
        return false;
    }


    /**
     * 
     * @param position
     * @return
     */
    @Override
    public E getElementFromPosition(int position) {
        if(position <array.length) {
            return array[position];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
    }

    @Override
    public int sizeOfStructure() {
        return array.length;
    }

    @Override
    public E removeFromPosition(int position) {
        return null;
    }

    @Override
    public void addNewElement(E element) {

    }
}
