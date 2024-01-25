package pckg_github_cls_noop3;

import java.util.ArrayList;
import java.util.Arrays;

public class TestApp {

    public static void main(String[] args) {
        Integer[] ints = {23, 11, 0, -21, -100, 457, 43};
        ArrayList<Integer> aints = new ArrayList<>(Arrays.asList(ints));
        System.out.println(aints);
        ArrayListSeqDataStructure<Integer> arrayListSeqDataStructure = new ArrayListSeqDataStructure<>(aints);
        ClientForSeqDataStructure<Integer> client = new ClientForSeqDataStructure<>(arrayListSeqDataStructure);
//        client.emptyStructure();
//        System.out.println(aints);
        System.out.println("Is structure empty: " + client.isEmpty());
        System.out.println("Size of is: " + client.sizeOf());
        int element = client.fetchElementFromPosition(3);
        System.out.println(element);
//        int element = client.fetchElementFromPosition(3);
//        System.out.println(element);
        ArrayDataStructureOperator<Integer> arrayDataStructureOperator = new ArrayDataStructureOperator<>(ints);
        ClientForSeqDataStructure<Integer> clientForArray = new ClientForSeqDataStructure<>(arrayDataStructureOperator);
        System.out.println("Is empty: " + clientForArray.isEmpty());
        System.out.println("Size: " + clientForArray.sizeOf());
        System.out.println("Element from position: " + clientForArray.fetchElementFromPosition(3));
    }
}
