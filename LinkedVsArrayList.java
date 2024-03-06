import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedVsArrayList {

    public static void main(String[] args) {
        int[] inputSizes = {1000, 10000, 100000};

        for (int size : inputSizes) {
            System.out.println("Input Size: " + size);
            comparePerformance(size);
            System.out.println("--------------");
        }
    }

    private static void comparePerformance(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long arrayListAddTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        long linkedListAddTime = System.currentTimeMillis() - startTime;


        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        long arrayListGetTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.get(i);
        }
        long linkedListGetTime = System.currentTimeMillis() - startTime;


        System.out.println("ArrayList add time (ms): " + arrayListAddTime);
        System.out.println("LinkedList add time (ms): " + linkedListAddTime);
        System.out.println("ArrayList get time (ms): " + arrayListGetTime);
        System.out.println("LinkedList get time (ms): " + linkedListGetTime);
    }
}
