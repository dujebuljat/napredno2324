package pckg_simple_enum;

import java.util.Enumeration;

public class Test {

    public static void main(String[] args) {

        Client<Integer> client = new Client<>();
        Enumeration<Integer> enumeration = new Enumeration<Integer>() {
            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public Integer nextElement() {
                return null;
            }
        };
        client.setIterator(new AdapterEnumToIterator<>(enumeration));
        client.removeWithIterator();
    }
}
