import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class KWSingleLinkedList {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Dick");
        names.add("Harry");
        names.add("Sam");
        names.addFirst("Bill");
        names.add(4,"Sue");
        names.removeFirst();
        names.remove(4);
        System.out.println(names);
    }
}
