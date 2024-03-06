import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorComparison {

    // Function to test accessing elements through indexing
    public static void Indexing(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
        }
    }

    // Function to test accessing elements through an iterator
    public static void Iterator(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
        }
    }

    public static void main(String[] args) {
        // Create a sample list with a large number of elements
        List<Integer> sampleList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            sampleList.add(i);
        }

        // Measure the time for accessing elements through indexing
        long indexingStartTime = System.currentTimeMillis();
        Indexing(sampleList);
        long indexingEndTime = System.currentTimeMillis();
        long indexingTime = indexingEndTime - indexingStartTime;

        // Measure the time for accessing elements through an iterator
        long iteratorStartTime = System.currentTimeMillis();
        Iterator(sampleList);
        long iteratorEndTime = System.currentTimeMillis();
        long iteratorTime = iteratorEndTime - iteratorStartTime;

        // Print the results
        System.out.println("Accessing elements through indexing took " + indexingTime + " milliseconds.");
        System.out.println("Accessing elements through an iterator took " + iteratorTime + " milliseconds.");
    }
}
