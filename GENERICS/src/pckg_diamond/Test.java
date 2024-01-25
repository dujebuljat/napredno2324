package pckg_diamond;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Integer[] ints = {23, 1, 0, -11, 45, 789, 20};
        List<Integer> integers = Arrays.asList(ints);
//        List<User> users = new ArrayList<>();
//        users.add(new User("Stjepan"));
//        users.add(new User("Filipa"));
//        printList(users);
//        printList(integers);
        User user1 = new User("Petra");
        user1.addNewListElement(100);
        user1.addNewListElement(200);
        System.out.println("User: " + user1);
        Package<User> userPackage = new Package<>(user1, User.class);
        System.out.println(userPackage);
        user1.info(new HashSet<>());
    }

    private static <E> void printList(List<E> lista) {
        Iterator<E> iter = lista.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private static <E> void printList2(List<E> lst) {
        for(E element : lst) {
            System.out.println(element);
        }
    }

    private static <E> void printList3(List<E> lst) {
        for(int k = 0; k < lst.size(); k++) {
            System.out.println(lst.get(k));
        }
    }

    private static <K, V> void listMapElements(HashMap<K,V> map) {
        for(K key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
    }

    private static <K, V> void listMapElements2(HashMap<K, V> map) {
        for(Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
//    private static void printList(List<User> users) {
//        Iterator<User> iter = users.iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//    }
//
//    private static void printList(List<Integer> ints) {
//        Iterator<Integer> iter = ints.iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//    }
}
